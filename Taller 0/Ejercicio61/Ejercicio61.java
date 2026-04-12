package poo.Ejercicio61;
// la clase Docente puede tener lo siguiebte
// Atributos: nombre, materia, años de experiencia
// Métodos: enseñar(), evaluar(), prepararLeccion()
// Objetos maestro1 = new maestro();
// maestro1.nombre = "Juan Pérez";
// maestro1.materia = "Matemáticas";
// maestro1.añosDeExperiencia = 10;
class Docente {
    String nombre;
    String materia;
    int añosDeExperiencia;

    void enseñar() {
        System.out.println(nombre + " está enseñando " + materia);
    }

    void evaluar() {
        System.out.println(nombre + " está evaluando a los estudiantes.");
    }

    void prepararLeccion() {
        System.out.println(nombre + " está preparando la lección de " + materia);
    }
}