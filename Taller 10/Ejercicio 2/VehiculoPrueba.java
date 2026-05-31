public class VehiculoPrueba {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Bicicleta();

        v1.moverse(); // Salida: El vehículo se mueve.
        v2.moverse(); // Salida: La bicicleta se mueve pedaleando.
    }
}