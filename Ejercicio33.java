package poo;
class libroCopia{
    String titulo;
    String autor;

    public libroCopia(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public libroCopia(libroCopia otro) {
        this.titulo = otro.titulo;
        this.autor = otro.autor;
    }
    
    void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
    public class Ejercicio33 {
        public static void main(String[] args) {
            libroCopia libro1 = new libroCopia("El Quijote", "Miguel de Cervantes");
            libroCopia libro2 = new libroCopia(libro1); // Crear una copia de libro1

            System.out.println("Información del libro original:");
            libro1.mostrarInformacion();

            System.out.println("\nInformación del libro copiado:");
            libro2.mostrarInformacion();
        }
    }


