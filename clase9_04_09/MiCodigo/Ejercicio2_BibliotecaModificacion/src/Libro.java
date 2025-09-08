public class Libro {

    // Atributos de la Clase Libro

    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor de la Clase Libro

    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // toString
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", disponible=" + disponible + "]";
    }
}
