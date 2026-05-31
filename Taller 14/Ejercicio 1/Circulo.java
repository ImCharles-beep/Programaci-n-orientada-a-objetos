public class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área del círculo: " + (Math.PI * radio * radio));
    }
}