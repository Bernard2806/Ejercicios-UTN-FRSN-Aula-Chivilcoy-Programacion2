public class Auto extends Vehiculo{
    
    protected int cantidadPuertas;

    public Auto(String marca, String color, int anio, int velocidadMaxima, int cantidadPuertas) {
        super(marca, color, anio, velocidadMaxima); //llama al constructor de la clase padre
        this.cantidadPuertas = cantidadPuertas;
    }

    public void abrirBaul(){
        System.out.println(this.marca + " abre el baul.");
    }

    @Override //la anotacion nos ayuda si ponemos mal el ombre del método
    public void mostrarInfo(){
        super.mostrarInfo(); //llama al metodo del padre
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }

    //getters y setters
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    
}
