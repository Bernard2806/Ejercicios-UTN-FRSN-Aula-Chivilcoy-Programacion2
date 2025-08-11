public class App {
    public static void main(String[] args) throws Exception {
        // Inciamos el scanner para leer datos
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Inciamos el un objeto Alumno
        Alumno alumno = new Alumno();

        // Pedimos los datos del alumno
        System.out.println("=== REGISTRO DE ALUMNO ===");
        System.out.print("Ingrese el legajo: ");
        alumno.legajo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el nombre: ");
        alumno.nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido: ");
        alumno.apellido = scanner.nextLine();

        // Mostramos los datos del alumno
        mostrarDatos(alumno);
        scanner.nextLine(); // Esperar a que el usuario presione cualquier tecla para continuar

        // Mostramos otros datos (sección datos directos)
        System.out.println("=== DATOS DIRECTOS ===");
        System.out.println("Legajo: " + alumno.legajo);
        System.out.println("Nombre completo: " + alumno.nombre + " " + alumno.apellido);

        // Cerramos el scanner
        scanner.close();
    }

    public static void mostrarDatos(Alumno alumno) {
        System.out.println("=== DATOS DEL ALUMNO ===");
        System.out.println("Legajo: " + alumno.legajo);
        System.out.println("Nombre: " + alumno.nombre);
        System.out.println("Apellido: " + alumno.apellido);
        System.out.println("Nombre completo: " + alumno.nombre + " " + alumno.apellido);
        System.out.println("Hola, soy " + alumno.nombre + " " + alumno.apellido + " y mi legajo es " + alumno.legajo);
    }
}
