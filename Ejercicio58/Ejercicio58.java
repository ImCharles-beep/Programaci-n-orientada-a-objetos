package poo.Ejercicio58;
class inventarioItem{
    String nombre;
    int cantidad;
    double precioUnitario;

    void TotalInventario(){
        double total = cantidad * precioUnitario;
        System.out.println("El total del inventario para " + nombre + " es: " + total);
    }
}