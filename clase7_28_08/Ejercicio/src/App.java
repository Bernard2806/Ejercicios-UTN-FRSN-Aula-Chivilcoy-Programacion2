public class App {
    public static void main(String[] args) throws Exception {

        // Crear 2 instrumentos de cuerda y 2 de viento

        InstrumentoCuerda guitarra = new InstrumentoCuerda("Guitarra", "Fender", 1500.00, 6);
        InstrumentoCuerda bajo = new InstrumentoCuerda("Bajo", "Gibson", 2000.00, 4);

        InstrumentoViento saxofon = new InstrumentoViento("Saxofón", "Yamaha", 2500.00, "Caña");
        InstrumentoViento trompeta = new InstrumentoViento("Trompeta", "Bach", 1800.00, "Latón");

        // Los ponemos en un array
        Instrumento[] orquesta = { guitarra, bajo, saxofon, trompeta };

        // Lo recorremos con un Foreach y llamamos a los metodos

        for (Instrumento instrumento : orquesta) {
            instrumento.mostrarInfo();
            instrumento.tocar();
        }
    }
}
