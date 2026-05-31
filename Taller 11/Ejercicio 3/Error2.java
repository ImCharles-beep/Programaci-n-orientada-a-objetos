public abstract class Figura {
    public abstract double calcularArea();
    
    public void dibujar() { // método concreto
        System.out.println("Dibujando...");
    }
}

public class Triangulo extends Figura {
    // ❌ No implementa calcularArea()
    // Error: Triangulo must implement calcularArea()
}
// El error se debe a que la clase Triangulo no implementa el método calcularArea() que es abstracto en la clase Figura. Para solucionar el error, se debe implementar el método calcularArea() en la clase Triangulo. Por ejemplo: