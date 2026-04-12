package poo.Ejercicio36;
class puerta
//una sola puerta con metodo de cerrar y abrir y que su estado muestre si esta abierta o cerrada
{
    String estado;
    String material;
    public puerta(String estado)
    {
        this.estado=estado;
        this.material="madera";
    }
    void abrir()
    {
        estado="abierta";
        System.out.println("La puerta está abierta.");
    }
    void cerrar()
    {
        estado="cerrada";
        System.out.println("La puerta está cerrada.");
    }
    void mostrarEstado()
    {
        System.out.println("La puerta está " + estado + ".");
    }
}
public class Ejercicio36 {
    public static void main(String[] args) {
        puerta puerta1 = new puerta("cerrada");
        
        System.out.println("Estado inicial de la puerta:");
        puerta1.mostrarEstado();
        
        System.out.println("\nAbriendo la puerta...");
        puerta1.abrir();
        puerta1.mostrarEstado();
        
        System.out.println("\nCerrando la puerta...");
        puerta1.cerrar();
        puerta1.mostrarEstado();
    }
}