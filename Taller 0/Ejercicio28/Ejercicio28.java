package poo;
class cuentaBancaria {
    String Titular;
    int Numero;
    double SaldoInicial;
    
    // Constructor
    cuentaBancaria(String Titular, int Numero, double SaldoInicial
    ) {
        this.Titular = Titular;
        this.Numero = Numero;
        this.SaldoInicial = SaldoInicial;
    }
}
public class Ejercicio28 {
    public static void main(String[] args) {
        cuentaBancaria cuenta1 = new cuentaBancaria("Juan Pérez", 123456, 1500.75);
        cuentaBancaria cuenta2 = new cuentaBancaria("María Gómez", 654321, 2500.50);
        cuentaBancaria cuenta3 = new cuentaBancaria("Carlos López", 111222, 3000.00);

        System.out.println("Cuenta 1:");
        System.out.println("Titular: " + cuenta1.Titular);
        System.out.println("Número: " + cuenta1.Numero);
        System.out.println("Saldo Inicial: $" + cuenta1.SaldoInicial);

        System.out.println("-------------------------");

        System.out.println("Cuenta 2:");
        System.out.println("Titular: " + cuenta2.Titular);
        System.out.println("Número: " + cuenta2.Numero);
        System.out.println("Saldo Inicial: $" + cuenta2.SaldoInicial);
        System.out.println("-------------------------");
        System.out.println("Cuenta 3:");
        System.out.println("Titular: " + cuenta3.Titular);
        System.out.println("Número: " + cuenta3.Numero);
        System.out.println("Saldo Inicial: $" + cuenta3.SaldoInicial);

    }
}

