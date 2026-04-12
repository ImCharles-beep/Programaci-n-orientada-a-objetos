package poo.Ejercicio49;
class Jugador {
    int puntos = 10;
}

public class Juego {
    void mostrarPuntos() {
        // Error: El compilador no sabe de quién son los 'puntos'
        System.out.println("Puntos: " + puntos); 
    }
}
class Juego {
    void mostrarPuntos(Jugador j) {
        // Correcto: Se usa la referencia 'j' para acceder al atributo
        System.out.println("Puntos del jugador: " + j.puntos); 
    }
}