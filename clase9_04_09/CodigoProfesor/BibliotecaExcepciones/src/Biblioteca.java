import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void prestarLibro(String titulo) throws LibroNoEncontradoException{
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    System.out.println("Libro: " + libro.getTitulo() + " prestado:).");
                    return;
                }else{
                    throw new LibroYaPrestadoException(libro.getTitulo() + " ya está prestado.");
                }
            }
        }
        throw new LibroNoEncontradoException(titulo + " no existe en esta biblioteca.");
    }

    public void devolverLibro(String titulo) throws LibroNoEncontradoException{
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!libro.isDisponible()) {
                    libro.setDisponible(true);
                    System.out.println(libro.getTitulo() + " libro devuelto exitosamente. Crack.");
                    return;
                }else{
                    throw  new LibroYaDisponibleException("El libro " + libro.getTitulo() + " ya habia sido devuelto.");                    
                }
            }
        }
        throw new LibroNoEncontradoException(titulo + " no existe en esta biblioteca.");
    }
}
