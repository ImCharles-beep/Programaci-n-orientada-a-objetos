public class FiguraPrueba {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(4, 5);
        Triangulo t = new Triangulo(4, 5);
        System.out.println("Área del rectángulo: " + r.calcularArea());
        System.out.println("Área del triángulo: " + t.calcularArea());
    }
    
}
