package poo.Ejercicio53;
class Reserva{
    String NombreCliente;
    String FechaReserva;
    boolean Confirmada;

    void confirmarReserva(){
        this.Confirmada = true;
    }
    void cancelarReserva(){
        this.Confirmada = false;
    }
}