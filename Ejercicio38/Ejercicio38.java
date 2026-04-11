package poo.Ejercicio38;
class ventilador {
    String Marca;
    int velocidad;
    String encendido;
    public ventilador(String Marca, int velocidad)
    {
        this.Marca=Marca;
        this.velocidad=velocidad;
        this.encendido="apagado";
    }
    void encender()
    {
        encendido="prendido";
        System.out.println("El ventilador está encendido.");
    }
    void apagar()
    {
        encendido="apagado";
        System.out.println("El ventilador está apagado.");
    }
    void mostrarInformacion()
    {
        System.out.println("Marca: " + Marca);
        System.out.println("Velocidad: " + velocidad);
    }
}
public class Ejercicio38 {
    public static void main(String[] args) {
        ventilador ventilador1 = new ventilador("LG", 3);
        
        System.out.println("Información del ventilador:");
        ventilador1.mostrarInformacion();
        
        System.out.println("\nEncendiendo el ventilador...");
        ventilador1.encender();
        
        System.out.println("\nApagando el ventilador...");
        ventilador1.apagar();
    }
    
}
