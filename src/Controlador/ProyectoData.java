package Controlador;

import Conexion.Conexion;
import Modelo.Proyecto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProyectoData {
    private final Connection con;
    public ProyectoData(){
        con= Conexion.getConexion();
    }
    
    
    
                /*|---------------------|*/
                /*|         CRUD        |*/
                /*|---------------------|*/
    
    
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
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "Error al guardar Proyecto" , JOptionPane.ERROR_MESSAGE );
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
                proyectoN.setId_proyecto(idProyecto);
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
    
    public void actualizarProyecto(Proyecto proyecto){
        PreparedStatement stmt = null;
                
        String query        ="UPDATE proyecto "
                            +"SET nombre = ?, descripcion = ?, fechaInicio = ?, estado = ? "
                            +"WHERE idProyecto = ?";
        try{
            stmt = con.prepareStatement( query );
            stmt.setString(1, proyecto.getNombre());
            stmt.setString(2, proyecto.getDescripcion());
            stmt.setDate(3, Date.valueOf(proyecto.getFecha_inicio()));
            stmt.setBoolean(4, proyecto.getEstado());
            stmt.setInt(5, proyecto.getId_proyecto());
                    
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
    
    public void eliminarProyecto(int idProyecto){
        PreparedStatement stmt = null;

        String query        ="UPDATE proyecto "
                            +"SET estado = false "
                            +"WHERE idProyecto = ? ";
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
    
    public void habilitarProyecto(int idProyecto){
        PreparedStatement stmt = null;

        String query        ="UPDATE proyecto "
                            +"SET estado = true "
                            +"WHERE idProyecto = ? ";
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idProyecto);
            
            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog( null, "Proyecto habilitado"  + " " + JOptionPane.INFORMATION_MESSAGE );
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
    
    
    public List listarProyectosHabilitados(){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List <Proyecto> listaHabilitados = new ArrayList<Proyecto>();
        
        String query    = "SELECT * "
                        + "FROM proyecto "
                        + "WHERE estado = 1 "
                        + "ORDER BY proyecto.nombre";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                Proyecto proyectoN = new Proyecto();
                proyectoN.setId_proyecto(resultado.getInt("idProyecto"));
                proyectoN.setNombre(resultado.getString("nombre"));
                proyectoN.setDescripcion(resultado.getString("descripcion"));
                proyectoN.setFecha_inicio(resultado.getDate("fechaInicio").toLocalDate());
                proyectoN.setEstado(resultado.getBoolean("estado"));
                listaHabilitados.add(proyectoN);
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
    
    public List listarProyectosDeshabilitados(){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List <Proyecto> listaDeshabilitados = new ArrayList<Proyecto>();
        
        String query    = "SELECT * "
                        + "FROM proyecto "
                        + "WHERE estado = 0 "
                        + "ORDER BY proyecto.nombre";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                Proyecto proyectoN = new Proyecto();
                proyectoN.setId_proyecto(resultado.getInt("idProyecto"));
                proyectoN.setNombre(resultado.getString("nombre"));
                proyectoN.setDescripcion(resultado.getString("descripcion"));
                proyectoN.setFecha_inicio(resultado.getDate("fechaInicio").toLocalDate());
                proyectoN.setEstado(resultado.getBoolean("estado"));
                listaDeshabilitados.add(proyectoN);
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
        
        return listaDeshabilitados;
    }
    
    public List listarTodosProyectos(){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List <Proyecto> listarTodos = new ArrayList<Proyecto>();
        
        String query    = "SELECT * "
                        + "FROM proyecto "
                        + "ORDER BY proyecto.nombre";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                Proyecto proyectoN = new Proyecto();
                proyectoN.setId_proyecto(resultado.getInt("idProyecto"));
                proyectoN.setNombre(resultado.getString("nombre"));
                proyectoN.setDescripcion(resultado.getString("descripcion"));
                proyectoN.setFecha_inicio(resultado.getDate("fechaInicio").toLocalDate());
                proyectoN.setEstado(resultado.getBoolean("estado"));
                listarTodos.add(proyectoN);
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
}
