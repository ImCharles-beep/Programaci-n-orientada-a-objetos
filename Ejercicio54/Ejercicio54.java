package poo.Ejercicio54;
//semaforo con metodo para cambiar de color y mostrar el estado actual del semaforo(colores: rojo, amarillo, verde)
class Semaforo {
    String color;

    public Semaforo(String color) {
        this.color = color;
    }

    void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    void mostrarEstado() {
        System.out.println("El semáforo está en color: " + color);
    }
}
public class Ejercicio54 {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo("rojo");
        semaforo.mostrarEstado(); // Muestra el estado actual del semáforo

        semaforo.cambiarColor("amarillo");
        semaforo.mostrarEstado(); // Muestra el nuevo estado del semáforo

        semaforo.cambiarColor("verde");
        semaforo.mostrarEstado(); // Muestra el nuevo estado del semáforo
    }
}