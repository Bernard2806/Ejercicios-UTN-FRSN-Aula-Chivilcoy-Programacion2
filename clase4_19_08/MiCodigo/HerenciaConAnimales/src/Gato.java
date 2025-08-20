public class Gato extends Animal {

    // Variables de la Clase Gato

    private String color;

    // Constructor

    // Constructor completo
    public Gato(String nombre, int edad, String especie, String color) {
        super(nombre, edad, especie); // Llamada al constructor de la clase base Animal
        this.color = color;
    }

    // Constructor basico
    public Gato(String nombre, String especie) {
        this(nombre, 0, especie, "Desconocido"); // Llama al constructor completo con color por defecto y edad 0
    }

    // Setter
    public void setColor(String color) {
        this.color = color;
    }

    // Getter
    public String getColor() {
        return color;
    }

    // Emitir Sonido (Sonido de Gato)
    @Override
    public void emitirSonido() {
        System.out.println("Miau Miau");
    }

    // Ronronear
    public void ronronear() {
        System.out.println("El gato " + getNombre() + " está ronroneando.");
    }

    // ToString
    @Override
    public String toString() {
        return "Gato [color=" + color + ", nombre=" + getNombre() + ", edad=" + getEdad() + ", especie=" + getEspecie()
                + "]";
    }
}