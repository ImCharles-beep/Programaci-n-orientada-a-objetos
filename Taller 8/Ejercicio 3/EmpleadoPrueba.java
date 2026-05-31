public class EmpleadoPrueba {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ana", 3000);
        Gerente gerente1 = new Gerente("Carolina", 5000, "Ventas");
        
        System.out.println("Información del Empleado:");
        empleado1.mostrarInfo();
        
        System.out.println("\nInformación del Gerente:");
        gerente1.mostrarInfo();
    }
    
}