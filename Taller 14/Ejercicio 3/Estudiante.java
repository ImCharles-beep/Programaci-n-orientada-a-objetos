public class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy una persona."); // ❌ igual que la base
    }
}
// Solución: Cambiar el mensaje para que sea diferente al de la clase base