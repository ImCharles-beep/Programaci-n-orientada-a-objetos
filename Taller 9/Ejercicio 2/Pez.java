public class Pez extends Animal {
    String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // invoca constructor de Animal
        this.tipoDeAgua = tipoDeAgua;
    }

    public void mostrarInfo() {
        super.mostrarEspecie(); // invoca método de Animal
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}