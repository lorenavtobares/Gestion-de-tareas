package Modelo;

import Controlador.*;
import Vistas.Login;
import java.awt.List;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;


public class GestionAr {
    public static void main(String[] args) {
        Login formLogin = new Login();
        formLogin.setVisible(true);
        
    //VARIABLES
        LocalDate ff = LocalDate.of(2023, 01, 23);
        
    
        Comentarios varComentarios = new Comentarios();
        ComentariosData varComentariosData = new ComentariosData();
        Equipo varEquipo = new Equipo();
        EquipoData varEquipoData = new EquipoData();
        EquipoMiembros varEquipoMiembros = new EquipoMiembros();
        EquipoMiembrosData varEquiposMiembrosData = new EquipoMiembrosData();
        Miembro varMiembro = new Miembro();
        MiembroData varMiembroData = new MiembroData();
        Proyecto varProyecto = new Proyecto("Proyecto Mandibula__", "Soy una descripcion" , ff , true);
        ProyectoData varProyectoData = new ProyectoData();
        Tarea varTarea = new Tarea();
        TareaData varTareaData = new TareaData();
        
        java.util.List <Proyecto> listaProyectos = new ArrayList<Proyecto>();
        
    /* <<-- PROYECTO DATA -->> */ 
        // - Create
        // varProyectoData.guardarProyecto(varProyecto); 
        
        // - Read
        // System.out.println( varProyectoData.buscarProyecto(3).toString());
        
        // - Update
        // varProyectoData.actualizarProyecto(varProyecto);
        
        // - Delete
        // varProyectoData.eliminarProyecto(3);  //Delete
        
        // - Habiltiar proyecto 
        // varProyectoData.habilitarProyecto(3);
        
        // - ListarHabilitados
        //listaProyectos = varProyectoData.listarProyectosHabilitados();
        //for (Proyecto e : listaProyectos) {
        //    System.out.println(e.toString());
        //}
        
        // - Listar Deshabilitados
        //listaProyectos = varProyectoData.listarProyectosDeshabilitados();
        //for (Proyecto e : listaProyectos) {
        //    System.out.println(e.toString());
        //}
        
        // - Listar Todos los proyectos
        //listaProyectos = varProyectoData.listarTodosProyectos();
        //for (Proyecto e : listaProyectos) {
        //    System.out.println(e.toString());
        //}
        
    /* <<-- EQUIPO DATA -->> */
        
<<<<<<< Updated upstream
=======
        // - Read 
        // System.out.println(varEquipoData.buscarEquipo(3).toString());
>>>>>>> Stashed changes
        
    }
}
