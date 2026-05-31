public class Hija extends Base {
    public void Saludar() { // ❌ Sin @Override, Java no avisa del error
        System.out.println("Hola");
    }
}