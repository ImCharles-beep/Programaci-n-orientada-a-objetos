package Poo;
class Vehiculo {
    String Marca;
    String Modelo;
    int VelocidadActual;
    
    void MostrarEstado() {
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Velocidad Actual: " + VelocidadActual + " km/h");
    }
}
    public class Ejercicio2 {
        public static void main(String[] args) {
            Vehiculo coche1 = new Vehiculo();
            coche1.Marca = "Toyota";
            coche1.Modelo = "Corolla";
            coche1.VelocidadActual = 80;
            
            coche1.MostrarEstado();
        }
    }