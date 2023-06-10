package Modelo;

import Controlador.*;
import Vistas.Login;
import java.sql.Date;
import java.time.LocalDate;


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
        
    /* <<-- PROYECTO DATA -->> */
        // varProyectoData.guardarProyecto(varProyecto); // Create
        // System.out.println( varProyectoData.buscarProyecto(3).toString()); // Read
        // varProyectoData.actualizarProyecto(varProyecto);  // Update
        // varProyectoData.eliminarProyecto(3);  //Delete
        
    /* <<-- EQUIPO DATA -->> */
        
        
    }
}
