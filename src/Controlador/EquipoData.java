
package Controlador;

import Conexion.Conexion;
import Modelo.Equipo;
import Modelo.Proyecto;
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


public class EquipoData {
    private final Connection con;
    private static Proyecto proyecto = new Proyecto();
    private static ProyectoData proyectoData = new ProyectoData();
    private static Equipo equipo = new Equipo();
    private static EquipoData equipoData = new EquipoData();

    public EquipoData() {
        con = Conexion.getConexion();
    }

    

                /*|---------------------|*/
                /*|         CRUD        |*/
                /*|---------------------|*/
    
    public void GuardarEquipo(Equipo equipo){
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        String query        = "INSERT INTO equipo "
                            + "(idProyecto, nombre, fechaCreacion, estado) "
                            + "VALUES ( ?, ?, ?, 1 ) ";

        try{
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setInt(1, equipo.getProyecto().getId_proyecto());
            stmt.setString(2, equipo.getNombre());
            stmt.setDate(3, Date.valueOf(equipo.getFecha_cracion()));
            
            stmt.executeUpdate();
            resultado = stmt.getGeneratedKeys();
            
            if ( resultado.next() ) {
                equipo.setId_equipo(resultado.getInt(1));

            JOptionPane.showMessageDialog(null, " Equipo guardado con exito ", "" ,JOptionPane.INFORMATION_MESSAGE );

            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "Error al guardar Equipo" , JOptionPane.ERROR_MESSAGE );
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
    
    public Equipo buscarEquipo(int idEquipo){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        Equipo equipoN = null;
        
        String query        = "SELECT e.idProyecto, e.nombre, e.fechaCreacion, e.estado "
                            + "FROM equipo AS e "
                            + "JOIN proyecto AS p "
                            + "ON e.idProyecto = p.idProyecto "
                            + "WHERE e.idEquipo = ?";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idEquipo);
            resultado= stmt.executeQuery();
            
            if(resultado.next() ){
                int idLocal = idEquipo;
                proyecto = regenerarProyecto(resultado.getInt("idProyecto"));
                String nombreLocal = resultado.getString("nombre");
                LocalDate creacionLocal = resultado.getDate("fechaCreacion").toLocalDate();
                boolean estadoLocal = resultado.getBoolean("estado");
                
                equipoN = new Equipo(idLocal, proyecto, nombreLocal, creacionLocal, estadoLocal);
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontro el equipo solicitado.", "ERROR",JOptionPane.ERROR_MESSAGE);
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
        return equipoN;
    }
    
    public void actualizarEquipo(Equipo equipo){
        PreparedStatement stmt = null;
        
        String query    = "UPDATE equipo "      
                        + "SET idProyecto = ?, nombre = ?,  fechaCreacion = ? , estado = ? "
                        + "WHERE idEquipo = ? ";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, equipo.getProyecto().getId_proyecto());
            stmt.setString(2, equipo.getNombre());
            stmt.setDate(3, Date.valueOf(equipo.getFecha_cracion()));
            stmt.setBoolean(4, equipo.getEstado());
            stmt.setInt(5, equipo.getId_equipo());
           
            
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
    
    public void eliminarEquipo(int idEquipo){
        PreparedStatement stmt = null;
        
        String query        =" UPDATE equipo "
                            +" SET estado = false "
                            +" WHERE idEquipo = ? ";
        
        try{
             stmt = con.prepareStatement( query );
             stmt.setInt(1, idEquipo);
             
             if(stmt.executeUpdate() > 0 ){
                JOptionPane.showMessageDialog( null, "Registro eliminado"  + " " + JOptionPane.INFORMATION_MESSAGE );

             }
             else{
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
    
    public void habilitarEquipo(int idEquipo){
        PreparedStatement stmt = null;
        
        String query        =" UPDATE equipo "
                            +" SET estado = true "
                            +" WHERE idEquipo = ? ";
        
        try{
             stmt = con.prepareStatement( query );
             stmt.setInt(1, idEquipo);
             
             if(stmt.executeUpdate() > 0 ){
                JOptionPane.showMessageDialog( null, "Registro habilitado"  + " " + JOptionPane.INFORMATION_MESSAGE );

             }
             else{
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
    
    public List <Equipo> listarEquiposHabilitados ( ) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<Equipo> list_equiposHabilitados = new ArrayList<Equipo>(); 
        
        String query    = "SELECT * "
                        + "FROM equipo "
                        + "WHERE estado = 1 "
                        + "ORDER BY equipo.nombre ";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                int idLocal = resultado.getInt("idEquipo");
                proyecto = regenerarProyecto(resultado.getInt("idProyecto"));
                String nombreLocal = resultado.getString("nombre");
                LocalDate creacionLocal = resultado.getDate("fechaCreacion").toLocalDate();
                boolean estadoLocal = resultado.getBoolean("estado");
                
                Equipo equipoN = new Equipo (idLocal, proyecto, nombreLocal, creacionLocal, estadoLocal);
                
                list_equiposHabilitados.add(equipoN);
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
        return list_equiposHabilitados;
    }

    public List <Equipo> listarEquiposDeshabilitados( ) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<Equipo> list_equiposNoHabilitados = new ArrayList<Equipo>(); 
        
        String query    = "SELECT * "
                        + "FROM equipo "
                        + "WHERE estado = 0 "
                        + "ORDER BY equipo.nombre ";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                int idLocal = resultado.getInt("idEquipo");
                proyecto = regenerarProyecto(resultado.getInt("idProyecto"));
                String nombreLocal = resultado.getString("nombre");
                LocalDate creacionLocal = resultado.getDate("fechaCreacion").toLocalDate();
                boolean estadoLocal = resultado.getBoolean("estado");
                
                Equipo equipoN = new Equipo (idLocal, proyecto, nombreLocal, creacionLocal, estadoLocal);
                
                list_equiposNoHabilitados.add(equipoN);
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
        return list_equiposNoHabilitados;
    }
    
    public List <Equipo> listarTodosEquipos( ) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<Equipo> list_todosEquipos = new ArrayList<Equipo>(); 
        
        String query    = "SELECT * "
                        + "FROM equipo "
                        + "ORDER BY equipo.nombre ";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                int idLocal = resultado.getInt("idEquipo");
                proyecto = regenerarProyecto(resultado.getInt("idProyecto"));
                String nombreLocal = resultado.getString("nombre");
                LocalDate creacionLocal = resultado.getDate("fechaCreacion").toLocalDate();
                boolean estadoLocal = resultado.getBoolean("estado");
                
                Equipo equipoN = new Equipo (idLocal, proyecto, nombreLocal, creacionLocal, estadoLocal);
                list_todosEquipos.add(equipoN);
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
        return list_todosEquipos;
    }
    

    
                /*|---------------------|*/
                /*|    Metodos extras   |*/
                /*|---------------------|*/
    
    private Proyecto regenerarProyecto(int idProyecto){
        proyecto = proyectoData.buscarProyecto(idProyecto);
        return proyecto;
    }
}
