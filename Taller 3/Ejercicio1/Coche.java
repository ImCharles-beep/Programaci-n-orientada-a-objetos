public class Coche {
    // Atributos de instancia: pertenecen a cada objeto Coche.
    String marca;
    String modelo;

    // Atributo de clase (static): pertenece a la clase Coche, no a un objeto individual.
    // Lo inicializamos en 0.
    static int contadorCoches = 0;

    // Constructor de la clase Coche
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        
        // Cada vez que se crea un nuevo Coche, incrementamos el contador.
        contadorCoches++;
    }

    // Getter para la marca
    public String getMarca() {
        return marca;
    }

    // Método estático para mostrar la cantidad total de coches creados.
    // Es 'static' porque no necesita un objeto específico para ejecutarse;
    // simplemente accede al contador de la clase.
    public static void mostrarTotalCoches() {
        System.out.println("Se han creado un total de " + contadorCoches + " coches.");
    }

    // Método de instancia para mostrar la información de un coche específico.
    public void mostrarInformacion() {
        System.out.println("Coche -> Marca: " + this.marca + ", Modelo: " + this.modelo);
    }

    // Sobrescribimos el método toString() para obtener una representación en texto del objeto.
    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    // El método principal para probar el código.
    public static void main(String[] args) {
        System.out.println("Iniciando la creación de coches...");

        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("Ford", "Focus");

        // Ahora podemos usar los métodos de instancia para ver los detalles de cada coche.
        System.out.println("\nDetalles de los coches creados:");
        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
        System.out.println(coche3.toString()); // Usando el método toString

        System.out.println("Informacion del coche 1: " + coche1.toString());

        System.out.println("Coches creados. Ahora vamos a ver cuántos hay.");
        
        // Llamamos al método estático para ver el recuento.
        // Lo llamamos directamente desde la clase, no desde un objeto.
        Coche.mostrarTotalCoches(); 
    }
}    
