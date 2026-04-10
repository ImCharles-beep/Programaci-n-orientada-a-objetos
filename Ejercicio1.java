package Poo;
class Estudiante {
   String Nombre;
   int Codigo;
   int Semestre;
   
   void MostrarDatos() {
       System.out.println("Nombre: " + Nombre);
       System.out.println("Codigo: " + Codigo);
       System.out.println("Semestre: " + Semestre);
   }
}
public class Ejercicio1 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.Nombre = "Charles";
        estudiante1.Codigo = 12345;
        estudiante1.Semestre = 2;
        
        estudiante1.MostrarDatos();
    }
}