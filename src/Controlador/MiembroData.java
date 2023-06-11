package Controlador;

import Conexion.Conexion;
import Modelo.Miembro;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MiembroData {
    private final Connection con;

    public MiembroData() {
        con=Conexion.getConexion();
    }

    //Create
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


    }//create
    
    //Read
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
    
    //Update
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
            stmt.setInt(7, miembro.getId_miembro());
            
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

    //Habilitar Miembros Data
    public void habilitarMiembro(int idMiembro){
        PreparedStatement stmt = null;
        String query        =" UPDATE miembro "
                            +" SET estado = true "
                            +" WHERE idmiembro = ? ";
         try{
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, idMiembro );
            
            if(stmt.executeUpdate() > 0){
                JOptionPane.showMessageDialog( null, "Miembro habilitado"  + " " + JOptionPane.INFORMATION_MESSAGE );
            }else{
                JOptionPane.showMessageDialog( null, "ID ingresado incorrecto"  + " " + JOptionPane.ERROR_MESSAGE );
            }
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "" , JOptionPane.ERROR_MESSAGE );
        }
        finally {
            try { stmt.close(); }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
    }
    
    //Listar Miembros Habilitados
    public List <Miembro> listarHabilitados( ){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<Miembro> listaHabilitados = new ArrayList<Miembro>();
        
        String query        =" SELECT * "
                            +" FROM miembro "
                            +" WHERE estado = 1 ";
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ){
                Miembro miembroN = new Miembro();
                miembroN.setId_miembro(resultado.getInt("idMiembro"));
                miembroN.setDni(resultado.getInt("dni"));
                miembroN.setPassword(resultado.getString("password"));
                miembroN.setApellido(resultado.getString("apellido"));
                miembroN.setNombre(resultado.getString("nombre"));
                miembroN.setEstado(resultado.getBoolean("estado"));
                miembroN.setRolSistema(resultado.getString("rolSistema"));
                listaHabilitados.add(miembroN);
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
        return listaHabilitados;
    }
    
    //Listar Miembros Deshbilitados
    public List <Miembro> listarNoHabilitados( ){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<Miembro> listaNoHabilitados = new ArrayList<Miembro>();
        
        String query        =" SELECT * "
                            +" FROM miembro "
                            +" WHERE estado = 0 ";
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ){
                Miembro miembroN = new Miembro();
                miembroN.setId_miembro(resultado.getInt("idMiembro"));
                miembroN.setDni(resultado.getInt("dni"));
                miembroN.setPassword(resultado.getString("password"));
                miembroN.setApellido(resultado.getString("apellido"));
                miembroN.setNombre(resultado.getString("nombre"));
                miembroN.setEstado(resultado.getBoolean("estado"));
                miembroN.setRolSistema(resultado.getString("rolSistema"));
                listaNoHabilitados.add(miembroN);
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
        return listaNoHabilitados;
    }
    
    //Listar Todos los miembros
    public List <Miembro> listarTodosMiembros( ){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<Miembro> listaTodos = new ArrayList<Miembro>();
        
        String query        =" SELECT * "
                            +" FROM miembro ";
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ){
                Miembro miembroN = new Miembro();
                miembroN.setId_miembro(resultado.getInt("idMiembro"));
                miembroN.setDni(resultado.getInt("dni"));
                miembroN.setPassword(resultado.getString("password"));
                miembroN.setApellido(resultado.getString("apellido"));
                miembroN.setNombre(resultado.getString("nombre"));
                miembroN.setEstado(resultado.getBoolean("estado"));
                miembroN.setRolSistema(resultado.getString("rolSistema"));
                listaTodos.add(miembroN);
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
        return listaTodos;
    }
}
