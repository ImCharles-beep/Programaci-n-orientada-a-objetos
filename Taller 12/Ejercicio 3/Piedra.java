public class Piedra implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("La piedra vuela."); // ❌ No tiene sentido
    }

    @Override
    public void nadar() {
        System.out.println("La piedra nada."); // ❌ No tiene sentido
    }
}
// El error se debe a que la clase Piedra implementa las interfaces Volador y Nadador, pero no tiene sentido que una piedra pueda volar o nadar. Para solucionar el error, se debe eliminar la implementación de las interfaces Volador y Nadador en la clase Piedra, o bien, crear una clase concreta que herede de Piedra y proporcione una implementación adecuada para los métodos volar() y nadar(). Por ejemplo: