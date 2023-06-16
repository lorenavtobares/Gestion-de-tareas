
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

public class ComentariosData {
    private final Connection con;
    private static Tarea tarea = new Tarea();
    private static TareaData tareaData = new TareaData();
    
    public ComentariosData(){
        con = Conexion.getConexion();
    }
    
    
                /*|---------------------|*/
                /*|         CRUD        |*/
                /*|---------------------|*/
    
    
    public void guardarComentarios(Comentarios comentarios){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "INSERT INTO comentarios "
                        + "(comentario, fechaAvance, idTarea) "
                        + "VALUES ( ?, ?, ? ) ";
        try{
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setString(1, comentarios.getComentario());
            stmt.setDate(2, Date.valueOf(comentarios.getFecha_avance()));
            stmt.setInt(3, comentarios.getTarea().getId_tarea());
            
            stmt.executeUpdate();
            resultado = stmt.getGeneratedKeys();

            if( resultado.next() ){
                comentarios.setId_comentario(resultado.getInt(1));
            }
            JOptionPane.showMessageDialog(null, " Comentario guardado con exito ", "" ,JOptionPane.INFORMATION_MESSAGE );
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "Error al guardar Comentario" , JOptionPane.ERROR_MESSAGE );
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
    
    public Comentarios buscarComentarios(int idComentarios){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        Comentarios comentariosN = null; 
        
        String query    = "SELECT * "
                        + "FROM comentarios "
                        + "WHERE idComentarios = ? ";
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idComentarios);
            resultado = stmt.executeQuery();
            
            if(resultado.next()){
                int id = idComentarios;
                String comentario = resultado.getString("comentario");
                LocalDate fechaAvance = resultado.getDate("fechaAvance").toLocalDate();
                tarea = regenerarTarea(resultado.getInt("idTarea"));
                
                comentariosN = new Comentarios(comentario, fechaAvance, tarea);
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
        return comentariosN;
    }
    
    public void actualizarComentarios(Comentarios comentarios){
        PreparedStatement stmt = null;
        
        String query        =" UPDATE comentarios "
                            +" SET comentario = ?, fechaAvance = ?, idTarea = ? "
                            +" WHERE idComentarios = ? ";
        try{
            stmt = con.prepareStatement( query );
            stmt.setString(1, comentarios.getComentario());
            stmt.setDate(2, Date.valueOf(comentarios.getFecha_avance()));
            stmt.setInt(3, comentarios.getTarea().getId_tarea());
            stmt.setInt(4, comentarios.getId_comentario());
            
            stmt.executeUpdate();           
            JOptionPane.showMessageDialog(null, "Registro actualizado"," ",JOptionPane.INFORMATION_MESSAGE);
        }
        catch ( SQLException ex )
        {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), " ", JOptionPane.ERROR_MESSAGE );
        }
        finally {
            try { 
                stmt.close(); 
            }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
    }
    
    public void eliminarComentarios(int idComentarios){
        PreparedStatement stmt = null;
        String query    = "DELETE FROM comentarios "
                        + "WHERE idComentarios = ? ";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idComentarios);
            
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
    

    
                /*|---------------------|*/
                /*|        Listas       |*/
                /*|---------------------|*/
    
    
    public List listarTodosComentarios(){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List <Comentarios> listarTodos = new ArrayList<Comentarios>();
        
        String query    = "SELECT * "
                        + "FROM comentarios ";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                int id = resultado.getInt("idComentarios");
                String comentario = resultado.getString("comentario");
                LocalDate fechaAvance = resultado.getDate("fechaAvance").toLocalDate();               
                tarea = regenerarTarea(resultado.getInt("idTarea"));
                
                Comentarios comentarioN = new Comentarios(id, comentario, fechaAvance, tarea);
                        
                listarTodos.add(comentarioN);
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
        
        return listarTodos;
    } 
    
    
    
                /*|---------------------|*/
                /*|    Metodos extras   |*/
                /*|---------------------|*/
    
    private Tarea regenerarTarea(int idTarea){
        tarea = tareaData.buscarTarea(idTarea);
        return tarea;
    }
}
