package poo;
class productoConstructorVacioYParametros {
    String Nombre;
    double Precio;
    int Cantidad;
    
    // Constructor vacío
    productoConstructorVacioYParametros() {
        this.Nombre = "Desconocido";
        this.Precio = 0.0;
        this.Cantidad = 0;
    }
    
    // Constructor con parámetros
    productoConstructorVacioYParametros(String nombre, double precio, int cantidad) {
        this.Nombre = nombre;
        this.Precio = precio;
        this.Cantidad = cantidad;
    }
    
    void MostrarInformacion() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Precio: $" + Precio);
        System.out.println("Cantidad: " + Cantidad);
    }
}

public class Ejercicio26 {
    public static void main(String[] args) {
        productoConstructorVacioYParametros producto1 = new productoConstructorVacioYParametros();
        productoConstructorVacioYParametros producto2 = new productoConstructorVacioYParametros("Manzanas", 1.5, 10);

        producto1.MostrarInformacion();
        System.out.println("-------------------------");
        producto2.MostrarInformacion();
    }
}
