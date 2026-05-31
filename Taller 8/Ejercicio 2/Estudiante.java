public class Estudiante extends Persona{
    public String Maricula;

    public Estudiante(String nombre, int edad, String Maricula) {
        super(nombre, edad);
        this.Maricula = Maricula;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Matrícula: " + Maricula);
    }
    
}
