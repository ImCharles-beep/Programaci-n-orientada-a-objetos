public class Coche {
    // Propiedades privadas
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    // Constructor
    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getters y Setters (opcional, para acceder de forma controlada)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    // Método para acelerar (incrementar la velocidad máxima)
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        }
    }

    // Mostrar información del coche
    public void mostrarCoche() {
        System.out.println("Marca: " + marca +
                " | Modelo: " + modelo +
                " | Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}