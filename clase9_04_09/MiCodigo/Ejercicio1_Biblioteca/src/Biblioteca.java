// Importamos ArrayList
import java.util.ArrayList;

public class Biblioteca {

    // Atributos de la Clase Biblioteca

    private ArrayList<Libro> libros;

    // Constructor de la Clase Biblioteca

    // Con Parametro
    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    // Sin Parametro
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Metodos de la Clase Biblioteca

    // Prestar Libro
    public void prestarLibro(String titulo) throws exceptions.LibroNoEncontradoException, exceptions.LibroYaPrestadoException {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
                    return;
                } else {
                    throw new exceptions.LibroYaPrestadoException("El libro \"" + titulo + "\" ya está prestado.");
                }
            }
        }
        throw new exceptions.LibroNoEncontradoException("El libro \"" + titulo + "\" no se encuentra en la biblioteca.");
    }

    // Devolver Libro
    public void devolverLibro(String titulo) throws exceptions.LibroNoEncontradoException, exceptions.LibroYaDisponibleException {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!libro.isDisponible()) {
                    libro.setDisponible(true);
                    System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
                    return;
                } else {
                    throw new exceptions.LibroYaDisponibleException("El libro \"" + titulo + "\" ya está disponible.");
                }
            }
        }
        throw new exceptions.LibroNoEncontradoException("El libro \"" + titulo + "\" no se encuentra en la biblioteca.");
    }

}
