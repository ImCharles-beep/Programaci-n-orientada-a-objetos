package poo;
class productoReabastecer {
    String Nombre;
    double Precio;
    int Stock;
    
    void Reabastecer(int cantidad) {
        Stock = Stock + cantidad;
        System.out.println("Stock actualizado de " + Nombre + ": " + Stock);
    }
}

public class Ejercicio16 {
    public static void main(String[] args) {
        productoReabastecer producto1 = new productoReabastecer();
        producto1.Nombre = "Soda";
        producto1.Precio = 2.000;
        producto1.Stock = 10;
        
        // Reabastece 5 unidades del producto
        producto1.Reabastecer(5);
    }
    
}
