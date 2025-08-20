public class App {
    public static void main(String[] args) throws Exception {
        // Crear un Perro con el constructor completo
        Perro perroCompleto = new Perro("Rex", 5, "Canino", "Labrador");
        // Crear un Perro con el constructor básico
        Perro perroBasico = new Perro("Toby", "Canino");

        // Crear un Gato con el constructor completo
        Gato gatoCompleto = new Gato("Michi", 3, "Felino", "Negro");
        // Crear un Gato con el constructor básico
        Gato gatoBasico = new Gato("Pelusa", "Felino");

        // Mostrar todos los animales usando toString()
        System.out.println(perroCompleto);
        System.out.println(perroBasico);
        System.out.println(gatoCompleto);
        System.out.println(gatoBasico);

        // Probar los métodos sobrescritos (emitirSonido())
        perroCompleto.emitirSonido();
        perroBasico.emitirSonido();
        gatoCompleto.emitirSonido();
        gatoBasico.emitirSonido();

        // Probar métodos específicos de cada clase
        perroCompleto.jugar();
        perroBasico.jugar();
        gatoCompleto.ronronear();
        gatoBasico.ronronear();
    }
}
