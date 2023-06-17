
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


public class EquipoMiembrosData {
    private final Connection con;
    private static Miembro miembro = new Miembro();
    private static MiembroData miembroData = new MiembroData();
    private static Equipo equipo = new Equipo();
    private static EquipoData equipoData = new EquipoData();
    private static EquipoMiembros equipoMiembros = new EquipoMiembros();
    private static EquipoMiembrosData equipoMiembrosData = new EquipoMiembrosData();
            
    public EquipoMiembrosData() {
        con=Conexion.getConexion();
    }
    
    public Equipo regerarEquipo(int idEquipo){
        equipo = equipoData.buscarEquipo(idEquipo);
        return equipo;
    }
    public Miembro regenerarMiembro(int idMiembro){
        miembro = miembroData.buscarMiembro(idMiembro);
        return miembro;
    }
    
    //Create
    public void guardarEquipoMiembros(EquipoMiembros equipo){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "INSERT INTO equipomiembros ( "
                            + "rol, "
                            + "fechaIncorporacion, "
                            + "idEquipo, "
                            + "idMiembro "
                        + ") "
                        + "VALUES (?, ?, ?, ?)";
                        
        try{
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setString(1, equipo.getRol());
            stmt.setDate(2, Date.valueOf(equipo.getFecha_incorporacion()));
            stmt.setInt(3, equipo.getEquipo().getId_equipo());
            stmt.setInt(4, equipo.getMiembro().getId_miembro());
            
            stmt.executeUpdate();
            resultado = stmt.getGeneratedKeys();
            
            if( resultado.next()){
                equipo.setId_equipo_miembros(resultado.getInt(1));
            }
            
            JOptionPane.showMessageDialog(null, " Registro guardado con exito ", "" ,JOptionPane.INFORMATION_MESSAGE );
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
    
    //Read
    public EquipoMiembros buscarEquipoMiembros(int idEquipoMiembro){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        String query    = "SELECT * "
                        + "FROM EquipoMiembros "
                        + "WHERE idEquipoMiembros = ?";
                
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idEquipoMiembro);
            resultado = stmt.executeQuery();
            
            if ( resultado.next() ){
                int id = idEquipoMiembro;
                String rol = resultado.getString("rol");
                LocalDate fechaIncorporacion = resultado.getDate("fechaIncorporacion").toLocalDate();
                equipo = regerarEquipo(resultado.getInt("idEquipo"));
                miembro = regenerarMiembro(resultado.getInt("idMiembro"));
                
                equipoMiembros = new EquipoMiembros(idEquipoMiembro, rol, fechaIncorporacion, equipo, miembro);
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
        
        return equipoMiembros;
    }
   
          
    
    
    
    
    //Update
    public void actualizarEquipoMiembros(EquipoMiembros equipo){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "UPDATE EquipoMiembros "
                        + "SET rol = ?, fechaIncorporacion = ?, idEquipo = ?, idMiembro = ? "
                        + "WHERE idEquipoMiembros = ?";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setString(1, equipo.getRol());
            stmt.setDate(2, Date.valueOf(equipo.getFecha_incorporacion()));
            stmt.setInt(3, equipo.getEquipo().getId_equipo());
            stmt.setInt(4, equipo.getMiembro().getId_miembro());
            stmt.setInt(5, equipo.getId_equipo_miembros());
            
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
    
    //Delete
    public void eliminarMiembros(int idEquipoMiembros){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "DELETE FROM EquipoMiembros "
                        + "WHERE idEquipoMiembros = ?";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idEquipoMiembros);
            
            if(stmt.executeUpdate() > 0){
                JOptionPane.showMessageDialog( null, "Registro eliminado"  + " " + JOptionPane.INFORMATION_MESSAGE );
            }else{
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
    
    //Listar Equipos Miembros Habilitados
    public List <EquipoMiembros> listarEquiposMiembros( ) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<EquipoMiembros> listaEM = new ArrayList<EquipoMiembros>(); 
        
        String query    = "SELECT * "
                        + "FROM EquipoMiembros ";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                int idLocal = resultado.getInt("idEquipoMiembros");
                String rol = resultado.getString("rol");
                LocalDate fechaIncorporacion = resultado.getDate("fechaIncorporacion").toLocalDate();
                equipo = regerarEquipo(resultado.getInt("idEquipo"));
                miembro = regenerarMiembro(resultado.getInt("idMiembro"));
                
                EquipoMiembros equipoN = new EquipoMiembros(rol, fechaIncorporacion, equipo, miembro);
                
                listaEM.add(equipoN);
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
        return listaEM;
    }
}
