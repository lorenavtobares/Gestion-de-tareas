
package Controlador;

import Conexion.Conexion;
import Modelo.Tarea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TareaData {
    private final Connection con;

    public TareaData() {
        con=Conexion.getConexion();
    }
    
     public void guardarTarea(Tarea tarea){
          PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query        = " INSERT INTO tarea "
                            + " ( nombre, fechaCreacion, fechaCierre, estado, idEquipoMiembros ) "
                            + " VALUES ( ?, ?, ?, 1, ? ) ";
        try{
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );

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
    }//create
    public void buscarTarea(){
          PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query= "";
        try{
            stmt = con.prepareStatement( query );
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
    }//read
    
    public void actualizarTarea(){
          PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query= "";
        try{
            stmt = con.prepareStatement( query );
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
    }//update
    
    public void eliminarTarea(){
          PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query= "";
        try{
            stmt = con.prepareStatement( query );
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
    }//delete
    
    //  zona metodos extras
    
}
