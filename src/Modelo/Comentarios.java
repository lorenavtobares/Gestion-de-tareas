package Modelo;

import java.time.LocalDate;

public class Comentarios {
    private int id_comentario;
    private int id_tarea;
    private String comentario;
    private LocalDate fecha_avance;

    public Comentarios(int id_comentario, int id_tarea, String comentario, LocalDate fecha_avance) {
        this.id_comentario = id_comentario;
        this.id_tarea = id_tarea;
        this.comentario = comentario;
        this.fecha_avance = fecha_avance;
    }

    public Comentarios(int id_tarea, String comentario, LocalDate fecha_avance) {
        this.id_tarea = id_tarea;
        this.comentario = comentario;
        this.fecha_avance = fecha_avance;
    }

    public Comentarios() {
    }

    public int getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

    public int getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFecha_avance() {
        return fecha_avance;
    }

    public void setFecha_avance(LocalDate fecha_avance) {
        this.fecha_avance = fecha_avance;
    }

    @Override
    public String toString() {
        return "Comentarios{" + "id_comentario=" + id_comentario + ", id_tarea=" + id_tarea + ", comentario=" + comentario + ", fecha_avance=" + fecha_avance + '}';
    }
    
    
}
