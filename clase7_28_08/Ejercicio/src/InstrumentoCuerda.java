public class InstrumentoCuerda extends Instrumento {

    // Atributos de la Clase InstrumentoCuerda

    private int numeroCuerdas;
    private boolean afinado;

    // Constructor

    public InstrumentoCuerda(String nombre, String marca, double precio, int numeroCuerdas, boolean afinado) {
        super(nombre, marca, precio);
        this.numeroCuerdas = numeroCuerdas;
        this.afinado = afinado;
    }

    public InstrumentoCuerda(String nombre, String marca, double precio, int numeroCuerdas){
        this(nombre, marca, precio, numeroCuerdas, false);
    }

    // Getters y Setters

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    public boolean getAfinado() {
        return afinado;
    }

    public void setAfinado(boolean afinado) {
        this.afinado = afinado;
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
