public class PruebaEstudiante {
    public static void main(String[] args) {
        // Crear estudiante con valores válidos
        Persona e1 = new Persona("Ana", 20, 4.5);
        e1.mostrarEstudiante();

        // Crear estudiante con valores no válidos
        Persona e2 = new Persona("", -5, 7.0);
        e2.mostrarEstudiante();

        // Usar setters para corregir los datos
        e2.setNombre("Carlos");
        e2.setEdad(22);
        e2.setNotaPromedio(3.8);
        e2.mostrarEstudiante();
    }
    
}
