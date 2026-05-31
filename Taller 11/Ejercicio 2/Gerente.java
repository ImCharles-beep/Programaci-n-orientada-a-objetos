public class Gerente extends Empleado {
    double salarioBase;
    public Gerente(String nombre, double salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.2; // El gerente gana un 20% más que su salario base
    }

    
}
