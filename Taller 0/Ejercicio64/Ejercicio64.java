package poo.Ejercicio64;
//la clase tienda puede tener lo siguiente
// Atributos: nombre, ubicación, tipo de productos
// Métodos: abrir(), cerrar(), venderProducto()
// Objetos tienda1 = new tienda();
// tienda1.nombre = "Tienda de Electrónicos";
// tienda1.ubicación = "Avenida Principal 456";
// tienda1.tipoDeProductos = "Electrónicos";
class tienda {
    String nombre;
    String ubicación;
    String tipoDeProductos;

    void abrir() {
        System.out.println(nombre + " está abierta.");
    }

    void cerrar() {
        System.out.println(nombre + " está cerrada.");
    }

    void venderProducto(String producto) {
        System.out.println(nombre + " ha vendido un " + producto);
    }
}