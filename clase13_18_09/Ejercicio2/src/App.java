import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear instancia del scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear instancia del traductor
        EnglishSpanishTranslator traductor = new EnglishSpanishTranslator();

        // Cargar datos iniciales
        do {
            traductor.cargarDatosIniciales();
            System.out.println("---------------------------------------");
            System.out.println("Bienvenido al Traductor Inglés-Español");
            System.out.println("---------------------------------------" + "\n");
            System.out.println("Ingrese una palabra en inglés para traducir o 'salir' para terminar:");

            String palabra = scanner.nextLine();

            if (palabra.equalsIgnoreCase("salir")) {
                System.out.println("Gracias por usar el traductor. ¡Hasta luego!");
                break;
            }

            traductor.buscarPalabra(palabra);
        } while (true);
        scanner.close();
    }
}
