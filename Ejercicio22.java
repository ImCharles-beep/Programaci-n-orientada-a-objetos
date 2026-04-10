package poo;
class libro {
    String Titulo;
    String Autor;
    String Editorial;
    int Paginas;
    
    void MostrarInformacion() {
        System.out.println("Título: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("Editorial: " + Editorial);
        System.out.println("Páginas: " + Paginas);
    }
}
public class Ejercicio22 {
    public static void main(String[] args) {
        libro libro1 = new libro();
        libro1.Titulo = "El Quijote";
        libro1.Autor = "Miguel de Cervantes";
        libro1.Editorial = "Editorial Planeta";
        libro1.Paginas = 863;
        // segundo libro
        libro libro2 = new libro();
        libro2.Titulo = "Cien Años de Soledad";
        libro2.Autor = "Gabriel García Márquez";
        libro2.Editorial = "Editorial Sudamericana";
        libro2.Paginas = 417;
        libro1.MostrarInformacion();
        System.out.println("-------------------------");
        libro2.MostrarInformacion();
    }
    
}

// Conclusión: la clase "libro" es una plantilla que define las características y comportamientos de un libro, 
// mientras que los objetos "libro1" y "libro2" son instancias concretas de esa clase, cada una con sus propios valores para las propiedades definidas en la clase.
