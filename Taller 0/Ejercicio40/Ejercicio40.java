package poo.Ejercicio40;
class pelicula {
    String Nombre;
    String Genero;
    String Minutos;
    public pelicula(String Nombre, String Genero, String Minutos)
    {
        this.Nombre=Nombre;
        this.Genero=Genero;
        this.Minutos=Minutos;
    }
    void mostrarFicha()
    {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Genero: " + Genero);
        System.out.println("Duración: " + Minutos);
    }
}

public class Ejercicio40 {
    public static void main(String[] args) {
        pelicula pelicula1 = new pelicula("Inception", "Ciencia ficción", "148 minutos");
        
        System.out.println("Ficha técnica de la película:");
        pelicula1.mostrarFicha();
    }
    
}
