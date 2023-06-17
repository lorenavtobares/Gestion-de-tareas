package Modelo;


public class Miembro {
    private int id_miembro;
    private int dni;
    private String password;
    private String apellido;
    private String nombre;
    private boolean estado;
    private String rolSistema;

    public Miembro(int id_miembro, int dni, String password, String apellido, String nombre, boolean estado, String rolSistema) {
        this.id_miembro = id_miembro;
        this.dni = dni;
        this.password = password;
        this.apellido = apellido;
        this.nombre = nombre;
        this.estado = estado;
        this.rolSistema = rolSistema;
    }

    public Miembro(int dni, String password, String apellido, String nombre, boolean estado, String rolSistema){
        this.dni = dni;
        this.password = password;
        this.apellido = apellido;
        this.nombre = nombre;
        this.estado = estado;
        this.rolSistema = rolSistema;
    }

    public Miembro(int id_miembro, int dni, String password, String apellido, String nombre, String rolSistema) {
        this.id_miembro = id_miembro;
        this.dni = dni;
        this.password = password;
        this.apellido = apellido;
        this.nombre = nombre;
        this.rolSistema = rolSistema;
    }

    public Miembro() {
    }
    
    public int getId_miembro() {
        return id_miembro;
    }

    public void setId_miembro(int id_miembro) {
        this.id_miembro = id_miembro;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String getRolSistema() {
        return rolSistema;
    }

    public void setRolSistema(String rolSistema) {
        this.rolSistema = rolSistema;
    }
/*
    @Override
    public String toString() {
        return  apellido + " " + nombre;
    }

    
*/

    @Override
    public String toString() {
        return "Miembro{" + "id_miembro=" + id_miembro + ", dni=" + dni + ", password=" + password + ", apellido=" + apellido + ", nombre=" + nombre + ", estado=" + estado + ", rolSistema=" + rolSistema + '}';
    }
    
    
    
    
    
}
