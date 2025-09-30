import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Constantes para las rutas de los archivos
        final String RUTA_ARCHIVO_LECTURA = "resources/lista_compras.txt";
        final String RUTA_ARCHIVO_ESCRITURA = "resources/resumen_compras.txt";

        // --- Leer archivo y mostrarlo ---

        // Leer el archivo y obtener las líneas como un ArrayList
        ArrayList<String> lineas = ArchivoTXT.leerArchivo(RUTA_ARCHIVO_LECTURA);

        // Mostrar la cantidad de productos (líneas) leídas
        System.out.println("Cantidad de productos leídos: " + lineas.size());

        // Mostrar las líneas leídas (opcional)
        for (int i = 0; i < lineas.size(); i++) {
            System.out.println((i + 1) + ": " + lineas.get(i));
        }

        // --- Escribir archivo nuevo de resumen de compras ---

        // En el resumen tenemos que mostrar el total de productos + el primer y ultimo
        // producto

        ArchivoTXT.escribirArchivo(RUTA_ARCHIVO_ESCRITURA, "--- Resumen de Compras ---");
        ArchivoTXT.escribirArchivo(RUTA_ARCHIVO_ESCRITURA, "Cantidad de Productos: " + lineas.size());
        ArchivoTXT.escribirArchivo(RUTA_ARCHIVO_ESCRITURA, "Primer Producto: " + lineas.get(0));
        ArchivoTXT.escribirArchivo(RUTA_ARCHIVO_ESCRITURA, "Ultimo Producto: " + lineas.get(lineas.size() - 1));
    }
}