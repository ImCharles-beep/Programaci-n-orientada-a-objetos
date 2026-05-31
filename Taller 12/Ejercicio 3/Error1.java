public interface Hablador {
    void hablar();
}

public class Persona implements Hablador {
    // ❌ No implementa hablar()
    // Error: Persona must implement hablar()
}
// El error se debe a que la clase Persona implementa la interfaz Hablador, pero no proporciona una implementación para el método hablar(). Para solucionar el error, se debe agregar una implementación para el método hablar() en la clase Persona. Por ejemplo: