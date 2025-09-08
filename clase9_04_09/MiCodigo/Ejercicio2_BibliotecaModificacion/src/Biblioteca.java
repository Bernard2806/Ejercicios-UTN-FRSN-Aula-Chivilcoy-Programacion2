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
    public void prestarLibro(String titulo) throws exceptions.LibroNoEncontradoException, exceptions.SinCopiasException{
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.getCopias() > 0) {
                    libro.setCopias(libro.getCopias() - 1);
                    System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
                    System.out.println("Copias restantes: " + libro.getCopias());
                    return;
                } else {
                    throw new exceptions.SinCopiasException("No hay copias disponibles del libro \"" + titulo + "\".");
                }
            }
        }
        throw new exceptions.LibroNoEncontradoException("El libro \"" + titulo + "\" no se encuentra en la biblioteca.");
    }

    // Devolver Libro
    public void devolverLibro(String titulo) throws exceptions.LibroNoEncontradoException {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                    libro.setCopias(libro.getCopias() + 1);
                    System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
                    System.out.println("Copias disponibles: " + libro.getCopias());
                    return;
            }
        }
        throw new exceptions.LibroNoEncontradoException("El libro \"" + titulo + "\" no se encuentra en la biblioteca.");
    }

    // Mostrar inventario
    public void mostrarInventario() {
        System.out.println("Inventario de la Biblioteca:");

        if(libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }

        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - Autor: " + libro.getAutor() + " - Copias disponibles: " + libro.getCopias());
        }
    }
}