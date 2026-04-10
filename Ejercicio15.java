package poo;
class productoVender {
    String Nombre;
    double Precio;
    int Stock;
    
    void Vender(int cantidad) {
        if (cantidad > Stock) {
            System.out.println("Stock insuficiente para vender " + cantidad + " unidades de " + Nombre);
        } else {
            Stock = Stock - cantidad;
            double total = Precio * cantidad;
            System.out.println("Total a pagar por " + cantidad + " unidades de " + Nombre + ": $" + total);
        }
    }
}

public class Ejercicio15 {
    public static void main(String[] args) {
        productoVender producto1 = new productoVender();
        producto1.Nombre = "Soda";
        producto1.Precio = 2.000;
        producto1.Stock = 10;
        
        // Vende 3 unidades del producto
        producto1.Vender(3);
        System.out.println("Stock restante de " + producto1.Nombre + ": " + producto1.Stock);
    }
    
}
