package poo;
 class Osodepeluche {
    String Nombre;
    String Color;
    int Tamaño;
    
    void MostrarInformacion() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Color: " + Color);
        System.out.println("Tamaño: " + Tamaño + " cm");
    }

public class Ejercicio21 {
    public static void main(String[] args) {
        Osodepeluche oso1 = new Osodepeluche();
        oso1.Nombre = "Teddy";
        oso1.Color = "Marrón";
        oso1.Tamaño = 30;
        Osodepeluche oso2 = new Osodepeluche();
        oso2.Nombre = "Pinky";    
        oso2.Color = "Rosa";
        oso2.Tamaño = 30;
        
        oso1.MostrarInformacion();
        System.out.println("-------------------------");
        oso2.MostrarInformacion();
    }
    
}
}
