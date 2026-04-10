package poo;
class ConstructorVacioYConstructorParametros {
    String Titulo;
    String Autor;
    String Editorial;
    int Paginas;
    
    // Constructor vacío
    ConstructorVacioYConstructorParametros() {
        this.Titulo = "Desconocido";
        this.Autor = "Desconocido";
        this.Editorial = "Desconocida";
        this.Paginas = 0;
    }
    
    // Constructor con parámetros
    ConstructorVacioYConstructorParametros(String titulo, String autor, String editorial, int paginas) {
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

public class ejercicio25 {
    public static void main(String[] args) {
        ConstructorVacioYConstructorParametros libro1 = new ConstructorVacioYConstructorParametros();
        ConstructorVacioYConstructorParametros libro2 = new ConstructorVacioYConstructorParametros("El Quijote", "Miguel de Cervantes", "Editorial Planeta", 863);

        libro1.MostrarInformacion();
        System.out.println("-------------------------");
        libro2.MostrarInformacion();
    }
}
