public class App {
    public static void main(String[] args) throws Exception {
        // crea el auto
        Auto auto = new Auto("Peugeot", "Azul", 2019, 180, 4);
        auto.encender();
        auto.tocarBocina();
        auto.abrirBaul();
        auto.mostrarInfo();
        // esto de abajo usa el to string de vehiculo...
        System.out.println(auto);
        System.out.println();

        // crea una moto con cilindrada
        Moto motoCompleta = new Moto("Honda", "Roja", 2021, 220, 1000);
        motoCompleta.encender();
        motoCompleta.tocarBocina();
        motoCompleta.hacerWheelie();
        motoCompleta.mostrarInfo();
        System.out.println();

        // crea moto con el segundo constructor
        Moto motoSimple = new Moto("Yamaha", "Negra", 2020, 200);
        motoSimple.encender();
        motoSimple.hacerWheelie(); // muestra 0cc
        motoSimple.setCilindrada(600); // actualiza cilindrada
        motoSimple.mostrarInfo();
        System.out.println();

        // crea un AutoElectrico
        AutoElectrico tesla = new AutoElectrico("Tesla", "Negro", 2023, 250, 5, 90);
        tesla.encender();
        tesla.tocarBocina();
        tesla.abrirBaul();
        tesla.activarPilotoAutomático();
        tesla.mostrarInfo();
        System.out.println();
    }
}
