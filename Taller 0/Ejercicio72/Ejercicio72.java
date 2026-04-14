package poo.Ejercicio72;
//metodo fabrica
class producto{
    String nombre;
    double precio;

    public static producto crearProducto() {
        producto nuevoProducto = new producto();
        nuevoProducto.nombre = "Producto Ejemplo";
        nuevoProducto.precio = 10.0;
        return nuevoProducto;   
    }
}

public class Ejercicio72 {
    public static void main(String[] args) {
        producto producto1 = producto.crearProducto();
        System.out.println("Nombre del producto: " + producto1.nombre);
        System.out.println("Precio del producto: $" + producto1.precio);
    }
    
}
