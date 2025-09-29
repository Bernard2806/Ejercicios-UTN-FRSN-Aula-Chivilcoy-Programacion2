package helpers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import models.Producto;
import models.Categoria;

public class ArchivoCSV {
    public static ArrayList<Producto> leerCSVProducto(String ruta) {

        ArrayList<Producto> productos = new ArrayList<>();
        Path path = Paths.get(ruta);

        if (!Files.exists(path)) {
            System.out.println("❌ El archivo no existe: " + ruta);
            return null;
        }

        if (!Files.isReadable(path)) {
            System.out.println("🚫 No se puede leer el archivo (permisos insuficientes): " + ruta);
            return null;
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            boolean esPrimera = true;

            while ((linea = bufferedReader.readLine()) != null) {
                if (esPrimera) {
                    esPrimera = false; // Saltamos la cabecera
                    continue;
                }

                String[] partes = linea.split(",");

                if (partes.length != 4) {
                    System.out.println("⚠️ Línea mal formada: " + linea);
                    continue;
                }

                try {
                    String nombre = partes[0].trim();
                    String categoriaStr = partes[1].trim().toLowerCase();

                    Categoria categoria = Arrays.stream(Categoria.values())
                            .filter(c -> c.name().equalsIgnoreCase(categoriaStr))
                            .findFirst()
                            .orElseThrow(() -> new IllegalArgumentException("Categoría inválida: " + categoriaStr));

                    // Metodo usado x el profe
                    // Categoria categoria = Categoria.ValueOf(partes[1].trim()))

                    double precio = Double.parseDouble(partes[2].trim());
                    int cantidad = Integer.parseInt(partes[3].trim());

                    productos.add(new Producto(nombre, categoria, precio, cantidad));
                } catch (IllegalArgumentException e) {
                    System.out.println("❗ Categoría inválida en línea: " + linea);
                } catch (Exception e) {
                    System.out.println("❗ Error: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("💥 Error al leer el archivo: " + e.getMessage());
        }

        return productos;
    }
}