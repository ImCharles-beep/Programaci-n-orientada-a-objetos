package poo;
class producto {
    String Nombre;
    double Precio;
    int Stock;
    }
public class Ejercicio8 {
    public static void main(String[] args) {
        // Crear el primer producto
        producto producto1 = new producto();
        producto1.Nombre = "Soda";
        producto1.Precio = 2.000;
        producto1.Stock = 10;
        // Crear un segundo producto
        producto producto2 = new producto();
        producto2.Nombre = "Agua";
        producto2.Precio = 1.500;
        producto2.Stock = 20;
        // Los productos tienen la misma clase, pero son objetos diferentes con sus propios atributos y valores.
        // Mostrar información de ambos productos
        System.out.println("Información del primer producto:");
        System.out.println("Nombre: " + producto1.Nombre);
        System.out.println("Precio: $" + producto1.Precio);
        System.out.println("Stock: " + producto1.Stock);
        // Separador entre productos
        System.out.println("-------------------------");
        System.out.println("Información del segundo producto:");
        System.out.println("Nombre: " + producto2.Nombre);
        System.out.println("Precio: $" + producto2.Precio);
        System.out.println("Stock: " + producto2.Stock);
    }
}
