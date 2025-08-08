import java.util.Scanner;

public class Alumno {
    
    public int legajo;
    public String nombre;
    public String apellido;

    public void mostrarDatos(){
        System.out.println("---- Datos del Alumno ----");
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("--------------------------");
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " " + apellido + " y mi legajo es " + legajo);
    }

    public void ingresarDatos(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Ingreso de Datos del Alumno ----");

        System.out.print("Ingrese el legajo: ");
        legajo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        apellido = scanner.nextLine();

        System.out.println("-------------------------------------");


        scanner.close();
    }
}