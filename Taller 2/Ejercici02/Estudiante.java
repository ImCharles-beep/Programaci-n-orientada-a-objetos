public class Estudiante {
    String Nombre;
    int Edad;
    
    public Estudiante(String Nombre, int Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
    }
        public Estudiante(){
        this("Marco",17);
    }
    public void imprimirDetalles(){
        System.out.println("Detalles del estudiante");
        System.out.println("------------------------");
        System.out.println("Nombre del estudiante:"+ Nombre);
        System.out.println("Edad del estudiante: "+ Edad);
    }
public static void main(String [] args){
    Estudiante est = new Estudiante();
    est.imprimirDetalles();
  }
}