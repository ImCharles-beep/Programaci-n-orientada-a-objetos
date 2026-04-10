package poo;
Class CuentaBancaria {

    String Titular;
    String NumeroCuenta;
    double Saldo;
    
    // Constructor
    CuentaBancaria(String Titular, String NumeroCuenta, double Saldo) {
        this.Titular = Titular;
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;
    }
} 
public class Ejercicio27 {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", "123456", 1500.75);
        CuentaBancaria cuenta2 = new CuentaBancaria("María Gómez", "654321", 2500.50);

        System.out.println("Cuenta 1:");
        System.out.println("Titular: " + cuenta1.Titular);
        System.out.println("Número: " + cuenta1.NumeroCuenta);
        System.out.println("Saldo: $" + cuenta1.Saldo);

        System.out.println("-------------------------");

        System.out.println("Cuenta 2:");
        System.out.println("Titular: " + cuenta2.Titular);
        System.out.println("Número: " + cuenta2.NumeroCuenta);
        System.out.println("Saldo: $" + cuenta2.Saldo);
    }
}