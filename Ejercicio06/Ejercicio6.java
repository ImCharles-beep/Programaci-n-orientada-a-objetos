package poo;
class Estudiantes {
    String Nombre;
    int Codigo;
    int Semestre;
    
    void MostrarDatos() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Codigo: " + Codigo);
        System.out.println("Semestre: " + Semestre);
    }
}
public class Ejercicio6 {
    public static void main(String[] args) {
        Estudiantes estudiante1 = new Estudiantes();
        estudiante1.Nombre = "Alex";
        estudiante1.Codigo = 27434656;
        estudiante1.Semestre = 4;
        
        estudiante1.MostrarDatos();
    }
}