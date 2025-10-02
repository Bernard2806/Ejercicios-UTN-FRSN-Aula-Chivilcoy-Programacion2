import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // ---- Incio del Scanner -----
        Scanner scanner = new Scanner(System.in);

        // ---- Variables Temporales ----
        int opcionMenu = 0;

        do {
            System.out.println("=== SISTEMA DE CUMPLEAÑOS ===");
            System.out.println("1. Agregar nueva persona");
            System.out.println("2. Ver todas las personas");
            System.out.println("3. Reporte de cumpleaños por mes");
            System.out.println("4. Salir");
            opcionMenu = scanner.nextInt();
            scanner.nextLine();
            logicMenu(opcionMenu);
        } while (opcionMenu != 4);
    }

    private static void logicMenu(int op) {
        switch (op) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }
}
