package poo.Ejercicio57;
class NotaAcademica{
    String Asignatura;
    double Nota1;
    double Nota2;
    double Nota3;

    void calcularDefinitiva(){
        double definitiva = (Nota1 + Nota2 + Nota3) / 3;
        System.out.println("La nota definitiva en " + Asignatura + " es: " + definitiva);
    }
}