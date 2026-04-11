package poo.Ejercicio39;
class Canción{
    String Tirulo;
    String Artista;
    String Duración;
    public Canción(String Tirulo, String Artista, String Duración)
    {
        this.Tirulo=Tirulo;
        this.Artista=Artista;
        this.Duración=Duración;
    }
    void mostrarInformacion()
    {
        System.out.println("Título: " + Tirulo);
        System.out.println("Artista: " + Artista);
        System.out.println("Duración: " + Duración);
    }
}

public class Ejercicio39 {
    public static void main(String[] args) {
        Canción canción1 = new Canción("Shape of You", "Ed Sheeran", "3:53");
        
        System.out.println("Información de la canción:");
        canción1.mostrarInformacion();
    }
    
}
