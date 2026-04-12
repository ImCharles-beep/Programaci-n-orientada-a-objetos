package poo.Ejercicio31;
class Producto {
    String Nombre;
    double Precio;

    public static Producto CrearProducto() {
        Producto nuevoProducto = new Producto();
        nuevoProducto.Nombre = "Producto Ejemplo";
        nuevoProducto.Precio = 10.0;
        return nuevoProducto;   
        
    }
}