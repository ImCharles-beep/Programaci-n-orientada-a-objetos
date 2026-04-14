public class PruebaProducto {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1200.50, 50);

        System.out.println("Verificando el acceso a las propiedades:");
        System.out.println("Nombre del producto: " + producto1.nombre);
        System.out.println("Precio del producto: " + producto1.precio);
        System.out.println("Stock del producto: " + producto1.stock);
        System.out.println("---------------------------------------");
        
        System.out.println("Mostrando la informacion del producto:");
        producto1.mostrarInfo();
    }
}