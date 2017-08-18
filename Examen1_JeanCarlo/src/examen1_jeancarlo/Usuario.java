
package examen1_jeancarlo;

import java.util.ArrayList;


public class Usuario {
    String usuario;
    String password;
    String nacimiento;
    String correo;
    String nombre;
    String genero;
    ArrayList libros;
    ArrayList amigos;

    public Usuario() {
    }

    public Usuario(String usuario, String password, String nacimiento, String correo, String nombre, String genero, ArrayList libros, ArrayList amigos) {
        this.usuario = usuario;
        this.password = password;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.nombre = nombre;
        this.genero = genero;
        this.libros = libros;
        this.amigos = amigos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList getLibros() {
        return libros;
    }

    public void setLibros(ArrayList libros) {
        this.libros = libros;
    }

    public ArrayList getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", password=" + password + ", nacimiento=" + nacimiento + ", correo=" + correo + ", nombre=" + nombre + ", genero=" + genero + ", libros=" + libros + ", amigos=" + amigos + '}';
    }
    
    
    
}
