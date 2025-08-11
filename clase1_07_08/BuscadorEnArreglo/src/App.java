import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Inciamos un Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializamos un arreglo de enteros
        int[] arreglo = new int[10];

        // Creamos una instancia de Buscador
        Buscador buscador = new Buscador();

        // Llamamos al método para cargar el arreglo
        buscador.cargarArreglo(arreglo, scanner);

        // Pedimos al usuario que ingrese el valor a buscar
        System.out.print("Ingrese el valor a buscar en el arreglo: ");
        int valorBuscado = scanner.nextInt();

        // Llamamos al método para buscar el valor en el arreglo
        buscador.buscarEnArreglo(arreglo, valorBuscado);

        // Cerramos el Scanner
        scanner.close();
    }
}