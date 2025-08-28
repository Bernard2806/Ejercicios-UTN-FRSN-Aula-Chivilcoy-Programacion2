import Interfaces.Electrico;

public class TecladoElectronico extends Instrumento implements Electrico {

    private boolean encendido;
    private int numeroTeclas;

    public TecladoElectronico(String nombre, String marca, double precio, int numeroTeclas, boolean encendido) {
        super(nombre, marca, precio);
        this.numeroTeclas = numeroTeclas;
        this.encendido = encendido;
    }

    public TecladoElectronico(String nombre, String marca, double precio, int numeroTeclas) {
        this(nombre, marca, precio, numeroTeclas, false);
    }

    public TecladoElectronico(String nombre, String marca, double precio) {
        this(nombre, marca, precio, 61, false); // Asumiendo 61 teclas por defecto
    }

    @Override
    public void encender() {
        if(!encendido) {
            encendido = true;
            System.out.println("El teclado electrónico " + getNombre() + " - " + getMarca() + " se ha encendido.");
        } else {
            System.out.println("El teclado electrónico " + getNombre() + " - " + getMarca() + " ya está encendido.");
        }
    }

    @Override
    public void apagar() {
        if(encendido){
            encendido = false;
            System.out.println("El teclado electrónico " + getNombre() + " - " + getMarca() + " se ha apagado.");
        }
        else{
            System.out.println("El teclado electrónico " + getNombre() + " - " + getMarca() + " ya está apagado."); 
        }
    }

    // Getters y Setters

    @Override
    public boolean estaEncendido() {
        return encendido;
    }

    public boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }  
}
