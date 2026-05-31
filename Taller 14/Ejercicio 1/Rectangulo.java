public class Rectangulo extends Figura {
    double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área del rectángulo: " + (base * altura));
    }
}