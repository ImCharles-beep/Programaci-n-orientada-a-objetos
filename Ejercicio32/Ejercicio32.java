package poo;

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
public class Ejercicio32 {
    public static void main(String[] args) {

        // Crear un producto utilizando el método de fábrica estático
        Producto producto1 = Producto.CrearProducto();
        producto1.Nombre = "Producto Personalizado";
        producto1.Precio = 20.0;

        // Crear otro producto utilizando el método de fábrica estático
        Producto producto2 = Producto.CrearProducto();
        producto2.Nombre = "Producto Otro";
        producto2.Precio = 30.0;

        // Mostrar la información del producto creado
        System.out.println("Nombre del producto: " + producto1.Nombre);

        // Mostrar el precio del producto creado
        System.out.println("Precio del producto: $" + producto1.Precio);

        // Mostrar la información del segundo producto creado
        System.out.println("Nombre del producto: " + producto2.Nombre);

        // Mostrar el precio del segundo producto creado
        System.out.println("Precio del producto: $" + producto2.Precio);
    }
    
}
