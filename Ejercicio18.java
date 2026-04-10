package poo;
class MascotaAños {
    String nombre;
    int edad;
    
    void CumplirAños() {
        edad = edad + 1;
        System.out.println(nombre + " ha cumplido un año más. Edad actual: " + edad);
    }
}

public class Ejercicio18 {
    public static void main(String[] args) {
        MascotaAños mascota1 = new MascotaAños();
        mascota1.nombre = "Caín";
        mascota1.edad = 3;

        System.out.println("Edad inicial de " + mascota1.nombre + ": " + mascota1.edad);
        mascota1.CumplirAños();
    }
}
