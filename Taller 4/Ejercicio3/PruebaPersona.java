// Clase de prueba que intenta acceder al atributo privado
public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona();

        // 🚫 Intento de acceder al atributo private
        // p.nombre = "Carlos";  // ❌ ERROR de compilación
        // System.out.println(p.nombre); // ❌ ERROR de compilación
    }
}