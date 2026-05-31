public class Vehiculo {
    public String marca;
    public double velodidadMaxima;
    
    public Vehiculo(String marca, double velodidadMaxima) {
        this.marca = marca;
        this.velodidadMaxima = velodidadMaxima;
    }
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad Máxima: " + velodidadMaxima + " km/h");
    }
}