public class Vehiculo {
    protected String marca;
    protected String color;
    protected int anio;
    protected int velocidadMaxima;

    public Vehiculo(String marca, String color, int anio, int velocidadMaxima) {
        this.marca = marca;
        this.color = color;
        this.anio = anio;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void encender() {
        System.out.println(this.marca + " está encendido.");
    }

    public void tocarBocina() {
        System.out.println(this.marca + " beeeeep beeep");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Color: " + color + ", Año: " + anio + ", Velocidad Máxima: " + velocidadMaxima + " km/h");
    }

    // getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", color=" + color + ", anio=" + anio + ", velocidadMaxima="
                + velocidadMaxima + "]";
    }
}
