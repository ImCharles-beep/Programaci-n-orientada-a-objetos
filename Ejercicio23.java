package poo;
class libroConstructor {
    String Titulo;
    String Autor;
    String Editorial;
    int Paginas;
    
    // Constructor
    libroConstructor(String titulo, String autor, String editorial, int paginas) {
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

public class Ejercicio23 {
    public static void main(String[] args) {
        libroConstructor libro1 = new libroConstructor("El Quijote", "Miguel de Cervantes", "Editorial Planeta", 863);
        libroConstructor libro2 = new libroConstructor("Cien Años de Soledad", "Gabriel García Márquez", "Editorial Sudamericana", 417);

        libro1.MostrarInformacion();
        System.out.println("-------------------------");
        libro2.MostrarInformacion();
    }
}
