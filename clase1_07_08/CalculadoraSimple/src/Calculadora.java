public class Calculadora {
    // Función para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Función para restar dos números
    public static int restar(int a, int b) {
        return a - b;
    }

    // Función para multiplicar dos números
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Función para dividir dos números
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }
}