import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Iniciamos el escáner
        Scanner scanner = new Scanner(System.in);

        // Creamos un ArrayList de Videojuegos
        ArrayList<Videojuego> videojuegos = new ArrayList<>();

        // Pedimos al usuario que ingrese los datos de los 4 videojuegos

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el nombre del videojuego (" + (i + 1) + "):");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el genero del videojuego (" + (i + 1) + "):");
            String genero = scanner.nextLine();

            // Creamos un objeto Videojuego y lo agregamos al ArrayList
            Videojuego videojuego = new Videojuego(nombre, genero);
            videojuegos.add(videojuego);
        }

        // Mostramos los videojuegos ingresados usando for-each

        System.out.println("Videojuegos ingresados:");
        for (Videojuego v : videojuegos) {
            System.out.println(v);
        }

        // Mostramos los videojuegos mostrando su indice

        System.out.println("Videojuegos con su índice:");
        for (int i = 0; i < videojuegos.size(); i++) {
            System.out.println((i + 1) + ": " + videojuegos.get(i));
        }

        // Buscamos un juego especifico por el nombre

        System.out.println("Ingrese el nombre del videojuego a buscar:");
        String nombreBuscado = scanner.nextLine();

        boolean encontrado = false;

        for (Videojuego v : videojuegos) {
            if (v.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Videojuego encontrado: " + v);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Videojuego no encontrado.");
        }

        // Mostramos la cantidad de videojuegos en el ArrayList

        System.out.println("Cantidad de videojuegos en la lista: " + videojuegos.size());

        // Buscamos un juego especifico por el nombre

        System.out.println("Ingrese el nombre del videojuego a eliminar:");
        String nombreEliminado = scanner.nextLine();

        boolean encontradoEliminado = false;

        for (Videojuego v : videojuegos) {
            if (v.getNombre().equalsIgnoreCase(nombreEliminado)) {
                System.out.println("Videojuego encontrado: " + v);
                encontradoEliminado = true;
                videojuegos.remove(v);
                break;
            }
        }

        if (!encontradoEliminado) {
            System.out.println("Videojuego no encontrado. Si no está en la lista, puede que ya haya sido eliminado o no existe.");
        }

        // Mostramos la cantidad de videojuegos en el ArrayList

        System.out.println("Cantidad de videojuegos en la lista: " + videojuegos.size());

        // Mostramos los videojuegos restantes
        System.out.println("Videojuegos restantes:");
        for (Videojuego v : videojuegos) {
            System.out.println(v);
        }

        // Mostramos los videojuegos segun el genero
        System.out.println("Ingrese el género de los videojuegos a mostrar:");
        String generoBuscado = scanner.nextLine();

        boolean encontradoGenero = false;

        for (Videojuego v : videojuegos) {
            if (v.getGenero().equalsIgnoreCase(generoBuscado)) {
                System.out.println(v);
                encontradoGenero = true;
            }
        }

        if (!encontradoGenero) {
            System.out.println("No se encontraron videojuegos del género: " + generoBuscado);
        }

        // Cerramos el escáner

        scanner.close();
    }
}
