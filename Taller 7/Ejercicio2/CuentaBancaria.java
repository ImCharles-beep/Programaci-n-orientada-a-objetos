public class CuentaBancaria {
    private String NumeroCuenta;
    private double saldo;
    public String tipodecuenta;

    public CuentaBancaria(String NumeroCuenta, double saldo, String tipodecuenta) {
        this.NumeroCuenta = NumeroCuenta;
        this.saldo = saldo;
        this.tipodecuenta = tipodecuenta;
    }
// 1. Metodos get y set para saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
        this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }
}