package poo;
/* * EJERCICIO 19 - EXPLICACIÓN:
 * * 'Estudiante' es una CLASE porque funciona como un "molde" o plantilla. 
 * Define qué características (Nombre, Código, Semestre) que
 * (MostrarDatos) tendrán todos los estudiantes, pero no es nadie en específico.
 * * 'estudiante1' es un OBJETO porque es una "instancia" real de esa clase. 
 * Es el estudiante concreto que creamos en memoria usando 'new Estudiante()', 
 * con sus propios datos específicos como Nombre = "Charles".
 */
class EstudianteComentarios {
    String Nombre;
    int Codigo;
    int Semestre;
    
    void MostrarDatos() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Codigo: " + Codigo);
        System.out.println("Semestre: " + Semestre);
    }
}

public class Ejercicio19 {
    public static void main(String[] args) {
        EstudianteComentarios estudiante1 = new EstudianteComentarios();
        estudiante1.Nombre = "Charles";
        estudiante1.Codigo = 12345;
        estudiante1.Semestre = 3;
        
        estudiante1.MostrarDatos();
    }
    
}
