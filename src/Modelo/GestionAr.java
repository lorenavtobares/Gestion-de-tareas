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
        LocalDate ff = LocalDate.of(2021, 01, 23);
        String name = "Coraje el Perro Cobarde 2";
        
        Miembro varMiembro = new Miembro(45382543,"4321","Soloa__","Marcos",true,"admin");
        MiembroData varMiembroData = new MiembroData();
        
        Proyecto varProyecto = new Proyecto("Proyecto Mandibula__", "Soy una descripcion" , ff , true);
        ProyectoData varProyectoData = new ProyectoData();
        
        Equipo varEquipo = new Equipo(varProyectoData.buscarProyecto(3), "Equipo de Prueba 1", ff, true);
        EquipoData varEquipoData = new EquipoData();
        
        EquipoMiembros varEquipoMiembros = new EquipoMiembros(3, name, ff, varEquipoData.buscarEquipo(3), varMiembroData.buscarMiembro(5));
        EquipoMiembrosData varEquiposMiembrosData = new EquipoMiembrosData();
        
        Tarea varTarea = new Tarea();
        TareaData varTareaData = new TareaData();
        
        Comentarios varComentarios = new Comentarios(name,ff,varTareaData.buscarTarea(1));
        ComentariosData varComentariosData = new ComentariosData();
        
        java.util.List <Proyecto> listaProyectos = new ArrayList<Proyecto>();
        java.util.List <Equipo> listaEquipos = new ArrayList<Equipo>();
        java.util.List <Miembro> listaMiembros = new ArrayList<Miembro>();
        java.util.List <EquipoMiembros> listaEquipoMiembros = new ArrayList<EquipoMiembros>();
        
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
        // System.out.println(varEquiposMiembrosData.buscarEquipoMiembros(3).toString());
        
        // - Update
        // varEquiposMiembrosData.actualizarEquipoMiembros(varEquipoMiembros);

        // - Delete
        // varEquiposMiembrosData.eliminarMiembros(3);
        
        // - Listar Equipos Miembros
        // System.out.println(varEquiposMiembrosData.listarEquiposMiembros().toString());
    }
}
