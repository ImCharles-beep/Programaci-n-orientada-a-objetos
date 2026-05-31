public class FiguraPrueba {
    public static void main(String[] args) {
        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(4, 6);

        f1.calcularArea();
        f2.calcularArea();
    }
}