package Controlador;

import Conexion.Conexion;
import Modelo.*;
import Vistas.Menu;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EquipoMiembrosData {

    private final Connection con;
    private static Miembro miembro = new Miembro();
    private static MiembroData miembroData = new MiembroData();
    
    private static Equipo equipo = new Equipo();
    private static EquipoData equipoData = new EquipoData();
    private static EquipoMiembros equipoMiembros = new EquipoMiembros();
    private static EquipoMiembrosData equipoMiembrosData = new EquipoMiembrosData();

    private static Proyecto proyecto = new Proyecto();
    
    public EquipoMiembrosData() {
        con = Conexion.getConexion();
    }

            /*|---------------------|*/
            /*|         CRUD        |*/
            /*|---------------------|*/
    
    public void guardarEquipoMiembros(EquipoMiembros equipo) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        String query = "INSERT INTO equipomiembros ( "
                + "rol, "
                + "fechaIncorporacion, "
                + "idEquipo, "
                + "idMiembro "
                + ") "
                + "VALUES (?, ?, ?, ?)";

        try {
            stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, equipo.getRol());
            stmt.setDate(2, Date.valueOf(equipo.getFecha_incorporacion()));
            stmt.setInt(3, equipo.getEquipo().getId_equipo());
            stmt.setInt(4, equipo.getMiembro().getId_miembro());

            stmt.executeUpdate();
            resultado = stmt.getGeneratedKeys();

            if (resultado.next()) {
                equipo.setId_equipo_miembros(resultado.getInt(1));
            }

            JOptionPane.showMessageDialog(null, " Registro guardado con exito ", "", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                resultado.close();
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR : " + ex.getMessage(), " ", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public EquipoMiembros buscarEquipoMiembros(int idEquipoMiembro){

   

        PreparedStatement stmt = null;
        ResultSet resultado = null;
        String query    = "SELECT * "
                        + "FROM EquipoMiembros "
                        + "WHERE idEquipoMiembros = ?";
                
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idEquipoMiembro);
            resultado = stmt.executeQuery();
            
            if ( resultado.next() ){
                int id = idEquipoMiembro;
                String rol = resultado.getString("rol");
                LocalDate fechaIncorporacion = resultado.getDate("fechaIncorporacion").toLocalDate();
                equipo = regerarEquipo(resultado.getInt("idEquipo"));
                miembro = regenerarMiembro(resultado.getInt("idMiembro"));
                
                equipoMiembros = new EquipoMiembros(idEquipoMiembro, rol, fechaIncorporacion, equipo, miembro);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "" , JOptionPane.ERROR_MESSAGE );
        }
        finally {
            try { 
                resultado.close(); 
                stmt.close(); 
            }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
        
        return equipoMiembros;
    }

    public EquipoMiembros buscarEquipoAndMiembros(int idMiembro , int idEquipo) {

        PreparedStatement stmt = null;
        ResultSet resultado = null;
        String query = "SELECT  em.*  "
                + "FROM EquipoMiembros AS em  "
                + "JOIN equipo AS e "
                + "ON em.idEquipo = e.idEquipo "
                + "JOIN miembro as m "
                + " ON  em.idMiembro = m.idMiembro "
                + "WHERE m.idMiembro = ? AND e.idEquipo = ? ";
        
        try {
            stmt = con.prepareStatement(query);
            stmt.setInt(1, idMiembro);
            stmt.setInt(2, idEquipo);
            resultado = stmt.executeQuery();

            if (resultado.next()) {
                int id = resultado.getInt("idEquipoMiembros");
                String rol = resultado.getString("rol");
                LocalDate fechaIncorporacion = resultado.getDate("fechaIncorporacion").toLocalDate();
                equipo = regerarEquipo(resultado.getInt("idEquipo"));
                miembro = regenerarMiembro(resultado.getInt("idMiembro"));

                equipoMiembros = new EquipoMiembros( id, rol,  fechaIncorporacion, equipo, miembro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                resultado.close();
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR : " + ex.getMessage(), " ", JOptionPane.ERROR_MESSAGE);
            }
        }

        return equipoMiembros;
    }

    public void actualizarEquipoMiembros(EquipoMiembros equipo) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        String query = "UPDATE EquipoMiembros "
                + "SET rol = ?, fechaIncorporacion = ?, idEquipo = ?, idMiembro = ? "
                + "WHERE idEquipoMiembros = ?";

        try {
            stmt = con.prepareStatement(query);
            stmt.setString(1, equipo.getRol());
            stmt.setDate(2, Date.valueOf(equipo.getFecha_incorporacion()));
            stmt.setInt(3, equipo.getEquipo().getId_equipo());
            stmt.setInt(4, equipo.getMiembro().getId_miembro());
            stmt.setInt(5, equipo.getId_equipo_miembros());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro actualizado", " ", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR : " + ex.getMessage(), " ", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void eliminarMiembros(int idEquipoMiembros) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        String query    = "DELETE FROM equipomiembros "
                        + "WHERE idEquipoMiembros = ?";

        try {
            stmt = con.prepareStatement(query);
            stmt.setInt(1, idEquipoMiembros);

            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado" + " " + JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ID ingresado incorrecto" + " " + JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR : " + ex.getMessage(), " ", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    
    
            /*|---------------------|*/
            /*|        Listas       |*/
            /*|---------------------|*/
    
    public List<EquipoMiembros> listarEquiposMiembros() {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<EquipoMiembros> listaEM = new ArrayList<EquipoMiembros>();

        String query    = "SELECT * "
                        + "FROM EquipoMiembros ";

        try {
            stmt = con.prepareStatement(query);
            resultado = stmt.executeQuery();

            while (resultado.next()) {
                int idLocal = resultado.getInt("idEquipoMiembros");
                String rol = resultado.getString("rol");
                LocalDate fechaIncorporacion = resultado.getDate("fechaIncorporacion").toLocalDate();
                equipo = regerarEquipo(resultado.getInt("idEquipo"));
                miembro = regenerarMiembro(resultado.getInt("idMiembro"));

                EquipoMiembros equipoN = new EquipoMiembros(rol, fechaIncorporacion, equipo, miembro);

                listaEM.add(equipoN);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR : " + ex.getMessage(), " ", JOptionPane.ERROR_MESSAGE);
            }
        }
        return listaEM;
    }

    public List<EquipoMiembros> listarMiembrosEquiposTabla(int idProyecto) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<EquipoMiembros> listaEM = new ArrayList<EquipoMiembros>();

        String query    = "SELECT EM.* "
                        + "FROM equipomiembros AS EM "
                        + "JOIN miembro AS M "
                        + "ON EM.idMiembro = M.idMiembro "
                        + "JOIN equipo AS E "
                        + "ON EM.idEquipo = E.idEquipo "
                        + "WHERE E.idProyecto = ? ";

        try {
            stmt = con.prepareStatement(query);
            stmt.setInt(1, idProyecto);
            resultado = stmt.executeQuery();
            while (resultado.next()) {
                int idLocal = resultado.getInt("idEquipoMiembros");
                String rol = resultado.getString("rol");
                LocalDate fechaIncorporacion = resultado.getDate("fechaIncorporacion").toLocalDate();
                miembro = regenerarMiembro(resultado.getInt("idMiembro"));
                equipo = regerarEquipo(resultado.getInt("idEquipo"));               
                EquipoMiembros miembrosDelEquipo = new EquipoMiembros(idLocal , rol, fechaIncorporacion, equipo, miembro);
                listaEM.add(miembrosDelEquipo);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                resultado.close();
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
            }
        }
        return listaEM;
    }
    
    public List<Equipo> listarEquiposHabilitados (){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<Equipo> listaEquipos = new ArrayList<Equipo>();

        String query    = "SELECT E.idEquipo, E.idProyecto, E.nombre, E.fechaCreacion, E.estado "
                        + "FROM equipomiembros AS EM "
                        + "JOIN equipo AS E "
                        + "ON EM.idEquipo = E.idEquipo "
                        + "WHERE E.estado = 1 ";

        try {
            stmt = con.prepareStatement(query);
            resultado = stmt.executeQuery();
            
            while (resultado.next()) {
                int idEquipo = resultado.getInt("idEquipo");
                proyecto = regenerarProyecto(resultado.getInt("idProyecto"));
                String equipoNombre = resultado.getString("nombre");
                LocalDate creacionLocal = resultado.getDate("fechaCreacion").toLocalDate();
                boolean estadoLocal = resultado.getBoolean("estado");
                
                Equipo miembrosDelEquipo = new Equipo (idEquipo, proyecto, equipoNombre, creacionLocal,estadoLocal);
                listaEquipos.add(miembrosDelEquipo);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                resultado.close();
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
            }
        }
        return listaEquipos;
    }

    
    
            /*|---------------------|*/
            /*|    Metodos extras   |*/
            /*|---------------------|*/
    
    public Equipo regerarEquipo(int idEquipo) {
        equipo = equipoData.buscarEquipoCompleto(idEquipo);
        return equipo;
    }

    public Miembro regenerarMiembro(int idMiembro) {
        miembro = miembroData.buscarMiembro(idMiembro);
        return miembro;
    }
    
    private Proyecto regenerarProyecto(int idProyecto){
        proyecto =  Menu.proyectoDataLocal.buscarProyecto(idProyecto);
        return proyecto;
    }

}
