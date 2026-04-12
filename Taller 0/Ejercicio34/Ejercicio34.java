package poo.Ejercicio34;
class LibroOriginalCopia {
    String titulo;
    String autor;

    public LibroOriginalCopia(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public LibroOriginalCopia(LibroOriginalCopia otro) {
        this.titulo = otro.titulo;
        this.autor = otro.autor;
    }
    void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
public class Ejercicio34 {
    public static void main(String[] args) {
        LibroOriginalCopia libro1 = new LibroOriginalCopia("Cien Años de Soledad", "Gabriel García Márquez");
        LibroOriginalCopia libro2 = new LibroOriginalCopia(libro1); // Crear una copia de libro1

        System.out.println("Información del libro original:");
        libro1.mostrarInformacion();

        System.out.println("\nInformación del libro copiado:");
        libro2.mostrarInformacion();
    }
}
