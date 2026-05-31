public interface Volador {
    void volar();
}

public class Perro implements Volador {
    // ❌ No implementa volar()
    // Error: Perro must implement volar()
}
// El error se debe a que la clase Perro implementa la interfaz Volador, pero no proporciona una implementación para el método volar(). Para solucionar el error, se debe agregar una implementación para el método volar() en la clase Perro. Por ejemplo: