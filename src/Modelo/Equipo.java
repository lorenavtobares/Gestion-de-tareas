package Modelo;

import java.time.LocalDate;

public class Equipo {
    private int id_equipo;
    private Proyecto proyecto;
    private String nombre;
    private LocalDate fecha_cracion;
    private boolean estado;

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

    public Equipo(Proyecto proyecto, String nombre, LocalDate fecha_cracion, boolean estado) {
        this.proyecto = proyecto;
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

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
<<<<<<< Updated upstream
        return "Equipo{" + "id_equipo=" + id_equipo + ", proyecto=" + proyecto + ", nombre=" + nombre + ", fecha_cracion=" + fecha_cracion + ", estado=" + estado + '}';
=======
        return  "Equipo{" + 
                "id_equipo => " + id_equipo + 
                "\nproyecto => " + proyecto + 
                "\nnombre => " + nombre + 
                "\nfecha_cracion => " + fecha_cracion + 
                "\nestado => " + estado + 
                "\n}";
>>>>>>> Stashed changes
    }

    
    
    
    
}
