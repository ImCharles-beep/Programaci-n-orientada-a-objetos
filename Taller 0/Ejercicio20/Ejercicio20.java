package poo;
class Celular {
    String Marca;
    String Modelo;
    int bateria;
    
    void MostrarInformacion() {
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Nivel de batería: " + bateria + "%");
    }
}

public class Ejercicio20 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Celular
        //mostrar la información del celular 1
        Celular celular1 = new Celular();
        celular1.Marca = "Samsung";
        celular1.Modelo = "Galaxy S21";
        celular1.bateria = 85;
        // Mostrar la información del celular 2
        Celular celular2 = new Celular();
        celular2.Marca = "Apple";
        celular2.Modelo = "iPhone 13";
        celular2.bateria = 90;
        // Mostrar la información del celular 3
        Celular celular3 = new Celular();
        celular3.Marca = "Xiaomi";
        celular3.Modelo = "Redmi Note 10";
        celular3.bateria = 75;
        // Imprimir la información de cada celular
        celular1.MostrarInformacion();
        System.out.println("-------------------------");
        celular2.MostrarInformacion();
        System.out.println("-------------------------");
        celular3.MostrarInformacion();
    }
    
}
// EJERCICIO 20 - EXPLICACIÓN:
// * 'Celular' es una CLASE porque define las características (Marca, Modelo, Batería) y comportamientos 
// (MostrarInformacion) que tendrán todos los celulares, pero no es un celular específico.
// * 'celular1', 'celular2' y 'celular3' son OBJETOS porque son "instancias" reales de esa clase.
// son del mismo tipo (Celular) pero cada uno tiene sus propios datos específicos como Marca = "Samsung" o Marca = "Apple".
// Cada uno de estos objetos representa un celular concreto que existe en memoria
// con sus propias características y comportamientos definidos por la clase Celular.