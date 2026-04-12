package poo.Ejercicio69;
class rutina{
    String nombre;
    int duracion; // en minutos
    String tipo;
    
    void mostrarDetalles(){
        System.out.println("Rutina: " + nombre);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Tipo: " + tipo);
    }
}
public class Ejercicio69 {
    public static void main(String[] args) {
        rutina rutina1 = new rutina();
        rutina1.nombre = "Cardio";
        rutina1.duracion = 45;
        rutina1.tipo = "Ejercicio cardiovascular";
        rutina rutina2 = new rutina();
        rutina2.nombre = "saltos";
        rutina2.duracion = 15;
        rutina2.tipo = "saltos para mejorar la agilidad";
        rutina rutina3 = new rutina();
        rutina3.nombre = "descanso";
        rutina3.duracion = 30;
        rutina3.tipo = "descanso para recargar energias";
        rutina rutina4 = new rutina();
        rutina4.nombre = "yoga";
        rutina4.duracion = 20;
        rutina4.tipo = "ejercicio de relajacion";
        rutina rutina5 = new rutina();
        rutina5.nombre = "fuerza";
        rutina5.duracion = 40;
        rutina5.tipo = "ejercicio de fuerza para tonificar músculos";
        
        System.out.println("Detalles de la rutina:");
        rutina1.mostrarDetalles();
        System.out.println();
        rutina2.mostrarDetalles();
        System.out.println();
        rutina3.mostrarDetalles();
        System.out.println();
        rutina4.mostrarDetalles();
        System.out.println();
        rutina5.mostrarDetalles();
    }
}