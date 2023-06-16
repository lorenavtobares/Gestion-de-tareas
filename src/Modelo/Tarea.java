package Modelo;

import java.time.LocalDate;


public class Tarea {
    private int id_tarea;
    private String nombre; 
    private LocalDate fecha_creacion;
    private LocalDate fecha_cierre;
    private boolean estado;
    private EquipoMiembros equipoMiembros;

    
    
                /*|--------------------|*/
                /*|    Constructores   |*/
                /*|--------------------|*/
    
    public Tarea(int id_tarea, String nombre, LocalDate fecha_creacion, LocalDate fecha_cierre, boolean estado, EquipoMiembros equipoMiembros) {
        this.id_tarea = id_tarea;
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_cierre = fecha_cierre;
        this.estado = estado;
        this.equipoMiembros = equipoMiembros;
    }

    public Tarea(String nombre, LocalDate fecha_creacion, LocalDate fecha_cierre, boolean estado ,EquipoMiembros equipoMiembros) {
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_cierre = fecha_cierre;
        this.estado = estado;
        this.equipoMiembros = equipoMiembros;
    }

    public Tarea(int id_tarea, String nombre, LocalDate fecha_creacion, LocalDate fecha_cierre, boolean estado) {
        this.id_tarea = id_tarea;
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_cierre = fecha_cierre;
        this.estado = estado;
    }
    
    public Tarea() {
    }

    
    
                /*|------------------------|*/
                /*|         Getters        |*/
                /*|------------------------|*/
    
    public int getId_tarea() {
        return id_tarea;
    }

    public String getNombre() {
        return nombre;
    }
    
    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }
    
    public LocalDate getFecha_cierre() {
        return fecha_cierre;
    }

    public boolean getEstado() {
        return estado;
    }

    public EquipoMiembros getEquipoMiembros() {
        return equipoMiembros;
    }
    
                /*|------------------------|*/
                /*|         Setters        |*/
                /*|------------------------|*/
    
    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public void setFecha_cierre(LocalDate fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setEquipoMiembros(EquipoMiembros equipoMiembros) {
        this.equipoMiembros = equipoMiembros;
    }

    
                /*|-------------------------|*/
                /*|         ToString        |*/
                /*|-------------------------|*/    
    
    @Override
    public String toString() {
        return nombre;
    }

    
}
