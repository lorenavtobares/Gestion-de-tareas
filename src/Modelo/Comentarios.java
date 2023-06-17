package Modelo;

import java.time.LocalDate;

public class Comentarios {
    private int id_comentario;
    private String comentario;
    private LocalDate fecha_avance;
    private Tarea tarea;

    
    
                /*|--------------------|*/
                /*|    Constructores   |*/
                /*|--------------------|*/
    
    public Comentarios(int id_comentario, String comentario, LocalDate fecha_avance, Tarea tarea) {
        this.id_comentario = id_comentario;
        this.comentario = comentario;
        this.fecha_avance = fecha_avance;
        this.tarea = tarea;
    }

    public Comentarios(String comentario, LocalDate fecha_avance, Tarea tarea) {
        this.comentario = comentario;
        this.fecha_avance = fecha_avance;
        this.tarea = tarea;
    }

    public Comentarios() {
    }

    
    
                /*|------------------------|*/
                /*|         Getters        |*/
                /*|------------------------|*/
    
    public int getId_comentario() {
        return id_comentario;
    }
    
    public Tarea getTarea() {
        return tarea;
    }
    
    public String getComentario() {
        return comentario;
    }

    public LocalDate getFecha_avance() {
        return fecha_avance;
    }
    
    
    
                /*|------------------------|*/
                /*|         Setters        |*/
                /*|------------------------|*/
    
    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }   

    public void setFecha_avance(LocalDate fecha_avance) {
        this.fecha_avance = fecha_avance;
    }


                /*|-------------------------|*/
                /*|         ToString        |*/
                /*|-------------------------|*/
    
    @Override
    public String toString() {
        return  "Comentarios{" + 
                "\nid_comentario => " + id_comentario + 
                "\ntarea => " + tarea + 
                "\ncomentario => " + comentario + 
                "\nfecha_avance => " + fecha_avance + 
                "\n}";
    }
}
