package Modelo;

import java.time.LocalDate;

public class Equipo {
    private int id_equipo;
    private Proyecto proyecto;
    private String nombre;
    private LocalDate fecha_cracion;
    private boolean estado;

    
    
                /*|--------------------|*/
                /*|    Constructores   |*/
                /*|--------------------|*/
    
    public Equipo(int id_equipo, Proyecto proyecto, String nombre, LocalDate fecha_cracion, boolean estado) {
        this.id_equipo = id_equipo;
        this.proyecto = proyecto;
        this.nombre = nombre;
        this.fecha_cracion = fecha_cracion;
        this.estado = estado;
    }

    public Equipo(int id_equipo, Proyecto proyecto, String nombre, LocalDate fecha_cracion) {
        this.id_equipo = id_equipo;
        this.proyecto = proyecto;
        this.nombre = nombre;
        this.fecha_cracion = fecha_cracion;
    }
    
    //Se agrega para crear un equipo, sin un proyecto vinculado
    public Equipo(int id_equipo, String nombre, LocalDate fecha_cracion, boolean estado) {
        this.id_equipo = id_equipo;
        this.nombre = nombre;
        this.fecha_cracion = fecha_cracion;
        this.estado = estado;
    }

    public Equipo(Proyecto proyecto, String nombre, LocalDate fecha_cracion, boolean estado) {
        this.proyecto = proyecto;
        this.nombre = nombre;
        this.fecha_cracion = fecha_cracion;
        this.estado = estado;
    }
    
    public Equipo(String nombre, LocalDate fecha_cracion, boolean estado) {
        this.nombre = nombre;
        this.fecha_cracion = fecha_cracion;
        this.estado = estado;
    }

    public Equipo() {
    }

    
    
                /*|------------------------|*/
                /*|         Getters        |*/
                /*|------------------------|*/
    
    public int getId_equipo() {
        return id_equipo;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public LocalDate getFecha_cracion() {
        return fecha_cracion;
    }
    
    public boolean getEstado() {
        return estado;
    }
    
    
                /*|------------------------|*/
                /*|         Setters        |*/
                /*|------------------------|*/
    
    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_cracion(LocalDate fecha_cracion) {
        this.fecha_cracion = fecha_cracion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    
                /*|-------------------------|*/
                /*|         ToString        |*/
                /*|-------------------------|*/    
    
    @Override
    public String toString() {
        return  nombre ;
    }
    
}
