public class Corregido {    
    private String nombre = "Charles";

    // Un método static pertenece a la CLASE, no al objeto
    public void metodoEstatico() {
        // ERROR DE COMPILACIÓN:
        // "non-static variable this cannot be referenced from a static context"
        System.out.println("Hola: " + this.nombre); 
    }
}
