import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorArchivo {

    // ---- Atributos de la Clase GestorArchivo -----

    private String rutaArchivo;

    // ---- Constructor de la Clase GestorArchivo ----

    public GestorArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    // ---- Metodos de la Clase GestorArchivo ----

    public void createFileIfMissing() {
        Path path = Paths.get(rutaArchivo);

        if (!Files.exists(path)) {
            System.out.println("El archivo no existe: " + rutaArchivo);
            try {
                Files.write(path, "nombre,apellido,fechaNacimiento\n".getBytes(), StandardOpenOption.CREATE_NEW);
                System.out.println("Archivo creado con encabezado.");
            } catch (IOException e) {
                System.err.println("Error al crear el archivo: " + e.getMessage());
            }
        }

        if (!Files.isReadable(path)) {
            System.out.println("No se puede leer el archivo (permisos insuficientes): " + rutaArchivo);
        }
    }

    public ArrayList<Persona> readAllPersonsFromFile() {

        createFileIfMissing();

        ArrayList<Persona> personas = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            boolean esPrimera = true;

            while ((linea = bufferedReader.readLine()) != null) {
                if (esPrimera) {
                    esPrimera = false; // Saltamos la cabecera
                    continue;
                }

                String[] partes = linea.split(",");

                if (partes.length != 3) {
                    System.out.println("⚠️ Línea mal formada: " + linea);
                    continue;
                }

                try {
                    String nombre = partes[0].trim();
                    String apellido = partes[1].trim();
                    LocalDate fecha = LocalDate.parse(partes[2]);

                    personas.add(new Persona(nombre, apellido, fecha));
                } catch (IllegalArgumentException e) {
                    System.out.println("❗ Error en formato fecha: " + linea);
                } catch (Exception e) {
                    System.out.println("❗ Error: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("💥 Error al leer el archivo: " + e.getMessage());
        }

        return personas;
    }

    public void addPersonToFile(Persona p) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            escritor.write(p.toString());
            escritor.newLine();
        } catch (Exception e) {
            System.out.println("❗ Error: " + e.getMessage());
        }
    }
}
