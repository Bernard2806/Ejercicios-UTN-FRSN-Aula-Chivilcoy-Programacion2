// Clase que representa un Animal
public class Animal {

    // Variables de la clase Animal

    protected String nombre;
    protected int edad;
    protected String especie;

    // Constructor de la Clase Animal

    // Constructor completo
    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    // Constructor basico (Edad = 0)
    public Animal(String nombre, String especie) {
        this(nombre, 0, especie);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    // Setters
    public void setNombre(String nombre) {
        // Validar que el nombre no sea nulo o vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        // Validar que la edad no sea negativa
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    // Emitir sonido
    public void emitirSonido() {
        System.out.println("Sonido de animal");
    }

    // toString
    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + "]";
    }
}
