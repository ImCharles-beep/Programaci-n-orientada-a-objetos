package poo.Ejercicio65;
// la clase equipo de fútbol puede tener lo siguiente
// Atributos: nombre del equipo, ciudad, número de jugadores
// Métodos: jugarPartido(), entrenar(), contratarJugador()
// Objetos equipo1 = new equipoDeFútbol();
// equipo1.nombreDelEquipo = "Los Tigres";
// equipo1.ciudad = "Monterrey";
// equipo1.númeroDeJugadores = 25;
class equipoDeFútbol {
    String nombreDelEquipo;
    String ciudad;
    int númeroDeJugadores;

    void jugarPartido() {
        System.out.println(nombreDelEquipo + " está jugando un partido.");
    }

    void entrenar() {
        System.out.println(nombreDelEquipo + " está entrenando.");
    }

    void contratarJugador(String nombreJugador) {
        System.out.println(nombreDelEquipo + " ha contratado a " + nombreJugador);
        númeroDeJugadores++;
    }
}