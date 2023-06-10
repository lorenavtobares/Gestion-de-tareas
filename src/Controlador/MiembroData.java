
package Controlador;

import Conexion.Conexion;
import Modelo.Miembro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MiembroData {
    private final Connection con;

    public MiembroData() {
        con=Conexion.getConexion();
    }

    //CREATE
    public void guardarMiembro(Miembro miembro){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query      = " INSERT INTO miembro "
                          + " (dni, password, apellido, nombre, estado, rolSistema) "
                          + " VALUES ( ?, ?, ?, ?, 1, ?) " ;
        try{
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setInt(1, miembro.getDni());
            stmt.setString(2, miembro.getPassword());
            stmt.setString(3, miembro.getApellido());
            stmt.setString(4, miembro.getNombre());
            stmt.setString(5, miembro.getRolSistema());
            
            stmt.executeUpdate();
            resultado=stmt.getGeneratedKeys();
            
            if(resultado.next()){
                miembro.setId_miembro(resultado.getInt(1));
            }
            
            JOptionPane.showMessageDialog(null, " Miembro guardado con exito ", "" ,JOptionPane.INFORMATION_MESSAGE );
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
    public Miembro buscarMiembro(int idMiembro){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        Miembro miembroN=null;
        
        String query        = " SELECT * "
                            + " FROM miembro "
                            + " WHERE idMiembro = ? "; 
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idMiembro);
            resultado= stmt.executeQuery();
            
            if(resultado.next() ){
                miembroN= new Miembro();
                miembroN.setId_miembro(idMiembro);
                miembroN.setDni(resultado.getInt("dni"));
                miembroN.setPassword(resultado.getString("password"));
                miembroN.setApellido(resultado.getString("apellido"));
                miembroN.setNombre(resultado.getNString("nombre"));
                miembroN.setEstado(resultado.getBoolean("estado"));
                miembroN.setRolSistema(resultado.getString("rolSistema"));
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontro el miembro solicitado.", "ERROR",JOptionPane.ERROR_MESSAGE);
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
        return miembroN;
    }
    
    //UPDATE
    public void actualizarMiembro(Miembro miembro){
        PreparedStatement stmt = null;
        
        String query        = " UPDATE miembro "
                            + " SET dni = ?, password = ?, apellido = ?, nombre = ?, estado = ?, rolSistema = ? "
                            + " WHERE idMiembro = ? ";
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, miembro.getDni());
            stmt.setString(2, miembro.getPassword());
            stmt.setString(3, miembro.getApellido());
            stmt.setString(4, miembro.getNombre());
            stmt.setBoolean(5, miembro.getEstado());
            stmt.setString(6, miembro.getRolSistema());
            
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
    public void eliminarMiembro(int idMiembro){
        PreparedStatement stmt = null;
        
        String query        = " UPDATE miembro "
                            + " SET estado = false "
                            + " WHERE idMiembro = ? ";
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idMiembro);
            
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
    //  zona metodos extras
    
}
