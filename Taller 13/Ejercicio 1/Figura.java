public abstract class Figura {
    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("El área es: " + calcularArea());
    }
    
}
//una clase abstracta no se puede instanciar, es decir, no se pueden crear objetos de esa clase. Solo se pueden crear objetos de las clases que heredan de la clase abstracta y que implementan los métodos abstractos.