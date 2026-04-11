package poo.Ejercicio37;
class celular{
    String marca;
    String modelo;
    String prendido;
    public celular(String marca, String modelo)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.prendido="apagado";
    }   
    void prender()
    {
        prendido="prendido";
        System.out.println("El celular está prendido.");
    }
    void apagar()
    {
        prendido="apagado";
        System.out.println("El celular está apagado.");
    }
    void cargar()
    {
        System.out.println("El celular se está cargando.");
    }
}
public class Ejercicio37 {
    public static void main(String[] args) {
        celular celular1 = new celular("Samsung", "Galaxy S21");
        
        System.out.println("Información del celular:");
        System.out.println("Marca: " + celular1.marca);
        System.out.println("Modelo: " + celular1.modelo);
        
        System.out.println("\nPrendiendo el celular...");
        celular1.prender();
        
        System.out.println("\nCargando el celular...");
        celular1.cargar();
        
        System.out.println("\nApagando el celular...");
        celular1.apagar();
    }
    
}
