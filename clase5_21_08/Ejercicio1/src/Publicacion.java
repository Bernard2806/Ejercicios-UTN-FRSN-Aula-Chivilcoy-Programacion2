public class Publicacion {

    // Atributos de la clase Publicación

    private String titulo;
    private int anio;
    private boolean disponible;

    // Constructor

    public Publicacion(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
        this.disponible = true;
    }

    // Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Metodos de la Clase Publicación

    public boolean prestar(){

        // Primero verificamos si esta disponible.
        if(disponible){

            // Lo marcamos como no disponible.
            this.disponible = false;
            return true; // Como todo esta correcto, retornamos true (verdadero) (es decir que se presto)
        }
        return false; // No estaba disponible, por ende no se presto, retornamos false (falso)
    }

    public void devolver(){
        if(!disponible){
            // Lo marcamos como disponible, si estaba prestado.
            this.disponible = true;
        }
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void mostrarInfo(){
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anio);
        System.out.println("Disponible: " + disponible);
    }

    // ToString
    @Override
    public String toString() {
        return "Publicacion [titulo=" + titulo + ", anio=" + anio + ", disponible=" + disponible + "]";
    }
}
