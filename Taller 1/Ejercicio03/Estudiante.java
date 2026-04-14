public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;
    
    public Estudiante() {
        this("Alex", 17, "Decimo");
  }

    public Estudiante(String nombre, int edad) {
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
        System.out.println("-----------------------------");
    }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "', edad=" + edad + ", curso='" + curso + "'}";
    }

    public static void main(String[] args) {
        System.out.println("Información de los estudiantes:");
        System.out.println("Estudiante con valores por defecto:");
        Estudiante estudianteDefecto = new Estudiante();
        estudianteDefecto.mostrarInformacion();

        System.out.println("Estudiante con dos parámetros:");
        Estudiante estudianteConDosParametros = new Estudiante("Sofía", 16);
        estudianteConDosParametros.mostrarInformacion();

        System.out.println("Estudiante con los tres parámetros:");
        Estudiante estudianteCompleto = new Estudiante("Carlos", 18, "Once");
        estudianteCompleto.mostrarInformacion();
    }
}