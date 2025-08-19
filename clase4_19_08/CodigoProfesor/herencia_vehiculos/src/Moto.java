public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, String color, int anio, int velocidadMaxima, int cilindrada) {
        super(marca, color, anio, velocidadMaxima); // llama al padre
        this.cilindrada = cilindrada;
    }

    // constructor sin cilindrada
    public Moto(String marca, String color, int anio, int velocidadMaxima) {
        super(marca, color, anio, velocidadMaxima); // llama al padre
        this.cilindrada = 0; // pongo por defecto
    }

    public void hacerWheelie() {
        System.out.println(marca + " hace un wheelie con " + cilindrada + "cc.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }

    // getters y setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

}
