package Modelo;

import java.time.LocalDate;

public class EquipoMiembros {
    private int id_equipo_miembros;
    private String rol; 
    private LocalDate fecha_incorporacion;
    private  Equipo equipo;
    private Miembro miembro;


    
                /*|--------------------|*/
                /*|    Constructores   |*/
                /*|--------------------|*/
    
    public EquipoMiembros(int id_equipo_miembros, String rol, LocalDate fecha_incorporacion, Equipo equipo, Miembro miembro) {
        this.id_equipo_miembros = id_equipo_miembros;
        this.rol = rol;
        this.fecha_incorporacion = fecha_incorporacion;
        this.equipo = equipo;
        this.miembro = miembro;
    }

    public EquipoMiembros(String rol, LocalDate fecha_incorporacion, Equipo equipo, Miembro miembro) {
        this.rol = rol;
        this.fecha_incorporacion = fecha_incorporacion;
        this.equipo = equipo;
        this.miembro = miembro;
    }

    public EquipoMiembros() {
    }

    
    
                /*|------------------------|*/
                /*|         Getters        |*/
                /*|------------------------|*/
    
    public int getId_equipo_miembros() {
        return id_equipo_miembros;
    }

    public String getRol() {
        return rol;
    }
    
    public LocalDate getFecha_incorporacion() {
        return fecha_incorporacion;
    }
    
    public Equipo getEquipo() {
        return equipo;
    }
    
    public Miembro getMiembro() {
        return miembro;
    }
    
    
    
                /*|------------------------|*/
                /*|         Setters        |*/
                /*|------------------------|*/
    
    public void setId_equipo_miembros(int id_equipo_miembros) {
        this.id_equipo_miembros = id_equipo_miembros;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setFecha_incorporacion(LocalDate fecha_incorporacion) {
        this.fecha_incorporacion = fecha_incorporacion;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    
    
                /*|-------------------------|*/
                /*|         ToString        |*/
                /*|-------------------------|*/    
    
    @Override
    public String toString() {
        return  "EquipoMiembros{" + 
                "\nid_equipo_miembros=" + id_equipo_miembros + 
                "\nrol=" + rol + 
                "\nfecha_incorporacion=" + fecha_incorporacion + 
                "\nequipo=" + equipo + 
                "\nmiembro=" + miembro + 
                "\n}";
    }
}
