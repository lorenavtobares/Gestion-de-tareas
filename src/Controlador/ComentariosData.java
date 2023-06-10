
package Controlador;

import Conexion.Conexion;
import Modelo.Comentarios;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class ComentariosData {
    private final Connection con;
    
    public ComentariosData(){
        con = Conexion.getConexion();
    }
    //CREATE
    public void guardarComentarios(Comentarios comentarios){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query        =" INSERT INTO comentarios "
                            +" ( comentarios, fechaAvance, idTarea ) "
                            +" VALUES ( ?, ?, ? ) ";
        try{
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setString(1, comentarios.getComentario());
            stmt.setDate(2, Date.valueOf(comentarios.getFecha_avance()));
            stmt.setInt(3, comentarios.getId_tarea());
            
            
            stmt.executeUpdate();
            resultado= stmt.getGeneratedKeys();

            if(resultado.next()){
                comentarios.setId_comentario(resultado.getInt(1));
            }
            JOptionPane.showMessageDialog(null, " Comentario guardado con exito ", "" ,JOptionPane.INFORMATION_MESSAGE );

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
    
    //READ
    public Comentarios buscarComentarios(int idComentarios){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        Comentarios comentariosN = null; 
        
        String query        =" SELECT *  "
                            +" FROM comentarios "
                            +" WHERE idComentarios = ? ";
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idComentarios);
            resultado = stmt.executeQuery();
            
            if(resultado.next()){
                comentariosN = new Comentarios();
                comentariosN.setId_comentario(idComentarios);
                comentariosN.setComentario(resultado.getString("comentario"));
                comentariosN.setFecha_avance(resultado.getDate("fechaAvance").toLocalDate());
                comentariosN.setId_tarea(resultado.getInt("idTarea"));
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
    
    //UPDATE
    public void actualizarComentarios(Comentarios comentarios){
        PreparedStatement stmt = null;
        
        String query        =" UPDATE comentarios "
                            +" SET comentario = ?, fechaAvance = ?, idTarea = ? "
                            +" WHERE idComentarios = ? "; 
    }
    
    //DELETE
    public void eliminarComentarios(int idComentarios){
        PreparedStatement stmt = null;
        String query        = " UPDATE comentarios "
                            + " SET estado = false "
                            + " WHERE idComentarios = ? ";
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
}
