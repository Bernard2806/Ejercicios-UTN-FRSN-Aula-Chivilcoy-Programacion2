public class Videojuego {

    // Atributos

    private String nombre;
    private String genero;

    // Constructor

    public Videojuego(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    // Getters y Setters

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

    // Metodo ToString

    @Override
    public String toString() {
        return "Videojuego [titulo=" + nombre + ", genero=" + genero + "]";
    }
}
