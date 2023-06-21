
package Controlador;

import Conexion.Conexion;
import Modelo.EquipoMiembros;
import Modelo.Tarea;
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

public class TareaData {
    private final Connection con;
    private static EquipoMiembros equipoMiembros = new EquipoMiembros();
    private static EquipoMiembrosData equipoMiembrosData = new EquipoMiembrosData();
    private static Tarea tarea = new Tarea();
    private static TareaData tareaData = new TareaData();
    
    public TareaData() {
        con = Conexion.getConexion();
    }
    

    private EquipoMiembros regenerarEquipoMiembro(int idEquipoMiembros){
        equipoMiembros = equipoMiembrosData.buscarEquipoMiembros(idEquipoMiembros);
        return equipoMiembros;
    }
    
  

    private Tarea regenerarTarea(int idTarea){
        tarea = tareaData.buscarTarea(idTarea);
        return tarea;
    }
    
    //Create
    

    
                /*|---------------------|*/
                /*|         CRUD        |*/
                /*|---------------------|*/
    
    
    public void guardarTarea(Tarea tarea){

        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "INSERT INTO tarea ( "
                            + "nombre, "
                            + "fechaCreacion, "
                            + "fechaCierre, "
                            + "estado, "
                            + "descripcion, "
                            + "idEquipoMiembros  "
                        + ") "
                        + "VALUES ( ?, ?, ?, ?, ?, ? )";
        try{
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setString(1, tarea.getNombre());
            stmt.setDate(2, Date.valueOf(tarea.getFecha_creacion()));
            stmt.setDate(3, Date.valueOf(tarea.getFecha_cierre()));
            stmt.setInt(4, tarea.getEstado());
            stmt.setString(5, tarea.getDescripcion());
            stmt.setInt(6, tarea.getEquipoMiembros().getId_equipo_miembros());
            
            stmt.executeUpdate();
                resultado = stmt.getGeneratedKeys();

            if(resultado.next()){
                tarea.setId_tarea(resultado.getInt(1));
            }
            
            JOptionPane.showMessageDialog(null, " Tarea guardada con exito ", "" ,JOptionPane.INFORMATION_MESSAGE );

        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "Error al guadar Tarea" , JOptionPane.ERROR_MESSAGE );
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
     
    public Tarea buscarTarea(int idTarea){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query        = "SELECT * "
                            + "FROM tarea "
                            + "WHERE idTarea = ? ";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idTarea);
            resultado = stmt.executeQuery();
            
            if(resultado.next()){
                int id = idTarea;
                String nombre = resultado.getString("nombre");
                LocalDate fechaCreacion = resultado.getDate("fechaCreacion").toLocalDate();
                LocalDate fechaCierre = resultado.getDate("fechaCierre").toLocalDate();
                int estado = resultado.getInt("estado");

                String descripcion = resultado.getString("descripcion");

                equipoMiembros = regenerarEquipoMiembro(resultado.getInt("idEquipoMiembros"));
                
                tarea = new Tarea(id, nombre, fechaCreacion, fechaCierre, estado,descripcion, equipoMiembros);
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontro la tarea solicitada.", "ERROR",JOptionPane.ERROR_MESSAGE);

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
        return tarea;
    }
    
    public void actualizarTarea(Tarea tarea){
        PreparedStatement stmt = null;
        
        String query    = "UPDATE tarea "
                        + "SET nombre = ?, fechaCreacion = ?, fechaCierre = ?, estado = ?, descripcion = ?, idEquipoMiembros = ? " 
                        + "WHERE idTarea = ?";
                            
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setString(1, tarea.getNombre());
            stmt.setDate(2, Date.valueOf(tarea.getFecha_creacion()));
            stmt.setDate(3, Date.valueOf(tarea.getFecha_cierre()));
            stmt.setInt(4, tarea.getEstado());

            stmt.setInt(5, tarea.getEquipoMiembros().getId_equipo_miembros());
            stmt.setInt(6, tarea.getId_tarea());

            stmt.setString(5, tarea.getDescripcion());
            stmt.setInt(6, tarea.getEquipoMiembros().getId_equipo_miembros());
            stmt.setInt(7, tarea.getId_tarea());

            
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
    
    public void eliminarTarea(int idTarea){
        PreparedStatement stmt = null;
        
        String query    = "UPDATE tarea "
                        + "SET estado = false "
                        + "WHERE idTarea = ? ";
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idTarea);
            
            if(stmt.executeUpdate() > 0){
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
    
    public void habilitarTarea(int idTarea){
        PreparedStatement stmt = null;
        
        String query    = "UPDATE tarea "
                        + "SET estado = true "
                        + "WHERE idTarea = ? ";
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idTarea);
            
            if(stmt.executeUpdate() > 0){
                JOptionPane.showMessageDialog( null, "Registro habilitato"  + " " + JOptionPane.INFORMATION_MESSAGE );
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
    
    
    public List <Tarea> listarTareasHabilitadas ( ) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<Tarea> listaTareasHabilitadas = new ArrayList<Tarea>(); 
        
        String query    = "SELECT * "
                        + "FROM tarea "
                        + "WHERE estado = 1 "
                        + "ORDER BY nombre";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                 
                int idTareaLocal = resultado.getInt("idTarea");
                String nombreLocal = resultado.getString("nombre"); 
                LocalDate creacionLocal = resultado.getDate("fechaCreacion").toLocalDate();
                LocalDate cierreLocal = resultado.getDate("fechaCierre").toLocalDate();
                int estadoLocal = resultado.getInt("estado");

                String descripcionLocal = resultado.getString("descripcion");

                equipoMiembros = regenerarEquipoMiembro(resultado.getInt("idEquipoMiembros"));
                
                Tarea tareaN = new Tarea (idTareaLocal, nombreLocal, creacionLocal, cierreLocal, estadoLocal,descripcionLocal, equipoMiembros);
                
                listaTareasHabilitadas.add(tareaN);
               
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
        return listaTareasHabilitadas;
    }

    public List <Tarea> listarTareasDeshabilitadas ( ) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<Tarea> listaTareasDeshabilitadas = new ArrayList<Tarea>(); 
        
        String query    = "SELECT * "
                        + "FROM tarea "
                        + "WHERE estado = 0 "
                        + "ORDER BY nombre";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                 
                int idTareaLocal = resultado.getInt("idTarea");
                String nombreLocal = resultado.getString("nombre"); 
                LocalDate creacionLocal = resultado.getDate("fechaCreacion").toLocalDate();
                LocalDate cierreLocal = resultado.getDate("fechaCierre").toLocalDate();
                int estadoLocal = resultado.getInt("estado");

                String descripcionLocal = resultado.getString("descripcion");

                equipoMiembros = regenerarEquipoMiembro(resultado.getInt("idEquipoMiembros"));
                
                Tarea tareaN = new Tarea (idTareaLocal, nombreLocal, creacionLocal, cierreLocal, estadoLocal,descripcionLocal, equipoMiembros);
                
                listaTareasDeshabilitadas.add(tareaN);
               
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
        return listaTareasDeshabilitadas;
    }
    
    public List <Tarea> listarTodasTareas ( ) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<Tarea> listaTareasTodas = new ArrayList<Tarea>(); 
        
        String query    = "SELECT * "
                        + "FROM tarea "
                        + "ORDER BY nombre";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                 
                int idTareaLocal = resultado.getInt("idTarea");
                String nombreLocal = resultado.getString("nombre"); 
                LocalDate creacionLocal = resultado.getDate("fechaCreacion").toLocalDate();
                LocalDate cierreLocal = resultado.getDate("fechaCierre").toLocalDate();
                int estadoLocal = resultado.getInt("estado");

                String descripcionLocal = resultado.getString("descripcion");

                equipoMiembros = regenerarEquipoMiembro(resultado.getInt("idEquipoMiembros"));
                
                Tarea tareaN = new Tarea (idTareaLocal, nombreLocal, creacionLocal, cierreLocal, estadoLocal,descripcionLocal, equipoMiembros);
                
                listaTareasTodas.add(tareaN);
               
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
        return listaTareasTodas;
    }
    
    public List <Tarea> listarTareasAll(int estado, int idProyecto){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<Tarea> listaTareasAll = new ArrayList<Tarea>();
        
        String query        = " SELECT t.* " 
                            + " FROM tarea AS t " 
                            + " JOIN equipomiembros AS em " 
                            + " ON t.idEquipoMiembros = em.idEquipoMiembros " 
                            + " JOIN equipo AS e " 
                            + " ON em.idEquipo = e.idEquipo " 
                            + " JOIN proyecto AS p " 
                            + " ON e.idProyecto = p.idProyecto " 
                            + " WHERE t.estado = ? AND p.idProyecto = ? ";
        
        try{
            stmt = con.prepareStatement(query);
            stmt.setInt(1, estado);
            stmt.setInt(2, idProyecto);
            resultado = stmt.executeQuery();
            while (resultado.next()){
                int idtarea = resultado.getInt("idTarea");
                String nombre = resultado.getString("nombre");
                LocalDate fechaCreacion = resultado.getDate("fechaCreacion").toLocalDate();
                LocalDate fechaCierre = resultado.getDate("fechaCierre").toLocalDate();
                int estadolocal = resultado.getInt("estado");
                String descripcion = resultado.getString("descripcion");
                Tarea tarea = new Tarea(idtarea, nombre, fechaCreacion, fechaCierre, estadolocal,descripcion);
                listaTareasAll.add(tarea);
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
        return listaTareasAll;
    }
    
    
    
                /*|---------------------|*/
                /*|    Metodos extras   |*/
                /*|---------------------|*/
    
    
    
}
