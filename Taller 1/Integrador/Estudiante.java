public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "N/A";
    }

    public Estudiante(String nombre, int edad) {
        // CORRECTO: Solo el valor, sin el prefijo "curso:"
        this(nombre, edad, "Decimo"); 
    }

    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
        System.out.println("--------------------");
    }
}