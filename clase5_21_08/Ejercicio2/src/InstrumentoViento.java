public class InstrumentoViento extends Instrumento {

    // Atributos de la Clase InstrumentoViento

    private String material;

    // Constructor

    public InstrumentoViento(String nombre, String marca, double precio, String material) {
        super(nombre, marca, precio);
        this.material = material;
    }

    // Getters y Setters

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Metodos de la Clase InstrumentoViento

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Material: " + material);
    }

    @Override
    public void tocar() {
        System.out.println("Soplando " + getNombre() + " de " + material);
    }
}
