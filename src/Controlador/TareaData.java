
package Controlador;

import Conexion.Conexion;
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

    public TareaData() {
        con=Conexion.getConexion();
    }
    

    //CREATE
     public void guardarTarea(Tarea tarea){

        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query        = " INSERT INTO tarea "
                            + " ( nombre, fechaCreacion, fechaCierre, estado, idEquipoMiembros ) "
                            + " VALUES ( ?, ?, ?, 1, ? ) ";
        try{
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setString(1, tarea.getNombre());
            stmt.setDate(2, Date.valueOf(tarea.getFecha_creacion()));
            stmt.setDate(3, Date.valueOf(tarea.getFecha_cierre()));
            stmt.setInt(4, tarea.getEquipoMiembros().getId_equipo_miembros());
            
            stmt.executeUpdate();
            resultado= stmt.getGeneratedKeys();

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
     
    //READ
    public Tarea buscarTarea(int idTarea){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        Tarea tareaN = null; 
        
        String query        = " SELECT * "
                            + " FROM tarea "
                            + " WHERE idTarea = ? ";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idTarea);
            resultado = stmt.executeQuery();
            
            if(resultado.next()){
                tareaN = new Tarea();
                tareaN.setId_tarea(idTarea);
                tareaN.setNombre(resultado.getString("nombre"));
                tareaN.setFecha_creacion(resultado.getDate("fechaCreacion").toLocalDate());
                tareaN.setFecha_cierre(resultado.getDate("fechaCierre").toLocalDate());
                tareaN.setEstado(resultado.getBoolean("estado"));
                tareaN.getEquipoMiembros().setId_equipo_miembros(resultado.getInt("idEquipoMiembros"));
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
        return tareaN;
    }
    
    //UPDATE
    public void actualizarTarea(Tarea tarea){
        PreparedStatement stmt = null;
        
        String query        = " UPDATE tarea "
                            + " SET nombre = ?, fechaCreacion = ?, fechaCierre = ?, estado = ?, idEquipoMiembros = ? "
                            + " WHERE idTarea = ? ";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setString(1, tarea.getNombre());
            stmt.setDate(2, Date.valueOf(tarea.getFecha_creacion()));
            stmt.setDate(3, Date.valueOf(tarea.getFecha_cierre()));
            stmt.setBoolean(4, tarea.getEstado());
            stmt.setInt(5, tarea.getEquipoMiembros().getId_equipo_miembros());
            stmt.setInt(6, tarea.getId_tarea());
            
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
    
    public void buscarTarea(){
        PreparedStatement stmt = null;
        ResultSet resultado = null;

    }
    
    //DELETE
    public void eliminarTarea(int idTarea){
        PreparedStatement stmt = null;

        
        String query        = " UPDATE tarea "
                            + " SET estado = false "
                            + " WHERE idTarea = ? ";
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
    //  zona metodos extras
    
}
