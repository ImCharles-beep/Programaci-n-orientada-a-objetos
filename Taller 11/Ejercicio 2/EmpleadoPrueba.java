public class EmpleadoPrueba {
    public static void main(String[] args) {
        Empleado empleado1 = new Gerente("Juan", 2000);
        Empleado empleado2 = new Vendedor("Maria", 5000);
        
        empleado1.mostrarDetalles();
        empleado2.mostrarDetalles();
    }
    
}
