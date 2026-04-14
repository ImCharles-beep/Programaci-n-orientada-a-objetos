import java.util.Scanner;

public class ProtectoIntegrador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Creación de objetos de cada clase
        // Objeto de la clase Libro (usando constructor parametrizado)
        System.out.println("--- Creando un nuevo libro ---");
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Libro nuevoLibro = new Libro(titulo, autor, paginas);

        // Objeto de la clase CuentaBancaria (usando constructor de 2 parámetros)
        System.out.println("\n--- Abriendo una nueva cuenta bancaria ---");
        System.out.print("Ingrese el número de cuenta: ");
        String numCuenta = scanner.nextLine();
        System.out.print("Ingrese el tipo de cuenta (ej. Ahorros/Corriente): ");
        String tipoCuenta = scanner.nextLine();

        CuentaBancaria nuevaCuenta = new CuentaBancaria(numCuenta, tipoCuenta);

        // Objeto de la clase Estudiante (usando constructor por defecto)
        Estudiante nuevoEstudiante = new Estudiante();
        // 2. Mostrar los detalles de los objetos
        System.out.println("\n--- Resumen de los objetos creados ---");
        System.out.println(nuevoLibro.toString());
        System.out.println(nuevaCuenta.toString());
        System.out.println(nuevoEstudiante.toString());

        // Cierre del Scanner
        scanner.close();
    }
}