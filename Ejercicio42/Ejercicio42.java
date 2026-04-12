package poo.Ejercicio42;
class curso{
    String nombreCurso;
    String edadEstudiante;
    String nombreEstudiante;
   
    public curso(String nombreCurso, String edadEstudiante, String nombreEstudiante) {
        this.nombreCurso = nombreCurso;
        this.edadEstudiante = edadEstudiante;
        this.nombreEstudiante = nombreEstudiante;
    }
}
public class Ejercicio42 {
    public static void main(String[] args) {
        curso curso1 = new curso("Programacion", "20", "Juan");
        System.out.println("El estudiante " + curso1.nombreEstudiante + " tiene " + curso1.edadEstudiante + " años y esta inscrito en el curso de " + curso1.nombreCurso);
        curso curso2 = new curso("Matematicas", "22", "Maria");
        System.out.println("El estudiante " + curso2.nombreEstudiante + " tiene " + curso2.edadEstudiante + " años y esta inscrito en el curso de " + curso2.nombreCurso);

    }
}
//ambos pertenecen a la misma clase, ya que representan diferentes instancias de un curso con sus respectivos estudiantes. 
// Cada objeto (curso1 y curso2) tiene sus propios atributos (nombreCurso, edadEstudiante, nombreEstudiante) que los diferencian, 
// pero ambos comparten la misma estructura definida por la clase curso.