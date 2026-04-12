package poo.Ejercicio62;
//la clase libro puede tener lo siguiente
// Atributos: título, autor, número de páginas
// Métodos: leer(), resumir(), recomendar()
// Objetos libro1 = new libro();
// libro1.título = "Cien años de soledad";
// libro1.autor = "Gabriel García Márquez";
// libro1.númeroDePáginas = 417;
class libro {
    String título;
    String autor;
    int númeroDePáginas;

    void leer() {
        System.out.println("Estás leyendo " + título + " de " + autor);
    }

    void resumir() {
        System.out.println("Resumiendo " + título + "...");
    }

    void recomendar() {
        System.out.println("Recomiendo " + título + " de " + autor);
    }
}