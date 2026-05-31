public class Base {
    private String secreto = "datos";
}

public class Hija extends Base {
    public void mostrar() {
        System.out.println(super.secreto); // ❌ Error: secreto es private
    }
}