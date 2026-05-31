public class Persona implements Hablador, Trabajador {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " está hablando.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }
}