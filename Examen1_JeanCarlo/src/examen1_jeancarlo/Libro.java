
package examen1_jeancarlo;

public class Libro {
    
    String titulo;
    String Descripcion;
    int puntaje;
    int copias;
    String genero;
    int valor;
    String autor;
    String publicacion;

    public Libro() {
    }

    public Libro(String titulo, String Descripcion, int puntaje, int copias, String genero, int valor, String autor, String publicacion) {
        this.titulo = titulo;
        this.Descripcion = Descripcion;
        this.puntaje = puntaje;
        this.copias = copias;
        this.genero = genero;
        this.valor = valor;
        this.autor = autor;
        this.publicacion = publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", Descripcion=" + Descripcion + ", puntaje=" + puntaje + ", copias=" + copias + ", genero=" + genero + ", valor=" + valor + ", autor=" + autor + ", publicacion=" + publicacion + '}';
    }
    
    
    
}
