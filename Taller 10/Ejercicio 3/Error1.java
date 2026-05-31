public class Error1 {
    public void saludar() {
        System.out.println("Hola");
    }
}

public class Hija extends Base {
    @Override
    public void saludar(String nombre) { // ❌ Error: firma diferente
        System.out.println("Hola " + nombre);
    }
}