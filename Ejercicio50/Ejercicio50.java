package poo.Ejercicio50;
class Robot {
    void saludar() {
        System.out.println("Hola, soy un robot.");
    }

    public static void main(String[] args) {
        // Error: Definimos el método, pero el main está vacío. 
        // No hay ninguna instrucción de creación.
    }
}
//corregido
package poo.Ejercicio50;
class Robot {
    void saludar() {
        System.out.println("Hola, soy un robot.");
    }

    public static void main(String[] args) {
        Robot robot1 = new Robot(); // Creamos una instancia de Robot
        robot1.saludar(); // Llamamos al método saludar para mostrar el mensaje
    }
}