package poo;
class LibroConstructorParametros {
    String Titulo;
    String Autor;
    String Editorial;
    int Paginas;
    
    // Constructor
    LibroConstructorParametros(String titulo, String autor, String editorial, int paginas) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.Editorial = editorial;
        this.Paginas = paginas;
    }
    
    void MostrarInformacion() {
        System.out.println("Título: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("Editorial: " + Editorial);
        System.out.println("Páginas: " + Paginas);
    }
}

public class Ejercicio24 {
    public static void main(String[] args) {
        LibroConstructorParametros libro1 = new LibroConstructorParametros("El Quijote", "Miguel de Cervantes", "Editorial Planeta", 863);
        LibroConstructorParametros libro2 = new LibroConstructorParametros("Cien Años de Soledad", "Gabriel García Márquez", "Editorial Sudamericana", 417);

        libro1.MostrarInformacion();
        System.out.println("-------------------------");
        libro2.MostrarInformacion();
    }
}
