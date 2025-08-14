public class App {
    public static void main(String[] args) throws Exception {

        // Pelicula creada usando el constructor completo
        Pelicula peliculaConstructorCompeto = new Pelicula("El Padrino", "Francis Ford Coppola", 175, true);

        // Pelicula creada usando el constructor sin estado
        Pelicula peliculaConstructorSinEstado = new Pelicula("Inception", "Christopher Nolan", 148);

        // Pelicula creada usando el constructor basico
        Pelicula peliculaConstructorBasico = new Pelicula("Interstellar", "Christopher Nolan");

        // Mostramos todas las Peliculas
        System.out.println("Pelicula con constructor completo:");
        System.out.println(peliculaConstructorCompeto);

        System.out.println("Pelicula con constructor sin estado:");
        System.out.println(peliculaConstructorSinEstado);

        System.out.println("Pelicula con constructor basico:");
        System.out.println(peliculaConstructorBasico);

        // Marcamos una Pelicula como vista
        peliculaConstructorCompeto.setVista(true);

        // Mostramos todas las Peliculas nuevamente
        System.out.println("Pelicula con constructor completo (se marco como vista):");
        System.out.println(peliculaConstructorCompeto);

        System.out.println("Pelicula con constructor sin estado:");
        System.out.println(peliculaConstructorSinEstado);

        System.out.println("Pelicula con constructor basico:");
        System.out.println(peliculaConstructorBasico);
    }
}
