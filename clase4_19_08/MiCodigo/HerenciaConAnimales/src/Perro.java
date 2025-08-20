// Clase que representa un Perro (hereda de Animal)
public class Perro extends Animal {

    // Variables de la Clase Perro

    private String raza;

    // Constructor de la Clase Perro

    // Constructor completo
    public Perro(String nombre, int edad, String especie, String raza) {
        super(nombre, edad, especie); // Llamada al constructor de la clase base Animal
        this.raza = raza;
    }

    // Constructor básico (Edad = 0)
    public Perro(String nombre, String especie) {
        this(nombre, 0, especie, "Desconocida"); // Llama al constructor completo con raza por defecto y edad 0
    }

    // Setter
    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Getter
    public String getRaza() {
        return raza;
    }

    // Emitir Sonido (Sonido de Perro)
    @Override
    public void emitirSonido() {
        System.out.println("Guau Guau");
    }

    // Jugar
    public void jugar() {
        System.out.println("El perro " + getNombre() + " está jugando.");
    }
    
    // ToString
    @Override
    public String toString() {
        return "Perro [nombre=" + getNombre() + ", edad=" + getEdad() + ", raza=" + getRaza() + ", especie=" + getEspecie() + "]";
    }
}