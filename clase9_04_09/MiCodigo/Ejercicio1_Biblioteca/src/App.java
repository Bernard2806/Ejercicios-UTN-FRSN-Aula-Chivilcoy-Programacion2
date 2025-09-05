
// Importamos ArrayList
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Creamos 3 Libros
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", true);
        Libro libro2 = new Libro("1984", "George Orwell", false);
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", true);

        // Creamos una Lista de Libros y agregamos los libros
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);

        // Creamos la Biblioteca pasando la lista de libros
        Biblioteca miBiblioteca = new Biblioteca(libros);

        // Prestamos un Libro
        try {
            miBiblioteca.prestarLibro("El Principito");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Pasó lo que tenía que pasar.");
        }

        // Volvemos a Prestar ese mismo libro (para probar la excepción)
        try {
            miBiblioteca.prestarLibro("El Principito");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Pasó lo que tenía que pasar.");
        }

        // Devolvemos el Libro
        try {
            miBiblioteca.devolverLibro("El Principito");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Pasó lo que tenía que pasar.");
        }

        // Devolvemos un Libro que no fue prestado (para probar la excepción)
        try {
            miBiblioteca.devolverLibro("1984");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Pasó lo que tenía que pasar.");
        }
    }
}
