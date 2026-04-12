package poo;
class Vehiculos {
    String Marca;
    String Modelo;
    int VelocidadActual;
    
    void MostrarInformacion() {
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Velocidad Actual: " + VelocidadActual + " km/h");
    }
}
public class Ejercicio7 {
    public static void main(String[] args) {
        //informacion del primer vehiculo
        Vehiculos vehiculo1 = new Vehiculos();
        vehiculo1.Marca = "Honda";
        vehiculo1.Modelo = "Civic";
        vehiculo1.VelocidadActual = 120;
        //informacion del segundo vehiculo
        Vehiculos vehiculo2 = new Vehiculos();
        vehiculo2.Marca = "Ford";
        vehiculo2.Modelo = "Mustang";
        vehiculo2.VelocidadActual = 150;
        
        //Imprime la información del primer vehículo
        System.out.println("primer vehiculo:");
        vehiculo1.MostrarInformacion();
        //Imprime la información del segundo vehículo
        System.out.println("segundo vehiculo:");
        vehiculo2.MostrarInformacion();
    }
}