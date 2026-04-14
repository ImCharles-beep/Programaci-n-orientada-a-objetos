public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto
    public CuentaBancaria() {
        this("0000-0000", 0.0, "Ahorros");
    }

    // Constructor parametrizado con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this(numeroCuenta, 0.0, tipoCuenta);
    }

    // Constructor sobrecargado con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método toString()
    @Override
    public String toString() {
        return "CuentaBancaria [Número: " + numeroCuenta + ", Saldo: $" + saldo + ", Tipo: " + tipoCuenta + "]";
    }
}