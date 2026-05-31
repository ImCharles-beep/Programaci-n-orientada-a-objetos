public class Empleado {
    String nombre;
    double salario;
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
 public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}
