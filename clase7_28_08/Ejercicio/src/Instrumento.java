public class Instrumento {

    // Atributos de la Clase Instrumento

    private String nombre;
    private String marca;
    private double precio;

    // Constructor

    public Instrumento(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodos de la Clase Instrumento

    public void tocar() {
        System.out.println("Tocando " + nombre + " de la marca " + marca);
    }

    public void afinar() {
        System.out.println("Afinando " + nombre + "...");
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio);
    }
}
