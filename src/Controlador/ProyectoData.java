
package Controlador;

import Conexion.Conexion;
import Modelo.Proyecto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ProyectoData {
    private final Connection con;
    public ProyectoData(){
        con= Conexion.getConexion();
    }
    
    //CREATE
    public void guardarProyecto(Proyecto proyecto){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query        =" INSERT INTO proyecto "
                            +" ( nombre, descripcion, fechainicio, estado ) "
                            +" VALUES ( ?, ?, ?, 1 ) ";
        try{
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setString(1, proyecto.getNombre());
            stmt.setString(2, proyecto.getDescripcion());
            stmt.setDate(3, Date.valueOf(proyecto.getFecha_inicio()));
            
            stmt.executeUpdate();
            resultado= stmt.getGeneratedKeys();
            
            if(resultado.next()){
                proyecto.setId_proyecto(resultado.getInt(1));
            }
            JOptionPane.showMessageDialog(null, " Proyecto guardado con exito ", "" ,JOptionPane.INFORMATION_MESSAGE );
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
    public Proyecto buscarProyecto(int idProyecto){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        Proyecto proyectoN = null;
        
        String query        =" SELECT * "
                            +" FROM proyecto "
                            +" WHERE idProyecto = ? ";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idProyecto);
            resultado = stmt.executeQuery();
            
            if(resultado.next()){
                proyectoN = new Proyecto();
                proyectoN.setNombre(resultado.getString("nombre"));
                proyectoN.setDescripcion(resultado.getString("descripcion"));
                proyectoN.setFecha_inicio(resultado.getDate("fechainicio").toLocalDate());
                proyectoN.setEstado(resultado.getBoolean("estado"));
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontro el proyecto solicitado.", "ERROR",JOptionPane.ERROR_MESSAGE);

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
        
        return proyectoN;
    }
    
    //UPDATE
    public void actualizarProyecto(Proyecto proyecto){
        PreparedStatement stmt = null;
                
        String query        =" UPDATE proyecto "
                            +" SET nombre = ?, descripcion = ?, fechainicio = ?, estado = ? "
                            +" WHERE idProyecto = ? ";
        try{
            stmt = con.prepareStatement( query );
            stmt.setString(1, proyecto.getNombre());
            stmt.setString(2, proyecto.getDescripcion());
            stmt.setDate(3, Date.valueOf(proyecto.getFecha_inicio()));
            stmt.setBoolean(4, proyecto.getEstado());
                    
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
    //DELETE
    public void eliminarProyecto(int idProyecto){
        PreparedStatement stmt = null;

        String query        =" UPDATE proyecto "
                            +" SET estado = false "
                            +" WHERE idProyecto = ? ";
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idProyecto);
            
            if (stmt.executeUpdate() > 0) {
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
