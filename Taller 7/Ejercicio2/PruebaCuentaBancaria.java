public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        //crear cuenta bancaria
        CuentaBancaria cuenta1 = new CuentaBancaria("Carlos", 1000.0, "Ahorros");
        //mostrar detalles de la cuenta
        System.out.println("NumeroCuenta: " + cuenta1.NumeroCuenta);
        System.out.println("Saldo: " + cuenta1.getSaldo());
        //modificar el saldo con el setter
        cuenta1.setSaldo(1500.0);
        //mostrar el nuevo saldo
        System.out.println("Nuevo Saldo: " + cuenta1.getSaldo());
        //intentar acceder a numero de cuenta directamente (esto causará un error de compilación)
        //esto pasa porque el atributo NumeroCuenta es privado y no tiene un método getter para acceder a él desde fuera de la clase CuentaBancaria

    }
    
}
