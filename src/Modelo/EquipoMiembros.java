package Modelo;

import java.time.LocalDate;

public class EquipoMiembros {
    private int id_equipo_miembros;
    private String rol; 
    private LocalDate fecha_incorporacion;
    private int id_equipo;
    private int id_miembro;

    public EquipoMiembros(int id_equipo_miembros, String rol, LocalDate fecha_incorporacion, int id_equipo, int id_miembro) {
        this.id_equipo_miembros = id_equipo_miembros;
        this.rol = rol;
        this.fecha_incorporacion = fecha_incorporacion;
        this.id_equipo = id_equipo;
        this.id_miembro = id_miembro;
    }

    public EquipoMiembros(String rol, LocalDate fecha_incorporacion, int id_equipo, int id_miembro) {
        this.rol = rol;
        this.fecha_incorporacion = fecha_incorporacion;
        this.id_equipo = id_equipo;
        this.id_miembro = id_miembro;
    }

    public EquipoMiembros(int id_equipo_miembros, String rol, LocalDate fecha_incorporacion, int id_equipo) {
        this.id_equipo_miembros = id_equipo_miembros;
        this.rol = rol;
        this.fecha_incorporacion = fecha_incorporacion;
        this.id_equipo = id_equipo;
    }

    public EquipoMiembros() {
    }

    public int getId_equipo_miembros() {
        return id_equipo_miembros;
    }

    public void setId_equipo_miembros(int id_equipo_miembros) {
        this.id_equipo_miembros = id_equipo_miembros;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getFecha_incorporacion() {
        return fecha_incorporacion;
    }

    public void setFecha_incorporacion(LocalDate fecha_incorporacion) {
        this.fecha_incorporacion = fecha_incorporacion;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public int getId_miembro() {
        return id_miembro;
    }

    public void setId_miembro(int id_miembro) {
        this.id_miembro = id_miembro;
    }

    @Override
    public String toString() {
        return "EquipoMiembros{" + "id_equipo_miembros=" + id_equipo_miembros + ", rol=" + rol + ", fecha_incorporacion=" + fecha_incorporacion + ", id_equipo=" + id_equipo + ", id_miembro=" + id_miembro + '}';
    }
    
    
}
