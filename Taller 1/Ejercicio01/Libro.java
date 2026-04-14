class Libro{
    String titulo;
    String autor;
    int paginas;

    public Libro(){
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.paginas = 0;
    }

    public Libro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarInformacion(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + paginas);
    }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', autor='" + autor + "', paginas=" + paginas + "}";
    }

   public static void main(String[] args){
    Libro Libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 417);
    System.err.println("Información del libro:");
    Libro1.mostrarInformacion();
   }
}