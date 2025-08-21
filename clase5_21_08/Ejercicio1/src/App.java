public class App {
    public static void main(String[] args) throws Exception {
        // Creamos 2 Libros y 1 Revista

        Libro libro1 = new Libro("El Principito", 1943, "Antoine de Saint-Exupéry", 96);
        Libro libro2 = new Libro("Cien Años de Soledad", 1967, "Gabriel García Márquez", 417);

        Revista revista1 = new Revista("National Geographic", 2023, 1, 5);

        // Mostramos la Información de los 3

        libro1.mostrarInfo();
        libro2.mostrarInfo();
        revista1.mostrarInfo();

        // Prestamos uno

        libro1.prestar();

        // Volvemos a intentar a Prestarlo

        libro1.prestar();

        // Mostramos la Información de el Libro Prestado

        libro1.mostrarInfo();

        // Devolvemos ese Libro

        libro1.devolver();

        // Volvemos a mostrar la Información de ese Libro

        libro1.mostrarInfo();
    }
}
