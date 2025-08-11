import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0; // Variable para almacenar el resultado (Inicializada en 0)

        String artAscii = """
                   _____      _            _           _
                  / ____|    | |          | |         | |
                 | |     __ _| | ___ _   _| | __ _  __| | ___   __ _ _ __ __ _
                 | |    / _` | |/ __| | | | |/ _` |/ _` |/ _ \\ / _` | '__/ _` |
                 | |___| (_| | | (__| |_| | | (_| | (_| | (_) | (_| | | | (_| |
                  \\_____\\__,_|_|\\___|\\__,_|_|\\__,_|\\__,_|\\___/ \\__,_|_|  \\__,_|


                """;

        System.out.println(artAscii);

        System.out.println("Presione cualquiera tecla para iniciar la calculadora...");
        scanner.nextLine(); // Espera a que el usuario presione una tecla

        ConsoleUtils.clear(); // Limpia la consola - Clase ConsoleUtils (Externa)

        System.out.println("--- Calculadora Simple ---");

        System.out.print("Ingrese el primer número:");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int operacion = scanner.nextInt();

        switch (operacion) {
            case 1 -> resultado = Calculadora.sumar(num1, num2); // Llama a la función sumar de la clase Calculadora
            case 2 -> resultado = Calculadora.restar(num1, num2); // Llama a la función restar de la clase Calculadora
            case 3 -> resultado = Calculadora.multiplicar(num1, num2); // Llama a la función multiplicar de la clase Calculadora
            case 4 -> resultado = Calculadora.dividir(num1, num2); // Llama a la función dividir de la clase Calculadora
            default -> System.out.println("Operación no válida.");
        }

        System.out.println("El resultado es: " + resultado);
        scanner.nextLine();
        scanner.close();
    }
}
