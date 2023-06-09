
package Controlador;

import Conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class EquipoMiembrosData {
    private final Connection con;

    public EquipoMiembrosData() {
        con=Conexion.getConexion();
    }
    /*public Equipo regerarEquipo(){
        
    }
    public Miembro regenerarMiembro(){
        
    }*/
    
     public void guardarMiembros(){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        //modificar
        String query        = "INSERT INTO equipomiembros"
                            + " ( rol, fechaincorporacion, idEquipo, idMiembro) "
                            + " VALUES ( ?, ?, ?, ? )";
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
    }//create
    public void buscarMiembros(){
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
    
    public void actualizarMiembros(){
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
    
    public void eliminarMiembros(){
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