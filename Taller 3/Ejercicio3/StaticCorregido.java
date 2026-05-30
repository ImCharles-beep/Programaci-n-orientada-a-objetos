public class StaticCorregido{
    // Variable de instancia
    int numero = 10;

    // Método no estático
    public void imprimirNumero() {
        // Ahora sí podemos acceder a 'numero' porque el método
        // está asociado a una instancia de la clase.
        System.out.println("El número es: " + numero);
    }

    public static void main(String[] args) {
        // Para llamar al método, primero debemos crear un objeto.
        StaticCorregido miObjeto = new StaticCorregido();
        miObjeto.imprimirNumero(); // Ahora funciona correctamente.
    }
}
