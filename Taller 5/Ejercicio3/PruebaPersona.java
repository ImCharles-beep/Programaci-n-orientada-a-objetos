public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 30);
        
        System.out.println("--- Acceso a atributos ---");
        System.out.println("Edad (acceso directo, de paquete): " + persona1.edad);
        persona1.edad = 31;
        System.out.println("Nueva edad: " + persona1.edad);
        
        System.out.println("-------------------------");
        
        System.out.println("Nombre (a traves del metodo get): " + persona1.getNombre());
        
        persona1.setNombre("Ana Maria");
        System.out.println("Nuevo nombre (a traves del metodo set): " + persona1.getNombre());
    }
}