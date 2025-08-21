public class Revista extends Publicacion {
    
    // Atributos de la Clase Revista

    private int numero;
    private int mes;

    // Constructor

    public Revista(String titulo, int anio, int numero, int mes) {
        super(titulo, anio); // Llamamos al constructor de la clase padre Publicacion
        this.numero = numero;
        this.mes = mes;
    }

    // Getters y Setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    // Metodo sobreescrito viene de la Clase Publicación

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Usamos super para llamar a la función de la Clase Padre (Publicación). Esto para mostrar los otros atributos.
        System.out.println("Número: " + numero);
        System.out.println("Mes: " + mes);
    }
}
