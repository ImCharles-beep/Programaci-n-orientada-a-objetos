package poo;
class Producto {
    String Nombre;
    double Precio;
    int Stock;
    
    void MostrarInformacion() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Precio: $" + Precio);
        System.out.println("Stock: " + Stock);
    }
}
public class Ejercicio3 {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.Nombre = "Soda";
        producto1.Precio = 2.000;
        producto1.Stock = 10;
        
        producto1.MostrarInformacion();
    }
}