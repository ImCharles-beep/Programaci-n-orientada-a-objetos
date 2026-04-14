public class PruebaCoche {
    public static void main(String[] args) {
        Coche c1 = new Coche("Toyota", "Corolla", 180);

        // 🚫 Intento de acceder a las propiedades directamente (causa error de compilación)
        // c1.marca = "Mazda";          // ❌ ERROR: marca tiene modificador private
        // c1.velocidadMaxima = 200;    // ❌ ERROR: velocidadMaxima es private

        // Uso correcto: llamar a métodos públicos
        c1.mostrarCoche();

        // Usar método acelerar
        c1.acelerar(20);
        c1.mostrarCoche();

        // Probar un incremento negativo (no debería cambiar nada)
        c1.acelerar(-50);
        c1.mostrarCoche();
    }
}