public class InstrumentoCuerda extends Instrumento {

    // Atributos de la Clase InstrumentoCuerda

    private int numeroCuerdas;

    // Constructor

    public InstrumentoCuerda(String nombre, String marca, double precio, int numeroCuerdas) {
        super(nombre, marca, precio);
        this.numeroCuerdas = numeroCuerdas;
    }

    // Getters y Setters

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    // Metodos de la Clase InstrumentoCuerda

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Cuerdas: " + numeroCuerdas);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando las " + numeroCuerdas + " cuerdas de " + getNombre());
    }
}
