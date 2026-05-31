public class ErrorPrivado {
    private String Nombre = "Juan";
    
}
public class Empleado {
    public void mostrarNombre() {
        System.out.println("El nombre del empleado es: " + Nombre);
    }
}
// no compila porque la variable "Nombre" es privada en la clase "ErrorPrivado" y no puede ser accedida directamente desde la clase "Empleado". Para solucionar este error, se debe proporcionar un método público en la clase "ErrorPrivado" para acceder al valor de "Nombre" o cambiar el modificador de acceso de "Nombre" a público.