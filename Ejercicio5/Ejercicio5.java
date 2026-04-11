package poo;
class mascota {
    String Nombre;
    String Especie;
    int Edad;
    
    void MostrarMascota() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Especie: " + Especie);
        System.out.println("Edad: " + Edad + " años");
    }
}
public class Ejercicio5 {
    public static void main(String[] args) {
        mascota mascota1 = new mascota();
        mascota1.Nombre = "Buddy";
        mascota1.Especie = "Perro";
        mascota1.Edad = 5;
        
        mascota1.MostrarMascota();
    }
}