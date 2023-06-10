package Modelo;

import java.time.LocalDate;


public class Tarea {
    private int id_tarea;
    private String nombre; 
    private LocalDate fecha_creacion;
    private LocalDate fecha_cierre;
    private boolean estado;
    private int id_equipo_miembros;

    public Tarea(int id_tarea, String nombre, LocalDate fecha_creacion, LocalDate fecha_cierre, boolean estado, int id_equipo_miembros) {
        this.id_tarea = id_tarea;
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_cierre = fecha_cierre;
        this.estado = estado;
        this.id_equipo_miembros = id_equipo_miembros;
    }

    public Tarea(String nombre, LocalDate fecha_creacion, LocalDate fecha_cierre, boolean estado, int id_equipo_miembros) {
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_cierre = fecha_cierre;
        this.estado = estado;
        this.id_equipo_miembros = id_equipo_miembros;
    }

    public Tarea(int id_tarea, String nombre, LocalDate fecha_creacion, LocalDate fecha_cierre, int id_equipo_miembros) {
        this.id_tarea = id_tarea;
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_cierre = fecha_cierre;
        this.id_equipo_miembros = id_equipo_miembros;
    }

    public Tarea() {
    }

    public int getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public LocalDate getFecha_cierre() {
        return fecha_cierre;
    }

    public void setFecha_cierre(LocalDate fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId_equipo_miembros() {
        return id_equipo_miembros;
    }

    public void setId_equipo_miembros(int id_equipo_miembros) {
        this.id_equipo_miembros = id_equipo_miembros;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id_tarea=" + id_tarea + ", nombre=" + nombre + ", fecha_creacion=" + fecha_creacion + ", fecha_cierre=" + fecha_cierre + ", estado=" + estado + ", id_equipo_miembros=" + id_equipo_miembros + '}';
    }
    
    
    
}
