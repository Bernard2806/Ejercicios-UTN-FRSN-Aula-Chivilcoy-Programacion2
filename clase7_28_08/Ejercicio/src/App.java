import java.util.ArrayList;
import Interfaces.Electrico;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear lista de instrumentos de la orquesta
        ArrayList<Instrumento> orquesta = new ArrayList<>();

        // Agregar 5 instrumentos: guitarra acústica, violín, guitarra eléctrica, flauta, teclado
        orquesta.add(new InstrumentoCuerda("Guitarra acústica", "Yamaha", 1200.00, 6));
        orquesta.add(new InstrumentoCuerda("Violín", "Stradivarius", 5000.00, 4));
        orquesta.add(new GuitarraElectrica("Guitarra eléctrica", "Fender", 1800.00, 6, false));
        orquesta.add(new InstrumentoViento("Flauta", "Yamaha", 800.00, "Metal"));
        orquesta.add(new TecladoElectronico("Teclado", "Casio", 1000.00, 61, false));

        // Recorrer con for-each: mostrar info, tocar y afinar todos
        for (Instrumento instrumento : orquesta) {
            instrumento.mostrarInfo();
            instrumento.tocar();
            instrumento.afinar();

            // Funcionalidades específicas usando instanceof
            if (instrumento instanceof Electrico) {
                Electrico electrico = (Electrico) instrumento;
                electrico.encender();
                instrumento.tocar();
            }
        }
    }
}
