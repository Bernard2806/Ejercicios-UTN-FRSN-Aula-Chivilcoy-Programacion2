import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Constantes para las rutas de los archivos
        final String RUTA_ARCHIVO_LECTURA = "resources/lista_compras.txt";
        final String RUTA_ARCHIVO_ESCRITURA = "resources/resumen_compras.txt";

        // Leer el archivo y obtener las líneas como un ArrayList
        ArrayList<String> lineas = ArchivoTXT.leerArchivo(RUTA_ARCHIVO_LECTURA);

        // Contar la cantidad de productos (líneas) leídas y mostrar el resultado
        int cantidadProductos = lineas.size();
        System.out.println("Cantidad de productos leídos: " + cantidadProductos);

        // Mostrar las líneas leídas (opcional)
        for (int i = 0; i < lineas.size(); i++) {
            System.out.println((i + 1) + ": " + lineas.get(i));
        }
    }
}