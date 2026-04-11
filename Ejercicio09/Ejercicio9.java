package poo;
class Mascota {
    String nombre;
    int edad;
}
public class Ejercicio9 {
    public static void main(String[] args) {
        Mascota miMascota = new Mascota();
        miMascota.nombre = "Kindred";
        miMascota.edad = 3;
        System.out.println("edad inicial de mi mascota: " + miMascota.edad);
        miMascota.edad = miMascota.edad + 1;
        System.out.println("edad de mi mascota despues de un año: " + miMascota.edad);
        miMascota.edad = 5;
        System.out.println("edad de mi mascota despues de 2 años: " + miMascota.edad);

    }
    
}
