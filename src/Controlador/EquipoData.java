
package Controlador;

import Conexion.Conexion;
import Modelo.Equipo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class EquipoData {
    private final Connection con;

    public EquipoData() {
        con = Conexion.getConexion();
    }
    
    public void GuardarEquipo(Equipo equipo){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        String query        = " INSERT INTO equipo "
                            + " ( idProyecto, nombre, fechaCreacion, estado ) "
                            + " VALUES ( ?, ?, ?, 1 ) ";
        try{
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setInt(1, equipo.getId_proyecto());
            stmt.setString(2, equipo.getNombre());
            stmt.setDate(3, Date.valueOf(equipo.getFecha_cracion()));
            
            stmt.executeUpdate();
            resultado=stmt.getGeneratedKeys();
            if (resultado.next()) {
                equipo.setId_proyecto(resultado.getInt(1));
            }
            JOptionPane.showMessageDialog(null, " Equipo guardado con exito ", "" ,JOptionPane.INFORMATION_MESSAGE );

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
    
    public Equipo buscarEquipo(int idEquipo){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        Equipo equipoN =null;
        
        String query        = " SELECT * "
                            + " FROM equipo "
                            + " WHERE idEquipo = ? "; 
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idEquipo);
            resultado= stmt.executeQuery();
            if(resultado.next() ){
                equipoN = new Equipo();
                equipoN.setId_equipo(idEquipo);
                equipoN.setId_proyecto(resultado.getInt("idProyecto"));
                equipoN.setNombre(resultado.getString("nombre"));
                equipoN.setFecha_cracion(resultado.getDate("fechaCreacion").toLocalDate());
                equipoN.setEstado(resultado.getBoolean("estado"));
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
        ResultSet resultado = null;
        
        String query        = " UPDATE equipo "
                            + " SET idProyecto = ?, nombre = ?,  fechaCreacion = ? "
                            + " WHERE idEquipo = ? ";
        
        try{
            
            stmt = con.prepareStatement( query );
            stmt.setInt(1, equipo.getId_proyecto());
            stmt.setString(2, equipo.getNombre());
            stmt.setDate(3, Date.valueOf(equipo.getFecha_cracion()));
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
    
}
