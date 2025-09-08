public class Libro {

    // Atributos de la Clase Libro

    private String titulo;
    private String autor;
    private int copias;

    // Constructor de la Clase Libro

    public Libro(String titulo, String autor, int copias) {
        this.titulo = titulo;
        this.autor = autor;
        this.copias = copias;
    }

    // Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    // toString
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", copias=" + copias + "]";
    }
}