package poo.Ejercicio71;
//usare la clase estudiante pero ahora con constructores con parametros
class estudiante{
    String nombre;
    int edad;
    String curso;

    public estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }
    void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }
}
public class Ejercicio71 {
    public static void main(String[] args) {
        estudiante estudiante1 = new estudiante("Charles", 20, "Programación");
        estudiante1.mostrarInformacion();
    }
}