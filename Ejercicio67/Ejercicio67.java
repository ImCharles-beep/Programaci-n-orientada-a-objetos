package poo.Ejercicio67;
class Rutina
{
    String nombre;
    String descripcion;
    int duracion; // en minutos

    void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Duración: " + duracion + " minutos");
    }
}
public class Ejercicio67 {
    public static void main(String[] args) {
        Rutina rutina1 = new Rutina();
        rutina1.nombre = "Trotar";
        rutina1.descripcion = "Ejercicio cardiovascular para mejorar la resistencia";
        rutina1.duracion = 30;

        System.out.println("Detalles de la rutina de ejercicios:");
        rutina1.mostrarDetalles();
    }
}