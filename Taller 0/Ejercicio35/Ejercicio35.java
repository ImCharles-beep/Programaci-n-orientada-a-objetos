package poo.Ejercicio35;
class Lampara {
    String marca;
    String modelo;

    public Lampara(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Lampara(Lampara otra) {
        this.marca = otra.marca;
        this.modelo = otra.modelo;
    }
    void enceder() {
        System.out.println("La lámpara está encendida.");
    }
    void apagar() {
        System.out.println("La lámpara está apagada.");
    }
    void estado() {
        System.out.println("La lámpara está en buen estado.");
    }
    
    void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

public class Ejercicio35 {
    public static void main(String[] args) {
        Lampara lampara1 = new Lampara("Philips", "Hue");
        Lampara lampara2 = new Lampara(lampara1);
        
        System.out.println("Información de la lámpara 1:");
        lampara1.mostrarInformacion();
        lampara1.enceder();
        lampara1.estado();
        
        System.out.println("\nInformación de la lámpara 2:");
        lampara2.mostrarInformacion();
        lampara2.apagar();
        lampara2.estado();
    }
    
}
