public class Estudiante extends Persona {
    public void estudiar() {
        System.out.println("Estudiando...");
    }
}

Persona p = new Estudiante();
p.estudiar(); // ❌ Error: estudiar() no existe en Persona
// Solución: Agregar el método estudiar() a la clase Persona o hacer un cast a Estudiante