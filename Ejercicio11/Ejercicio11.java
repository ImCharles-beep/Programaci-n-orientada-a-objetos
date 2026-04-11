package poo;
class VehiculoAcelerar {
    String Marca;
    String Modelo;
    int Velocidad;
    
    void Acelerar() {
        Velocidad = Velocidad + 10;
        System.out.println("Velocidad actual: " + Velocidad + " km/h");
    }
}

public class Ejercicio11 {
    public static void main(String[] args) {
        VehiculoAcelerar coche1 = new VehiculoAcelerar();
        coche1.Marca = "Toyota";
        coche1.Modelo = "Corolla";
        coche1.Velocidad = 0;
        
        System.out.println("Velocidad inicial: " + coche1.Velocidad + " km/h");
        coche1.Acelerar();
    }
    
}
