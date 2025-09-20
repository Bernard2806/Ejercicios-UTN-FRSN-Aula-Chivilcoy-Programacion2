import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class EnglishSpanishTranslator {

    // Diccionario que mapea palabras en inglés a una lista de traducciones en
    // español
    private HashMap<String, ArrayList<String>> diccionario;

    // Scanner para leer entrada del usuario
    private Scanner scanner = new Scanner(System.in);

    // Constructor
    public EnglishSpanishTranslator() {
        diccionario = new HashMap<>();
    }

    // Metodo para agregar una traducción al diccionario
    public void agregarTraduccion(String ingles, String espanol) {
        
        diccionario.putIfAbsent(ingles, new ArrayList<>());

        ArrayList<String> traducciones = diccionario.get(ingles);

        if (!traducciones.contains(espanol)) {
            traducciones.add(espanol);
        }
    }

    // Metodo para mostrar una traducción
    public ArrayList<String> mostrarTraduccion(String ingles) {
        return diccionario.getOrDefault(ingles, new ArrayList<>());
    }

    // Metodo que carga datos iniciales al diccionario
    public void cargarDatosIniciales() {
        agregarTraduccion("house", "casa");
        agregarTraduccion("car", "auto");
        agregarTraduccion("book", "libro");
        agregarTraduccion("water", "agua");
        agregarTraduccion("food", "comida");
        agregarTraduccion("dog", "perro");
        agregarTraduccion("cat", "gato");
    }

    // Metodo para buscar una palabra y mostrar sus traducciones
    public void buscarPalabra(String palabra) {
        ArrayList<String> traducciones = mostrarTraduccion(palabra);

        if (traducciones.isEmpty()) {
            System.out.println("No se encontraron traducciones para: " + palabra);
            System.out.println("¿Desea agregar una nueva traducción? (s/n): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("s")) {
                preguntarNuevaTraduccion(palabra);
            } else {
                System.out.println("De acuerdo, seguimos...");
            }
        } else {
            System.out.println("Traducciones para '" + palabra + "': " + String.join(", ", traducciones));
            System.out.println("¿Desea agregar un sinónimo? (s/n): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("s")) {
                preguntarSinonimo(palabra);
            } else {
                System.out.println("De acuerdo, seguimos...");
            }
        }

    }

    // Metodo para añadir una nueva traducción si no existe
    public void preguntarNuevaTraduccion(String palabra) {
        System.out.print("Ingrese la traducción en español para '" + palabra + "': ");
        String traduccion = scanner.nextLine();
        agregarTraduccion(palabra, traduccion);
        System.out.println("Traducción agregada.");
    }

    // Metodo para añadir un sinónimo a una palabra existente
    public void preguntarSinonimo(String palabra) {
        System.out.print("Ingrese un sinónimo en español para '" + palabra + "': ");
        String sinonimo = scanner.nextLine();
        agregarTraduccion(palabra, sinonimo);
        System.out.println("Sinónimo agregado.");
    }

}