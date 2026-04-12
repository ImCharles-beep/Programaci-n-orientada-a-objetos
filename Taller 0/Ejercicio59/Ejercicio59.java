package poo.Ejercicio59;
class UsuarioSistema{
    String NombreUsuario;
    String Clave;
    Boolean Activo;
    void activarUsuario(){
        this.Activo = true;
    }
    void desactivarUsuario(){
        this.Activo = false;
    }
}