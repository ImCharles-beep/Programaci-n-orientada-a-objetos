package poo;
class EstudianteCambio {
    String Nombre;
    int Codigo;
    int Semestre;
    
    void CambiarSemestre(int nuevoSemestre) {
        Semestre = nuevoSemestre;
        System.out.println("Semestre actualizado para " + Nombre + ": " + Semestre);
    }
}
public class Ejercicio17 {
    public static void main(String[] args) {
        EstudianteCambio estudiante1 = new EstudianteCambio();
        estudiante1.Nombre = "Charles";
        estudiante1.Codigo = 12345;
        estudiante1.Semestre = 2;
        
        System.out.println("Semestre inicial de " + estudiante1.Nombre + ": " + estudiante1.Semestre);
        estudiante1.CambiarSemestre(3);
    }
}
