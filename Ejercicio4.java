package poo;
class CuentaBancaria {
    String Titular;
    String NumeroCuenta;
    double Saldo;
    
    void MostrarCuenta() {
        System.out.println("Titular: " + Titular);
        System.out.println("Número de Cuenta: " + NumeroCuenta);
        System.out.println("Saldo: $" + Saldo);
    }
}
public class Ejercicio4 {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.Titular = "Alice";
        cuenta1.NumeroCuenta = "123456789";
        cuenta1.Saldo = 1500.50;
        
        cuenta1.MostrarCuenta();
    }
}