package poo.Ejercicio56;
//Temperatura en celsius a fahrenheit
class Temperatura {
    double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    public double convertirAFahrenheit() {
        return (celsius * 9/5) + 32;
    }
}

public class Ejercicio56 {
    public static void main(String[] args) {
        Temperatura temp = new Temperatura(25);
        System.out.println("Temperatura en Fahrenheit: " + temp.convertirAFahrenheit());
    }
}
