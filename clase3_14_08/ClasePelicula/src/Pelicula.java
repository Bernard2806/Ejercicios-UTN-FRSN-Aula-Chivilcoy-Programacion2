public class Pelicula {

    // Atributos de la clase Pelicula

    /// Titulo de la pelicula
    private String titulo;

    /// Director de la pelicula
    private String director;

    /// Duracion de la pelicula (en minutos)
    private int duracion;

    /// Booleano que indica si la pelicula ha sido vista
    private boolean vista;

    // Constructores de la clase Pelicula

    // Constructor completo
    public Pelicula(String titulo, String director, int duracion, boolean vista) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.vista = vista;
    }

    // Constructor sin estado
    public Pelicula(String titulo, String director, int duracion) {
        this(titulo, director, duracion, false);
    }

    // Constructor basico
    public Pelicula(String titulo, String director) {
        this(titulo, director, 0, false);
    }

    // Metodos de la Clase Pelicula

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public boolean getVista() {
        return vista;
    }

    // Setters con validación
    public void setTitulo(String titulo) {
        // Verificamos que el titulo no este vacio
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        }
    }

    public void setDuracion(int duracion) {
        // Verificamos que la duración no sea 0 o menor a 0
        if (duracion > 0) {
            this.duracion = duracion;
        }
    }

    // Setters sin validación
    public void setDirector(String director) {
        this.director = director;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    // Metodo para marcar la Pelicula como vista
    public void marcarComoVista() {
        this.vista = true;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracion=" + duracion +
                ", vista=" + vista +
                '}';
    }
}