package poo;
class Estudiante3 {
    String Nombre;
    int Codigo;
    String Semestre;

    public Estudiante3() {
        // Constructor sin parámetros
    }
    public Estudiante3(String Nombre, int Edad) {
        // Constructor con parámetros nombre y edad
        this.Nombre = Nombre;
        this.Codigo = Codigo;
    }
    
    // Constructor con parámetros nombre, edad y semestre
    Estudiante3(String Nombre, int Codigo, String Semestre) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Semestre = Semestre;
    }
}

public class Ejercicio29 {
    public static void main(String[] args) {
        Estudiante3 estudiante1 = new Estudiante3();
        Estudiante3 estudiante2 = new Estudiante3("Ana Martínez", 12345);
        Estudiante3 estudiante3 = new Estudiante3("Luis Gómez", 67890, "5to Semestre");

        System.out.println("Estudiante 1:");
        System.out.println("Nombre: " + estudiante1.Nombre);
        System.out.println("Código: " + estudiante1.Codigo);
        System.out.println("Semestre: " + estudiante1.Semestre);

        System.out.println("-------------------------");

        System.out.println("Estudiante 2:");
        System.out.println("Nombre: " + estudiante2.Nombre);
        System.out.println("Código: " + estudiante2.Codigo);
        System.out.println("Semestre: " + estudiante2.Semestre);

        System.out.println("-------------------------");

        System.out.println("Estudiante 3:");
        System.out.println("Nombre: " + estudiante3.Nombre);
        System.out.println("Código: " + estudiante3.Codigo);
        System.out.println("Semestre: " + estudiante3.Semestre);
    }
    
}
