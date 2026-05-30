public class PruebaUtilidades {
    public static void main(String[] args) {
        Utilidades util = new Utilidades();

        double a = 10.0;
        double b = 5.0;

        System.out.println("Suma: " + util.sumar(a, b));
        System.out.println("Resta: " + util.restar(a, b));
        System.out.println("Multiplicación: " + util.multiplicar(a, b));
        System.out.println("División: " + util.dividir(a, b));

        // Prueba de división por cero
        System.out.println("División por cero: " + util.dividir(a, 0));
    }
    
}
// funciona correctamente, se pueden realizar las operaciones básicas de suma, resta, multiplicación y división, incluyendo la gestión de la división por cero.