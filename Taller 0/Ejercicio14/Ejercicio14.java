package poo;
class cuentaRetirar {
    String Titular;
    double Saldo;
    
    void Retirar(double monto) {
        if (monto > Saldo) {
            System.out.println("Saldo insuficiente para retirar $" + monto);
        } else {
            Saldo = Saldo - monto;
            System.out.println("Saldo después de retirar: $" + Saldo);
            // Imprime el nuevo saldo después de la retirada
        }
    }
}

public class Ejercicio14 {
    public static void main(String[] args) {
        cuentaRetirar cuenta1 = new cuentaRetirar();
        cuenta1.Titular = "Jayce";
        cuenta1.Saldo = 1500.50;
        // Imprime el saldo inicial antes de retirar
        System.out.println("Saldo inicial: $" + cuenta1.Saldo);
        cuenta1.Retirar(200.00);
        // Intenta retirar una cantidad mayor al saldo para probar el mensaje de saldo insuficiente
        cuenta1.Retirar(2000.00);
    }
    
}
