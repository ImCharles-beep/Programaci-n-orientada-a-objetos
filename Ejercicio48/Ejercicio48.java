package poo.Ejercicio48;
class Auto {
    String color; // Atributo

    void pintar(String nuevoColor) {
        String color = nuevoColor; // Error: Se crea una variable local, el atributo no cambia.
    }
}
class Auto {
    String color;

    void pintar(String nuevoColor) {
        this.color = nuevoColor; // Correcto: Se asigna el valor al atributo de la clase.
    }
}