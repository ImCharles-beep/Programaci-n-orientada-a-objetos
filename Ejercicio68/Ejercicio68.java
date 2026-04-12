package poo.Ejercicio68;
class negocio{
    String nombre;
    String direccion;
    double ingresosMensuales;
    
    void mostrarInformacion(){
        System.out.println("Nombre del negocio: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Ingresos mensuales: " + ingresosMensuales);
    }
}
public class Ejercicio68 {
    public static void main(String[] args) {
        negocio negocio1 = new negocio();
        negocio1.nombre = "Ara";
        negocio1.direccion = "la plaza";
        negocio1.ingresosMensuales = 5000000.00;
        
        System.out.println("Información del negocio:");
        negocio1.mostrarInformacion();
    }
    
}