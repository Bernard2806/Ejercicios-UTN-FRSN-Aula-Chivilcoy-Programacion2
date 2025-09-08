import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Creamos 3 Libros
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 5);
        Libro libro2 = new Libro("1984", "George Orwell", 0);
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 3);

        // Creamos una Lista de Libros y agregamos los libros
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);

        // Creamos la Biblioteca pasando la lista de libros
        Biblioteca miBiblioteca = new Biblioteca(libros);


        // Mostramos el inventario
        miBiblioteca.mostrarInventario();

        // Prestamos el Principito
        try {
            miBiblioteca.prestarLibro("El Principito");
        } catch (exceptions.LibroNoEncontradoException | exceptions.SinCopiasException e) {
            System.out.println(e.getMessage());
        }

        // Prestamos 1984
        try {
            miBiblioteca.prestarLibro("1984");
        } catch (exceptions.LibroNoEncontradoException | exceptions.SinCopiasException e) {
            System.out.println(e.getMessage());
        }

        // Devolvemos el Principito
        try {
            miBiblioteca.devolverLibro("El Principito");
        } catch (exceptions.LibroNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        // Intentamos devolver y pedir un libro que no exista

        // Devolvemos un libro que no existe
        try {
            miBiblioteca.devolverLibro("El Hobbit");
        } catch (exceptions.LibroNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        // Pedimos un libro que no existe
        try {
            miBiblioteca.prestarLibro("El Hobbit");
        } catch (exceptions.LibroNoEncontradoException | exceptions.SinCopiasException e) {
            System.out.println(e.getMessage());
        }

        
    }
}
