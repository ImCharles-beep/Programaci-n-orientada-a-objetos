public class Utilidades {
    //colocamos los métodos para realizar las operaciones básicas de suma, resta, multiplicación y división
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }
    public double multiplicar(double a, double b) {
        return a * b;
    }
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero no permitida.");
            return Double.NaN; // Retorna Not-a-Number para indicar error
        }
    }
    
}
