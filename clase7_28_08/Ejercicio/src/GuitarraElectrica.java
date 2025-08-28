import Interfaces.Afinable;
import Interfaces.Electrico;

public class GuitarraElectrica extends InstrumentoCuerda implements Electrico, Afinable {

    private boolean encendida;

    public GuitarraElectrica(String nombre, String marca, double precio, int numeroCuerdas, boolean encendida) {
        super(nombre, marca, precio, numeroCuerdas);
        this.encendida = encendida;
    }

    // Getters y Setters

    public boolean getEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }
    
    @Override
    public void afinarAutomaticamente() {
        System.out.println("La guitarra eléctrica " + getNombre() + " - " + getMarca() + " se está afinando automáticamente.");
        setAfinado(true);
    }

    @Override
    public void estaAfinado() {
        System.out.println("La guitarra eléctrica " + getNombre() + " - " + getMarca() + " está " + (getAfinado() ? "afinada." : "desafinada."));
    }

    @Override
    public void encender() {
        System.out.println("La guitarra eléctrica " + getNombre() + " - " + getMarca() + " se ha encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("La guitarra eléctrica " + getNombre() + " - " + getMarca() + " se ha apagado.");
    }

    @Override
    public boolean estaEncendido() {
        System.out.println("La guitarra eléctrica " + getNombre() + " - " + getMarca() + " está " + (getEncendida() ? "encendida." : "apagada."));
        return getEncendida();
    }
}
