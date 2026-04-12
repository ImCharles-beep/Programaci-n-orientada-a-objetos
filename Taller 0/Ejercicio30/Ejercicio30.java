package poo;
class Estudiante4 {
    String Nombre;
    int codigo;
    String Semestre;
    //constructor de parámetros
    Estudiante4(String Nombre, int codigo, String Semestre) {
        this.Nombre = Nombre;
        this.codigo = codigo;
        this.Semestre = Semestre;
    }
}

public class Ejercicio30 {
    public static void main(String[] args) {
        Estudiante4 estudiante1 = new Estudiante4("Ana Martínez", 12345, "5to Semestre");
        Estudiante4 estudiante2 = new Estudiante4("Luis Gómez", 67890, "6to Semestre"); 
        Estudiante4 estudiante3 = new Estudiante4("María Rodríguez", 54321, "4to Semestre");

        System.out.println("Estudiante 1:");
        System.out.println("Nombre: " + estudiante1.Nombre);

        System.out.println("-------------------------");

        System.out.println("Estudiante 2:");

        System.out.println("Código: " + estudiante2.codigo);

        System.out.println("-------------------------");
        System.out.println("Estudiante 3:");

        System.out.println("Semestre: " + estudiante3.Semestre);
    }
}
    