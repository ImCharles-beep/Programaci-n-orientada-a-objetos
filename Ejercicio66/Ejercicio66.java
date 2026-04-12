package poo.Ejercicio66;
class lenguajes{
    String nombre;
    String tipo;
    int popularidad;
    
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Popularidad: " + popularidad);
    }
}
public class Ejercicio66 {
    public static void main(String[] args) {
        lenguajes lenguaje1 = new lenguajes();
        lenguaje1.nombre = "Java";
        lenguaje1.tipo = "Programación orientada a objetos";
        lenguaje1.popularidad = 1;
        
        System.out.println("Información del lenguaje de programación:");
        lenguaje1.mostrarInfo();
    }
    
}