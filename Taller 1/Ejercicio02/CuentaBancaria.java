public class CuentaBancaria {
    private String NumeroCuenta;
    private double saldo;
    private String tipoCuenta;
    public CuentaBancaria() {
        this.NumeroCuenta = "N/A";
        this.saldo = 0.0;
        this.tipoCuenta = "N/A";
    }

    public CuentaBancaria(String titular, String tipoCuenta) {
        this.NumeroCuenta = titular;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String titular, double saldo, String tipoCuenta) {
        this.NumeroCuenta = titular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    
    public void mostrarInformacion() {
        System.out.println("Número de Cuenta: " + NumeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{NumeroCuenta='" + NumeroCuenta + "', saldo=" + saldo + ", tipoCuenta='" + tipoCuenta + "'}";
    }

    public static void main(String[] args) {
        System.out.println("Información de las cuentas bancarias:");
        System.out.println("Cuenta con valores por defecto:");
        CuentaBancaria CuentaDefecto = new CuentaBancaria();
        CuentaDefecto.mostrarInformacion();

        System.out.println("Cuenta con dos parámetros:");
        CuentaBancaria CuentaConDosParametros = new CuentaBancaria("Juan Pérez", "Ahorros");
        CuentaConDosParametros.mostrarInformacion();


        System.out.println("Cuenta con los tres parámetros:");
        CuentaBancaria CuentaCompleta = new CuentaBancaria("María Gómez", 1500.0, "Corriente");
        CuentaCompleta.mostrarInformacion();
    }
}