public class App {
    public static void main(String[] args) throws Exception {
        // 1. Creamos 3 cuentas usando distintos constructores

        // Cuenta creada con el Constructor Completo
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Perez", "1234567890", 1000.0, true);

        // Cuenta creada con el Constructor Cuenta Nueva
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria Lopez", "0987654321");

        // Cuenta creada con el Constructor Basico
        CuentaBancaria cuenta3 = new CuentaBancaria("Carlos Gomez");

        // 2. Realizamos varias operaciones con estas cuentas (Despositar y Extraer)

        // Depositamos 10k en cada cuenta
        System.out.println("Se depositaron 10k en cada cuenta...");
        cuenta1.depositar(10000);
        cuenta2.depositar(10000);
        cuenta3.depositar(10000);

        // Mostramos el estado de cada cuenta luego de los depositos
        System.out.println("=== Estado de las Cuentas Tras los Depósitos ===");
        cuenta1.getEstadoCuenta();
        cuenta2.getEstadoCuenta();
        cuenta3.getEstadoCuenta();

        // Extraemos 1k en cada cuenta
        System.out.println("Se extrajo 1k de cada cuenta...");
        cuenta1.extraer(1000);
        cuenta2.extraer(1000);
        cuenta3.extraer(1000);

        // Mostramos el estado de cada cuenta luego de las extracciones
        System.out.println("=== Estado de las Cuentas Tras las Extracciones ===");
        cuenta1.getEstadoCuenta();
        cuenta2.getEstadoCuenta();
        cuenta3.getEstadoCuenta();


        
    }
}
