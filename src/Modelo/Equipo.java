package Modelo;

import java.time.LocalDate;

public class Equipo {
    private int id_equipo;
    private int id_proyecto;
    private String nombre;
    private LocalDate fecha_cracion;
    private boolean estado;

    public Equipo(int id_equipo, int id_proyecto, String nombre, LocalDate fecha_cracion, boolean estado) {
        this.id_equipo = id_equipo;
        this.id_proyecto = id_proyecto;
        this.nombre = nombre;
        this.fecha_cracion = fecha_cracion;
        this.estado = estado;
    }

    public Equipo(int id_equipo, int id_proyecto, String nombre, LocalDate fecha_cracion) {
        this.id_equipo = id_equipo;
        this.id_proyecto = id_proyecto;
        this.nombre = nombre;
        this.fecha_cracion = fecha_cracion;
    }

    public Equipo(int id_proyecto, String nombre, LocalDate fecha_cracion, boolean estado) {
        this.id_proyecto = id_proyecto;
        this.nombre = nombre;
        this.fecha_cracion = fecha_cracion;
        this.estado = estado;
    }
    
    //se agrego
    public Equipo(String nombre, LocalDate fecha_cracion, boolean estado) {
        this.nombre = nombre;
        this.fecha_cracion = fecha_cracion;
        this.estado = estado;
    }
    
    

    public Equipo() {
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_cracion() {
        return fecha_cracion;
    }

    public void setFecha_cracion(LocalDate fecha_cracion) {
        this.fecha_cracion = fecha_cracion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Equipo{" + "id_equipo=" + id_equipo + ", id_proyecto=" + id_proyecto + ", nombre=" + nombre + ", fecha_cracion=" + fecha_cracion + ", estado=" + estado + '}';
    }
    
    
    
}
