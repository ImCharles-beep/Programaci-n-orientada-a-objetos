package poo.Ejercicio73;
//constructor copia
class cuentaBancaria {
    String titular;
    double saldo;

    // Constructor para crear una cuenta bancaria
    public cuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}

public class Ejercicio73 {
    public static void main(String[] args) {
        // Crear una cuenta bancaria original
        cuentaBancaria cuentaOriginal = new cuentaBancaria("Juan Pérez", 1000.0);

        // Crear una nueva cuenta bancaria utilizando el constructor copia
        cuentaBancaria cuentaCopia = new cuentaBancaria(cuentaOriginal.titular, cuentaOriginal.saldo);

        // Mostrar la información de ambas cuentas
        System.out.println("Cuenta Original:");
        System.out.println("Titular: " + cuentaOriginal.titular);
        System.out.println("Saldo: $" + cuentaOriginal.saldo);

        System.out.println("\nCuenta Copia:");
        System.out.println("Titular
    
}
