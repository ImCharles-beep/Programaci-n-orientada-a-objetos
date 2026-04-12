package poo.Ejercicio51;
class rectangulo{
    public double calcularArea(double base, double altura){
        return base * altura;
    }
    public double calcularPerimetro(double base, double altura){
        return 2 * (base + altura);
    }
    void mostrarResultados(double area, double perimetro){
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }
    
}
