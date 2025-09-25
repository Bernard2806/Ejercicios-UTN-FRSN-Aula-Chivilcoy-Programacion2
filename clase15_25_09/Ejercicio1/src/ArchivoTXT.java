import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArchivoTXT {

    // Método para leer un archivo de texto y devolver sus líneas como ArrayList
    public static ArrayList<String> leerArchivo(String ruta) {
        ArrayList<String> lineasArchivo = new ArrayList<>();
        Path path = Paths.get(ruta);

        if (!Files.exists(path)) {
            System.out.println("El archivo no existe: " + ruta);
            return lineasArchivo;
        }
        if (!Files.isReadable(path)) {
            System.out.println("No se puede leer el archivo (permisos insuficientes): " + ruta);
            return lineasArchivo;
        }

        try {
            List<String> lineas = Files.readAllLines(path);
            lineasArchivo.addAll(lineas);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return lineasArchivo;
    }

    // Método para escribir texto en un archivo de texto
    public static void escribirArchivo(String ruta, String contenido) {
        Path path = Paths.get(ruta);
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            if (!Files.isWritable(path)) {
                System.out.println("No se puede escribir en el archivo (permisos insuficientes): " + ruta);
                return;
            }

            Files.write(path, contenido.getBytes());
            System.out.println("Contenido escrito exitosamente en: " + ruta);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}