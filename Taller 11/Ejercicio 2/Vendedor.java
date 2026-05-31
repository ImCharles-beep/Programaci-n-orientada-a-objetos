public class Vendedor extends Empleado {
    double ventasTotales;
    public Vendedor(String nombre, double ventasTotales) {
        super(nombre);
        this.ventasTotales = ventasTotales;
    }

    @Override
    public double calcularSalario() {
        return ventasTotales * 0.1; // El vendedor gana un 10% de sus ventas totales
    }
    
}
