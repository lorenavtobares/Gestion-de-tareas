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

        /*pruebas de metodos*/
        Miembro miembro = new Miembro(45382543,"4321","Soloa","Marcos",true,"admin");
        MiembroData miembro1 = new MiembroData();
        Miembro guardado =new Miembro();
        /*metodos miembros*/
        //miembro1.guardarMiembro(miembro);
        //miembro1.actualizarMiembro(miembro);
        
        
        miembro1.eliminarMiembro(2);
        guardado = miembro1.buscarMiembro(2);
        System.out.println(guardado.toString());
        /*metodos equipo*/

        
    //VARIABLES
        LocalDate ff = LocalDate.of(2021, 01, 23);
        
    
        Comentarios varComentarios = new Comentarios();
        ComentariosData varComentariosData = new ComentariosData();
        
        EquipoMiembros varEquipoMiembros = new EquipoMiembros();
        EquipoMiembrosData varEquiposMiembrosData = new EquipoMiembrosData();

        
        Miembro varMiembro = new Miembro();
        MiembroData varMiembroData = new MiembroData();
        
        Proyecto varProyecto = new Proyecto("Proyecto Mandibula__", "Soy una descripcion" , ff , true);
        ProyectoData varProyectoData = new ProyectoData();
        
        Equipo varEquipo = new Equipo(varProyectoData.buscarProyecto(3), "Equipo de Prueba 1", ff, true);
        EquipoData varEquipoData = new EquipoData();
        
        Tarea varTarea = new Tarea();
        TareaData varTareaData = new TareaData();
        
        java.util.List <Proyecto> listaProyectos = new ArrayList<Proyecto>();
        java.util.List <Equipo> listaEquipos = new ArrayList<Equipo>();
        
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
        
        // - Read -> Verificar linea 87 de EquipoData
        // System.out.println(varEquipoData.buscarEquipo(3));
        
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
    }
}
