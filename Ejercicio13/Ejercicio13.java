package poo;
class cuentaConsignación {
    String Titular;
    double Saldo;
    
    void Consignar(double monto) {
        Saldo = Saldo + monto;
        System.out.println("Saldo después de consignar: $" + Saldo);
        // Imprime el nuevo saldo después de la consignación
    }
}

public class Ejercicio13 {
    public static void main(String[] args) {
        cuentaConsignación cuenta1 = new cuentaConsignación();
        cuenta1.Titular = "Jayce";
        cuenta1.Saldo = 1500.50;
        // Imprime el saldo inicial antes de consignar
        System.out.println("Saldo inicial: $" + cuenta1.Saldo);
        cuenta1.Consignar(500.00);
    }
    
}
