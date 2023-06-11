package Modelo;

import Controlador.MiembroData;
import Vistas.Login;
import java.time.LocalDate;

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
        
    }
}
