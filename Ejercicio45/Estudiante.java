package poo.Ejercicio45;

public class Estudiante {
    String nombre;
} 

void saludar() { // Error: Fuera de los límites de la clase
    System.out.println("Hola");
}
public class Estudiante {
    String nombre;

    void saludar() { // Correcto: Dentro de las llaves de la clase
        System.out.println("Hola, soy " + nombre);
    }
}