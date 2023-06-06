package Modelo;


public class Miembro {
    private int id_miembro;
    private int dni;
    private String password;
    private String apellido;
    private String nombre;
    private boolean estado; 

    public Miembro(int id_miembro, int dni, String password, String apellido, String nombre, boolean estado) {
        this.id_miembro = id_miembro;
        this.dni = dni;
        this.password = password;
        this.apellido = apellido;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Miembro(int dni, String password, String apellido, String nombre, boolean estado) {
        this.dni = dni;
        this.password = password;
        this.apellido = apellido;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Miembro(int id_miembro, int dni, String password, String apellido, String nombre) {
        this.id_miembro = id_miembro;
        this.dni = dni;
        this.password = password;
        this.apellido = apellido;
        this.nombre = nombre;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Miembro{" + "id_miembro=" + id_miembro + ", dni=" + dni + ", password=" + password + ", apellido=" + apellido + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
}
