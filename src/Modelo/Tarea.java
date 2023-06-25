package Modelo;

import java.time.LocalDate;


public class Tarea {
    private int id_tarea;
    private String nombre; 
    private LocalDate fecha_creacion;
    private LocalDate fecha_cierre;
    private int estado;
    private EquipoMiembros equipoMiembros;
    private String descripcion;
    private int idEquipoMiembros; //se agrego

    
    
                /*|--------------------|*/
                /*|    Constructores   |*/
                /*|--------------------|*/
    
  

    public Tarea(int id_tarea, String nombre, LocalDate fecha_creacion, LocalDate fecha_cierre, int estado,  EquipoMiembros equipoMiembros, String descripcion, int idEquipoMiembros) {
        this.id_tarea = id_tarea;
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_cierre = fecha_cierre;
        this.estado = estado;
        this.equipoMiembros = equipoMiembros;
        this.descripcion = descripcion;
        this.idEquipoMiembros = idEquipoMiembros;
    }

    public Tarea(String nombre, LocalDate fecha_creacion, LocalDate fecha_cierre, int estado,String descripcion, EquipoMiembros equipoMiembros) {
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_cierre = fecha_cierre;
        this.estado = estado;
        this.descripcion = descripcion;
        this.equipoMiembros = equipoMiembros;
    }

    public Tarea(int id_tarea, String nombre, LocalDate fecha_creacion, LocalDate fecha_cierre, int estado,String descripcion) {
        this.id_tarea = id_tarea;
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_cierre = fecha_cierre;
        this.estado = estado;
        this.descripcion = descripcion;
    }


    public Tarea(String nombre, LocalDate fecha_creacion, LocalDate fecha_cierre, int estado,String descripcion, int idEquipoMiembros) {
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_cierre = fecha_cierre;
        this.estado = estado;
        this.idEquipoMiembros = idEquipoMiembros;
        this.descripcion = descripcion;
       }


    
    public Tarea() {
    }

    public Tarea(int id, String nombre, LocalDate fechaCreacion, LocalDate fechaCierre, int estado, String descripcion, EquipoMiembros equipoMiembros) {
        this.id_tarea = id_tarea;
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_cierre = fecha_cierre;
        this.estado = estado;
        this.equipoMiembros = equipoMiembros;
        this.descripcion = descripcion;
      
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

    public int getEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
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

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    /*
    public String toStringCompleto() {
        return  "Tarea{" + 
                "\nid_tarea => " + id_tarea + 
                "\nnombre => " + nombre + 
                "\nfecha_creacion => " + fecha_creacion + 
                "\nfecha_cierre => " + fecha_cierre + 
                "\nestado => " + estado + 
                "\nequipoMiembros => " + equipoMiembros + 
                "\ndescripcion => " + descripcion + 
                "\nidEquipoMiembros => " + idEquipoMiembros + 
                "\n}";
    }
    

    @Override
    public String toString() {
        return "Tarea{" + "\nid_tarea => " + id_tarea + 
                "\nnombre => " + nombre + 
                "\nfecha_creacion => " + fecha_creacion + 
                "\nfecha_cierre => " + fecha_cierre + 
                "\nestado => " + estado + 
                "\nequipoMiembros => " + equipoMiembros + 
                "\ndescripcion => " + descripcion + 
                "\nidEquipoMiembros => " + idEquipoMiembros + 
                "\n}";
    
    }*/
    
}
