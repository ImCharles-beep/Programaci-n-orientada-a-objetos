public class StaticCorregido {
    // Método estático para sumar dos números.
    // Es 'static' porque no necesita un objeto para funcionar;
    // la suma es una operación universal.
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método estático para restar dos números.
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método estático para multiplicar dos números.
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método estático para dividir dos números.
    // Incluye una verificación para evitar la división por cero.
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // Retorna 'Not a Number' para indicar un resultado indefinido.
        }
        return a / b;
    }
    
}
