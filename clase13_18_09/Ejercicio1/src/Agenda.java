import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import exceptions.AgendaException;
import helper.Screen;

public class Agenda {
    private HashMap<String, String> contactos;

    // Iniciamos el Scanner para leer datos por consola
    private Scanner scanner = new Scanner(System.in);

    public Agenda() {
        contactos = new HashMap<>();
    }

    // Función para mostrar el menú de opciones
    public void agendaVerOpciones() {
        do {
            Screen.clear();
            System.out.println("Menu de opciones:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            // Procesamos la opción seleccionada
            agendaLogicaOpciones(opcion);
        } while (true);
    }

    // Función para procesar la opción seleccionada
    private void agendaLogicaOpciones(int opcion) {
        Screen.clear();
        String nombre, telefono;

        try {
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    nombre = scanner.nextLine().toLowerCase();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    telefono = scanner.nextLine().toLowerCase();
                    agregarContacto(nombre, telefono);
                    break;
                case 2:

                    System.out.print("Ingrese el nombre del contacto: ");
                    nombre = scanner.nextLine().toLowerCase();
                    buscarContacto(nombre);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto: ");
                    nombre = scanner.nextLine().toLowerCase();
                    eliminarContacto(nombre);
                    break;
                case 4:
                    mostrarContactos();
                    break;
                case 5:
                    System.out.println("Saliendo de la agenda...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Presiona cualquier tecla para continuar...");
            System.in.read(); // Lee un solo carácter
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Función para agregar un contacto
    private void agregarContacto(String nombre, String telefono) throws AgendaException {

        // Convertimos el nombre a minúsculas para evitar duplicados con diferente
        // capitalización
        nombre = nombre.toLowerCase();

        // Verificamos que el nombre no esté vacío
        if (nombre.isEmpty()) {
            throw new AgendaException("El nombre no puede estar vacío.");
        }

        // Verificamos que el teléfono no esté vacío y que tenga al menos 7 dígitos
        if (telefono.isEmpty() || telefono.length() < 7) {
            throw new AgendaException("El teléfono no puede estar vacío y debe tener al menos 7 dígitos.");
        }

        // Verificamos si el contacto ya existe
        if (contactos.containsKey(nombre)) {
            throw new AgendaException("El contacto ya existe.");
        }

        contactos.put(nombre, telefono);
        System.out.println("Contacto agregado.");
    }

    // Función para buscar un contacto
    private void buscarContacto(String nombre) throws AgendaException {

        // Verificamos que el nombre no esté vacío
        if (nombre.isEmpty()) {
            throw new AgendaException("El nombre no puede estar vacío.");
        }

        // Buscamos el contacto y mostramos el resultado o lanzamos una excepción si no
        if (contactos.containsKey(nombre)) {
            System.out.println("Teléfono de " + nombre + ": " + contactos.get(nombre));
        } else {
            throw new AgendaException("Contacto no encontrado.");
        }

    }

    // Función para eliminar un contacto
    private void eliminarContacto(String nombre) throws AgendaException {

        // Verificamos que el nombre no esté vacío
        if (nombre.isEmpty()) {
            throw new AgendaException("El nombre no puede estar vacío.");
        }

        // Verificamos si el contacto existe antes de eliminarlo
        if (contactos.containsKey(nombre)) {
            contactos.remove(nombre);
            System.out.println("Contacto eliminado.");
        } else {
            throw new AgendaException("Contacto no encontrado.");
        }

    }

    // Función para mostrar todos los contactos
    private void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
        } else {
            System.out.println("Contactos en la agenda:");
            for (String nombre : contactos.keySet()) {
                System.out.println("Nombre: " + nombre + ", Teléfono: " + contactos.get(nombre));
            }
        }
    }
}
