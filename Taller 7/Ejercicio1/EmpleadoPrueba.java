public class EmpleadoPrueba {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Pérez", 3000.0);
        Empleado empleado2 = new Empleado("María Gómez", 4500.0);

        System.out.println("Empleado 1: " + empleado1.getNombre() + ", Salario: " + empleado1.getSalario());
        System.out.println("Empleado 2: " + empleado2.getNombre() + ", Salario: " + empleado2.getSalario());
    }
    
}
