public class producto{
    private  String Nombre;
    private  double Precio;

    public producto(String Nombre, Double Precio){
        this.Nombre = Nombre;   
        this.Precio = Precio;

    }
    public void MostrarProducto(){
        System.out.println("Producto: " +Nombre+"/"+"Precio: "+Precio);
   
    }
    public static void main(String [] args){
      producto miProducto = new producto("Tableta ",20000.0);
      miProducto.MostrarProducto();
    
    }
}