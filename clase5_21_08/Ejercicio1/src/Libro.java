public class Libro extends Publicacion {

    // Atributos de la Clase Libro

    private String autor;
    private int paginas;

    // Constructor

    public Libro(String titulo, int anio, String autor, int paginas) {
        super(titulo, anio); // Llamamos al constructor de la clase padre Publicacion
        this.autor = autor;
        this.paginas = paginas;
    }

    // Getters y Setters

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    // Metodo sobreescrito viene de la Clase Publicación

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Usamos super para llamar a la función de la Clase Padre (Publicación). Esto para mostrar los otros atributos.
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }
}
