import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class App {

    // ---- Ruta Archivo ----
    private static final String RUTA_ARCHIVO = "resource/personasFechaCSV.csv";

    // ---- GestorArchivo ----
    private static GestorArchivo gestor = new GestorArchivo(RUTA_ARCHIVO);

    // ---- Lista de Personas ----
    private static ArrayList<Persona> personas = gestor.readAllPersonsFromFile();

    // ---- Scanner ----
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int opcionMenu;

        do {
            System.out.println("\n=== SISTEMA DE CUMPLEAÑOS ===");
            System.out.println("1. Agregar nueva persona");
            System.out.println("2. Ver todas las personas");
            System.out.println("3. Reporte de cumpleaños por mes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            // Verificar entrada válida
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingrese un número válido: ");
                scanner.next();
            }

            opcionMenu = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            logicMenu(opcionMenu);

        } while (opcionMenu != 4);

        scanner.close();
        System.out.println("Programa finalizado. ¡Hasta luego!");
    }

    private static void logicMenu(int op) {
        switch (op) {
            case 1:
                addPerson();
                break;
            case 2:
                showAllPersons();
                break;
            case 3:
                reportByMonth();
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                break;
        }
    }

    private static void addPerson() {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido de la persona: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacimientoString = scanner.nextLine();

        // --- Conversión de String a LocalDate ---
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = null;

        try {
            fechaNacimiento = LocalDate.parse(fechaNacimientoString, formato);
        } catch (DateTimeParseException e) {
            System.out.println("⚠️ Formato de fecha inválido. Use el formato dd/mm/yyyy.");
            return;
        }

        // --- Crear Persona ---
        Persona nueva = new Persona(nombre, apellido, fechaNacimiento);

        // --- Agregar a lista y archivo ---
        personas.add(nueva);
        gestor.addPersonToFile(nueva);

        System.out.println("✅ Persona agregada correctamente.");
    }

    private static void showAllPersons() {
        System.out.println("\n=== LISTA DE PERSONAS ===");
        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas.");
        } else {
            for (Persona p : personas) {
                System.out.println(p);
            }
        }
    }

    private static void reportByMonth() {
        System.out.print("Ingrese el número de mes (1-12): ");
        int mes = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n=== CUMPLEAÑOS EN EL MES " + mes + " ===");
        boolean hayCumples = false;
        for (Persona p : personas) {
            if (p.getFechaNacimiento().getMonthValue() == mes) {
                System.out.println(p);
                hayCumples = true;
            }
        }

        if (!hayCumples) {
            System.out.println("No hay cumpleaños en ese mes.");
        }
    }
}
