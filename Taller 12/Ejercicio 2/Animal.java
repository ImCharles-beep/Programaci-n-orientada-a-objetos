public class Animal implements Volador, Nadador {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }
}