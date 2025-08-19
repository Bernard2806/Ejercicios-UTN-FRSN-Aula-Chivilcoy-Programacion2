public class AutoElectrico extends Auto {

    private int nivelBateria;
    private boolean pilotoAutomatico;

    //constructor sin booleano
    public AutoElectrico(String marca, String color, int nivelBateria, int anio, int velocidadMaxima, int cantidadPuertas) {
        super(marca, color, anio, velocidadMaxima, cantidadPuertas);// constructor del padre
        this.nivelBateria = nivelBateria;
    }

    public void activarPilotoAutomático() {
        pilotoAutomatico = true;
        System.out.println(marca + " activa el piloto automático");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Nivel de batería: " + nivelBateria + "%");
        //explicar esto!
        System.out.println("Modo autónomo: " + (pilotoAutomatico ? "Activado" : "Desactivado"));
    }

    // getters y setters

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public boolean isPilotoAutomatico() {
        return pilotoAutomatico;
    }

    public void setPilotoAutomatico(boolean pilotoAutomatico) {
        this.pilotoAutomatico = pilotoAutomatico;
    }

}
