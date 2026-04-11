package poo;
class VehiculoFrenar {
    String Marca;
    String Modelo;
    int Velocidad;
    
    void Frenar() {
        Velocidad = Velocidad - 10;
        if (Velocidad < 0) {
            Velocidad = 0;
        }
        System.out.println("Velocidad actual: " + Velocidad + " km/h");
        // Imprime la nueva velocidad después de frenar
    }
}

public class Ejercicio12 {
    public static void main(String[] args) {
        VehiculoFrenar coche1 = new VehiculoFrenar();
        coche1.Marca = "Toyota";
        coche1.Modelo = "Corolla";
        coche1.Velocidad = 50;
        // Imprime la velocidad inicial
        System.out.println("Velocidad inicial: " + coche1.Velocidad + " km/h");
        // Llama al método Frenar para reducir la velocidad
        coche1.Frenar();
    }
}
