public abstract class Figura {
    // ✅ Esto SÍ es válido
    public void describir() {
        System.out.println("Soy una figura.");
    }

    // ✅ Esto también es válido
    public abstract double calcularArea();
}
// El error se debe a que la clase Triangulo no implementa el método calcularArea() que es abstracto en la clase Figura. Para solucionar el error, se debe implementar el método calcularArea() en la clase Triangulo. Por ejemplo: