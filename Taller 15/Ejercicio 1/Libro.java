public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }

    public void generarReporte() {
        System.out.println("Generando reporte del libro...");
        mostrarInformacion();
    }

    public void guardarEnArchivo() {
        System.out.println("Guardando información del libro en un archivo...");
        // Aquí se podría implementar la lógica para escribir en un archivo
    }
    
}
