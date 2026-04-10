package poo;
class CuentasBancarias
{
    String Titular;
    double Saldo;
    
    void MostrarInformacion() {
        System.out.println("Titular: " + Titular);
        System.out.println("Saldo: $" + Saldo);
    }
}
public class Ejercicio10 {
    public static void main(String[] args) {
        // Crear la primera cuenta bancaria
        CuentasBancarias cuenta1 = new CuentasBancarias();
        cuenta1.Titular = "Alice";
        cuenta1.Saldo = 1500.50;
       // Crear una segunda cuenta bancaria 
        CuentasBancarias cuenta2 = new CuentasBancarias();
        cuenta2.Titular = "Bob";
        cuenta2.Saldo = 2500.75;
        // Mostrar la información de ambas cuentas
        System.out.println("Cuenta 1:");
        cuenta1.MostrarInformacion();
        System.out.println("Cuenta 2:");
        cuenta2.MostrarInformacion();
    }
}
