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
        

                /*|--------------------|*/
                /*|      Variables     |*/
                /*|--------------------|*/
                
        LocalDate ff = LocalDate.of(2021, 01, 23);
        LocalDate tareaInicio = LocalDate.of(2023, 02, 21);
        LocalDate tareaFin = LocalDate.of(2023, 04, 14);
        String Rol1 = "Project Manager";
        String Rol2 = "Lider de Equipo";
        String Rol3 = "Diseñador UX y UI";
        String Rol4 = "Desarrollador de Software";
        String comentario1 = "Comentario 2 nuevo comentario";
        
        Miembro varMiembro = new Miembro(21437839,"123","Perez","Roberto",true,"usuario");
        MiembroData varMiembroData = new MiembroData();
        
        Proyecto varProyecto = new Proyecto("Proyecto Mandibula__", "Soy una descripcion" , ff , true);
        ProyectoData varProyectoData = new ProyectoData();
        
        Equipo varEquipo = new Equipo(varProyectoData.buscarProyecto(4), "Equipo de Desarrollo 4", ff, true);
        EquipoData varEquipoData = new EquipoData();
        
        EquipoMiembros varEquipoMiembros = new EquipoMiembros(Rol4, ff, varEquipoData.buscarEquipo(4), varMiembroData.buscarMiembro(7));
        EquipoMiembrosData varEquiposMiembrosData = new EquipoMiembrosData();
        
       // Tarea varTarea = new Tarea("Tarea ingresada de Main", tareaInicio, tareaFin, 1, "descripcion",  varEquiposMiembrosData.buscarEquipoMiembros(16));
       // TareaData varTareaData = new TareaData();
        
        //Comentarios varComentarios = new Comentarios(comentario1 ,ff ,varTareaData.buscarTarea(3));
        //ComentariosData varComentariosData = new ComentariosData();


                /*|--------------------|*/
                /*|       Listas       |*/
                /*|--------------------|*/
        
        java.util.List <Proyecto> listaProyectos = new ArrayList<Proyecto>();
        java.util.List <Equipo> listaEquipos = new ArrayList<Equipo>();
        java.util.List <Miembro> listaMiembros = new ArrayList<Miembro>();
        java.util.List <EquipoMiembros> listaEquipoMiembros = new ArrayList<EquipoMiembros>();
        java.util.List <Tarea> listaTareas = new ArrayList<Tarea>();
        java.util.List <Comentarios> listaComentarios = new ArrayList<Comentarios>();
        
        
                /*|------------------------------|*/
                /*|    Pruebas de los metodos    |*/
                /*|------------------------------|*/
        
        
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
        
    /* <<-- EQUIPOS DATA -->> */
        // - Create
        // varEquipoData.GuardarEquipo(varEquipo);
        
        // - Read 
        // System.out.println(varEquipoData.buscarEquipo(3).toString());
        
        // - Update
        // varEquipoData.actualizarEquipo(varEquipo);
        
        // - Delete
        // varEquipoData.eliminarEquipo(3);
        
        // - Habiltiar equipo
        // varEquipoData.habilitarEquipo(3);
        
        // - ListarHabilitados
        // listaEquipos = varEquipoData.listarEquiposHabilitados();
        // for (Equipo e : listaEquipos) {
        //    System.out.println(e.toString());
        // }
        
        // - Listar Deshabilitados
        // listaEquipos = varEquipoData.listarEquiposDeshabilitados();
        // for (Equipo e : listaEquipos) {
        // System.out.println(e.toString());
        // }
        
        // - Listar Todos
        // listaEquipos = varEquipoData.listarTodosEquipos();
        // for (Equipo e : listaEquipos) {
        //    System.out.println(e.toString());
        // }
        
    /* <<-- MIEMBROS DATA -->> */
        // - Create
        // varMiembroData.guardarMiembro(varMiembro);
        
        // - Read 
        //System.out.println(varMiembroData.buscarMiembro(5).toString());
        
        // - Update
        // varMiembroData.actualizarMiembro(varMiembro);
        
        // - Delete
        // varMiembroData.eliminarMiembro(5);
        
        // - Habiltiar equipo
        // varMiembroData.habilitarMiembro(5);
        
        // - ListarHabilitados
        // listaMiembros = varMiembroData.listarHabilitados();
        // for (Miembro e : listaMiembros) {
        //    System.out.println(e.toString());
        // }
        
        // - Listar Deshabilitados
        // listaMiembros = varMiembroData.listarNoHabilitados();
        // for (Miembro e : listaMiembros) {
        //    System.out.println(e.toString());
        // }
        
        // - Listar Todos
        // listaMiembros = varMiembroData.listarTodosMiembros();
        // for (Miembro e : listaMiembros) {
        //    System.out.println(e.toString());
        // }
        
    /* <<-- EQUIPO MIEMBROS DATA -->> */ 
        // - Create
        // varEquiposMiembrosData.guardarEquipoMiembros(varEquipoMiembros);
        
        // - Read 
        //System.out.println(varEquiposMiembrosData.buscarEquipoMiembros(3).toStringCompleto());
        
        // - Update
        // varEquiposMiembrosData.actualizarEquipoMiembros(varEquipoMiembros);

        // - Delete
        // varEquiposMiembrosData.eliminarMiembros(3);
        
        // - Listar Equipos Miembros
        // System.out.println(varEquiposMiembrosData.listarEquiposMiembros().toString()); 
    
    /* <<-- TAREA DATA -->> */ 
        // - Create
        //System.out.println("VarTarea -> " + varTarea.toStringCompleto());
        //varTareaData.guardarTarea(varTarea);
        
        
        // - Read 
        // System.out.println(varTareaData.buscarTarea(3).toString());
        
        // - Update
        // varEquiposMiembrosData.actualizarEquipoMiembros(varEquipoMiembros);
        // varTareaData.actualizarTarea(varTarea);

        // - Delete
        // varTareaData.eliminarTarea(3);
        
        // - Habilitar Tarea
        // varTareaData.habilitarTarea(3);
        
        // - Listar Tareas Habilitadas
        // listaTareas = varTareaData.listarTareasHabilitadas();
        // for (Tarea e : listaTareas) {
        //    System.out.println(e.toString());
        // }
        
        // - Listar Tareas Deshabilitdas
        // listaTareas = varTareaData.listarTareasDeshabilitadas();
        // for (Tarea e : listaTareas) {
        //    System.out.println(e.toString());
        // }
        
        // - Listar Todas las tareas
        // listaTareas = varTareaData.listarTodasTareas();
        // for (Tarea e : listaTareas) {
        //    System.out.println(e.toString());
        // }
        
        
    /* <<-- COMENTARIOS DATA -->> */ 
        // - Create
        // varComentariosData.guardarComentarios(varComentarios);
        
        // - Read
        // System.out.println(varComentariosData.buscarComentarios(2).toString());
        
        // - Update
        // varComentariosData.actualizarComentarios(varComentarios);
        
        // - Delete
        // varComentariosData.eliminarComentarios(2);
        
        // - Listar todos los comentarios
        // listaComentarios = varComentariosData.listarTodosComentarios();
        // for (Comentarios e : listaComentarios) {
        //    System.out.println(e.toString());
        // }
        
    }
}
