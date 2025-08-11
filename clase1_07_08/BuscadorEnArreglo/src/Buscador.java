import java.util.Scanner;

public class Buscador {

    /**
     * Método para buscar un valor en un arreglo.
     * 
     * @param arreglo      El arreglo donde se buscará el valor.
     * @param valorBuscado El valor que se desea encontrar en el arreglo.
     */

    public void buscarEnArreglo(int[] arreglo, int valorBuscado) {
        boolean encontrado = false;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                System.out.println("Valor encontrado en la posición: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Valor no encontrado en el arreglo.");
        }
    }

    /**
     * Método para cargar un arreglo con valores.
     * 
     * @param arreglo El arreglo que se desea llenar.
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     *                Este método solicita al usuario que ingrese valores para
     *                llenar el arreglo.
     */
    public void cargarArreglo(int[] arreglo, Scanner scanner) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = scanner.nextInt();
        }
    }
}
