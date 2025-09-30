import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import helpers.ArchivoCSV;
import helpers.ArchivoTXT;
import models.Producto;
import models.Categoria;

public class App {
    public static void main(String[] args) throws Exception {

        // Constantes para las rutas de los archivos
        final String RUTA_ARCHIVO_LECTURA = "resources/productos.csv";
        final String RUTA_ARCHIVO_ESCRITURA = "resources/resumen_compras.txt";

        // ArrayList con los Productos
        ArrayList<Producto> productos = new ArrayList<>();

        // Se cargan los productos desde el archivo CSV ubicado en la ruta especificada.
        // La función leerCSVProducto de la clase ArchivoCSV se encarga de abrir el
        // archivo, leer su contenido línea por línea, parsear cada producto y devolver
        // una lista con todos ellos.
        productos = ArchivoCSV.leerCSVProducto(RUTA_ARCHIVO_LECTURA);

        // Creamos un HashMap para el total por categoría y otro para la cantidad
        HashMap<Categoria, Integer> cantidadPorCategoria = new HashMap<>();
        HashMap<Categoria, Double> totalPorCategoria = new HashMap<>();

        // Total de la compra
        double TotalCompra = 0;

        // Obtenemos el total por categoría y cantidad y el total de la compra
        for (Producto producto : productos) {

            // Obtenemos la Categoria y el Subtotal del producto actual y la Cantidad
            Categoria categoria = producto.getCategoria();
            double subtotal = producto.getSubtotal();
            int cantidad = producto.getCantidad();

            // Actualizamos el total por categoría
            double totalActual = totalPorCategoria.getOrDefault(categoria, 0.0);
            totalPorCategoria.put(categoria, totalActual + subtotal);

            // Actualizamos la cantidad de productos por categoría
            int cantidadActual = cantidadPorCategoria.getOrDefault(categoria, 0);
            cantidadPorCategoria.put(categoria, cantidadActual + cantidad);

            TotalCompra += subtotal;
        }

        // Variables para informes
        Categoria masCara = null;
        Categoria masBarata = null;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        // Recorremos el total por categoría para encontrar la más cara y la más barata
        for (Map.Entry<Categoria, Double> entry : totalPorCategoria.entrySet()) {
            Categoria categoria = entry.getKey();
            double total = entry.getValue();

            if (total > max) {
                max = total;
                masCara = categoria;
            }

            if (total < min) {
                min = total;
                masBarata = categoria;
            }
        }

        // Generar archivo resumen_compra.txt y mostrar por pantalla
        StringBuilder resumen = new StringBuilder();
        StringBuilder categoriaResumen = new StringBuilder();

        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            resumen.append(String.format("%d - Nombre: %s%n", i + 1, p.getNombre()));
            resumen.append(String.format("    - Cantidad: $%d%n", p.getCantidad()));
            resumen.append(String.format("    - Precio: $%.2f%n", p.getPrecio()));
            resumen.append(String.format("    - Subtotal: $%.2f%n%n", p.getSubtotal()));
        }

        for (int i = 0; i < Categoria.values().length; i++) {
            Categoria x = Categoria.values()[i];
            categoriaResumen.append(String.format("- Categoria: %s%n", x));
            categoriaResumen.append(String.format("    - Cantidad: $%d%n", cantidadPorCategoria.getOrDefault(x, 0)));
            categoriaResumen.append(String.format("    - Total: $%.2f%n%n", totalPorCategoria.getOrDefault(x, 0.00)));
        }

        // Escribir todo el resumen en el archivo
        ArchivoTXT.escribirArchivo(RUTA_ARCHIVO_ESCRITURA, resumen.toString());
        ArchivoTXT.escribirArchivo(RUTA_ARCHIVO_ESCRITURA, "");
        ArchivoTXT.escribirArchivo(RUTA_ARCHIVO_ESCRITURA, categoriaResumen.toString());
        ArchivoTXT.escribirArchivo(RUTA_ARCHIVO_ESCRITURA, "");
        ArchivoTXT.escribirArchivo(RUTA_ARCHIVO_ESCRITURA, "Categoria más Cara:" + masCara);
        ArchivoTXT.escribirArchivo(RUTA_ARCHIVO_ESCRITURA, "Categoria más Barata:" + masBarata);
        ArchivoTXT.escribirArchivo(RUTA_ARCHIVO_ESCRITURA, "Total General: $" + TotalCompra);

        // Imprimir por pantalla
        System.out.println("Resumen de compra:");
        System.out.println(resumen);
        System.out.println();
        System.out.println("Resumen de categoria:");
        System.out.println(categoriaResumen);
        System.out.println();
        System.out.println("Categoria más Cara:" + masCara);
        System.out.println("Categoria más Barata:" + masBarata);
        System.out.println("Total General: $" + TotalCompra);
    }
}
