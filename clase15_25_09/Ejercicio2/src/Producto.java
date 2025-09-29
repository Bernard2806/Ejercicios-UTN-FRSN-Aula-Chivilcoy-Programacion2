public class Producto {

    // --- Propiedades del Producto ---

    private String nombre;
    private Categoria categoria;
    private Double precio;
    private Integer cantidad;

    // --- Constructor del Producto ---

    public Producto(String nombre, Categoria categoria, Double precio, Integer cantidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // --- Getters y Setters del Producto ---

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // --- Metodos del Producto ---

    public double getSubtotal(){
        return cantidad * precio;
    }
}
