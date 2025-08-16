public class CuentaBancaria {
    // Atributos de la Clase CuentaBancaria

    // Titular de la Cuenta Bancaria
    private String titular;

    // Identificador de la Cuenta Bancaria
    private String numeroCuenta;

    // Saldo de la Cuenta Bancaria (USD)
    private double saldo;

    // Estado de la Cuenta Bancaria
    private boolean activa;

    // Constructores de la Clase CuentaBancaria

    // Constructor completo
    public CuentaBancaria(String titular, String numeroCuenta, double saldo, boolean activa) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.activa = activa;
    }

    // Constructor cuenta nueva
    public CuentaBancaria(String titular, String numeroCuenta) {
        this(titular, numeroCuenta, 0.0, true);
    }

    // Constructor basico
    public CuentaBancaria(String titular) {
        this(titular, "SIN-ASIGNAR", 0.0, false);
    }

    // Metodos de la Cuenta Bancaria

    // Getters

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getActiva() {
        return activa;
    }

    // Setters

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        }
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    // Metodo para realizar depositos
    public void depositar(double monto) {
        if (monto > 0 && activa) {
            saldo += monto;
        }
    }

    // Metodo para realizar extraciones
    public boolean extraer(double monto) {
        if (monto > 0 && saldo >= monto && activa) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    // Metodo para activar cuenta
    public void activarCuenta() {
        if (!activa) {
            this.activa = true;
        }
    }

    // Metodo para desactivar la cuenta
    public void desactivarCuenta() {
        if (saldo == 0 && activa) {
            this.activa = false;
        }
    }

    // Metodo para ver si la cuenta es VIP
    public boolean esCuentaVIP() {
        if (saldo >= 10000 && activa) {
            return true;
        }
        return false;
    }

    // Metodo para obtener el estado de la cuenta (Información completa)
    public void getEstadoCuenta() {
        System.out.println(this);
    }

    // Metodo toString
    @Override
    public String toString(){
        return "=== Información de la Cuenta Bancaria ===\n" +
               "Titular: " + titular + "\n" +
               "Número de Cuenta: " + numeroCuenta + "\n" +
               "Saldo: $" + saldo + "\n" +
               "Estado: " + (activa ? "Activa" : "Inactiva") + "\n" +
               "Cuenta VIP: " + (esCuentaVIP() ? "Sí" : "No");
    }
}
