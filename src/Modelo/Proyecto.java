package Modelo;

import java.time.LocalDate;

public class Proyecto {
    private int id_proyecto;
    private String nombre;
    private String descripcion;
    private LocalDate fecha_inicio;
    private boolean estado;

    public Proyecto(int id_proyecto, String nombre, String descripcion, LocalDate fecha_inicio, boolean estado) {
        this.id_proyecto = id_proyecto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.estado = estado;
    }

    public Proyecto(int id_proyecto, String nombre, String descripcion, LocalDate fecha_inicio) {
        this.id_proyecto = id_proyecto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
    }

    public Proyecto(String nombre, String descripcion, LocalDate fecha_inicio, boolean estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.estado = estado;
    }

    public Proyecto() {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "Proyecto{" + 
                "\nid_proyecto => " + id_proyecto + 
                "\nnombre => " + nombre + 
                "\ndescripcion => " + descripcion + 
                "\nfecha_inicio => " + fecha_inicio + 
                "\nestado => " + estado + 
                "\n}";
    }
    
    
}
