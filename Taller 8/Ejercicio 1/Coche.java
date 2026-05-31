public class Coche extends Vehiculo {
    int NumeroPuertas;
    public Coche(String marca, double velodidadMaxima, int NumeroPuertas) {
        super(marca, velodidadMaxima);
        this.NumeroPuertas = NumeroPuertas;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velodidadMaxima + " km/h");
        System.out.println("Número de Puertas: " + NumeroPuertas);
    }
}
