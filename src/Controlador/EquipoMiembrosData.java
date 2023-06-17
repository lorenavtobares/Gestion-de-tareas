
package Controlador;

import Conexion.Conexion;
import Modelo.*;
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
            
    public EquipoMiembrosData() {
        con=Conexion.getConexion();
    }
    
    
    
                /*|---------------------|*/
                /*|         CRUD        |*/
                /*|---------------------|*/
    
    public void guardarEquipoMiembros(EquipoMiembros equipo){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "INSERT INTO equipomiembros ( "
                            + "rol, "
                            + "fechaIncorporacion, "
                            + "idEquipo, "
                            + "idMiembro "
                        + ") "
                        + "VALUES (?, ?, ?, ?)";
                        
        try{
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setString(1, equipo.getRol());
            stmt.setDate(2, Date.valueOf(equipo.getFecha_incorporacion()));
            stmt.setInt(3, equipo.getEquipo().getId_equipo());
            stmt.setInt(4, equipo.getMiembro().getId_miembro());
            
            stmt.executeUpdate();
            resultado = stmt.getGeneratedKeys();
            
            if( resultado.next()){
                equipo.setId_equipo_miembros(resultado.getInt(1));
            }
            
            JOptionPane.showMessageDialog(null, " Registro guardado con exito ", "" ,JOptionPane.INFORMATION_MESSAGE );
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
    }
    
<<<<<<< HEAD
    //Read
    public EquipoMiembros buscarEquipoMiembros(int idEquipoMiembro){
=======
    public EquipoMiembros buscarEquipoMiembros(int idEquipoMiebro){
>>>>>>> 91977b74953691383f372ac079272988f0a602f9
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
   
          
    
    
    
    
    public void actualizarEquipoMiembros(EquipoMiembros equipo){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "UPDATE EquipoMiembros "
                        + "SET rol = ?, fechaIncorporacion = ?, idEquipo = ?, idMiembro = ? "
                        + "WHERE idEquipoMiembros = ?";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setString(1, equipo.getRol());
            stmt.setDate(2, Date.valueOf(equipo.getFecha_incorporacion()));
            stmt.setInt(3, equipo.getEquipo().getId_equipo());
            stmt.setInt(4, equipo.getMiembro().getId_miembro());
            stmt.setInt(5, equipo.getId_equipo_miembros());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro actualizado"," ",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "" , JOptionPane.ERROR_MESSAGE );
        }
        finally {
            try { 
                stmt.close(); 
            }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
    }
    
    public void eliminarMiembros(int idEquipoMiembros){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "DELETE FROM EquipoMiembros "
                        + "WHERE idEquipoMiembros = ?";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idEquipoMiembros);
            
            if(stmt.executeUpdate() > 0){
                JOptionPane.showMessageDialog( null, "Registro eliminado"  + " " + JOptionPane.INFORMATION_MESSAGE );
            }else{
                JOptionPane.showMessageDialog( null, "ID ingresado incorrecto"  + " " + JOptionPane.ERROR_MESSAGE );
             }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "" , JOptionPane.ERROR_MESSAGE );
        }
        finally {
            try { 
                stmt.close(); 
            }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
    }
    
    
    
                /*|---------------------|*/
                /*|        Listas       |*/
                /*|---------------------|*/
    
    public List <EquipoMiembros> listarEquiposMiembros( ) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<EquipoMiembros> listaEM = new ArrayList<EquipoMiembros>(); 
        
        String query    = "SELECT * "
                        + "FROM EquipoMiembros ";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                int idLocal = resultado.getInt("idEquipoMiembros");
                String rol = resultado.getString("rol");
                LocalDate fechaIncorporacion = resultado.getDate("fechaIncorporacion").toLocalDate();
                equipo = regerarEquipo(resultado.getInt("idEquipo"));
                miembro = regenerarMiembro(resultado.getInt("idMiembro"));
                
                EquipoMiembros equipoN = new EquipoMiembros(rol, fechaIncorporacion, equipo, miembro);
                
                listaEM.add(equipoN);
            }   
        }
        catch ( SQLException ex ) 
        {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() , "" , JOptionPane.ERROR_MESSAGE);
        }
        finally {
            try { stmt.close(); }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
        return listaEM;
    }
    
    public List<EquipoMiembros> listarMiembrosEquiposTabla(int idEquipo){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<EquipoMiembros> listaEM = new ArrayList<EquipoMiembros>();
        
        String query        = " SELECT M.dni, M.apellido, M.nombre, EM.fechaIncorporacion, EM.rol, EM.idMiembro, EM.idEquipo " 
                            + " FROM equipomiembros AS EM " 
                            + " JOIN miembro AS M " 
                            + " ON EM.idMiembro = M.idMiembro "
                            + " JOIN equipo AS E " 
                            + " ON EM.idEquipo = E.idEquipo " 
                            + " WHERE EM.idEquipo = ? ";
        
        try{
            stmt = con.prepareStatement(query);
            stmt.setInt(1, idEquipo);
            resultado = stmt.executeQuery();
            while (resultado.next()) {                
                int dni = resultado.getInt("dni");
                String apellido = resultado.getNString("apellido");
                LocalDate fechaIncorporacion = resultado.getDate("fechaIncorporacion").toLocalDate();
                String rol = resultado.getString("rol");
                miembro = regenerarMiembro(resultado.getInt("idMiembro"));
                equipo = regerarEquipo(resultado.getInt("idEquipo"));
                EquipoMiembros miembrosDelEquipo = new EquipoMiembros(rol, fechaIncorporacion, equipo, miembro);
                listaEM.add(miembrosDelEquipo);
                
            }
        }
        catch ( SQLException ex ) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() ,"", JOptionPane.ERROR_MESSAGE );
        }
        finally {
            try {
                resultado.close();
                stmt.close();
            } catch ( SQLException ex ) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() ,"", JOptionPane.ERROR_MESSAGE );
            }
        }
        return listaEM;
    }


    
                /*|---------------------|*/
                /*|    Metodos extras   |*/
                /*|---------------------|*/

    public Equipo regerarEquipo(int idEquipo){
        equipo = equipoData.buscarEquipo(idEquipo);
        return equipo;
    }
    
    public Miembro regenerarMiembro(int idMiembro){
        miembro = miembroData.buscarMiembro(idMiembro);
        return miembro;
    }

}
