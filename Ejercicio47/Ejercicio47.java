package poo.Ejercicio47;
class CuentaBancaria {
    double saldo;

    public void depositar(double cantidad) {
        saldo += cantidad;
    }
}
public class Ejercicio47 {
    // El error es que el primer objeto no hace uso de "new" para instanciar la clase, lo que resulta en una referencia nula.
CuentaBancaria miCuenta; 
miCuenta.depositar(100); // Error: La variable es 'null', el objeto no existe.

CuentaBancaria miCuenta = new CuentaBancaria(); // Correcto: Objeto instanciado
miCuenta.depositar(100);