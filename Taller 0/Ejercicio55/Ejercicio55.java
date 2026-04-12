package poo.Ejercicio55;
class Reloj {
    int hora, minuto, segundo;
    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    void mostrarHora() {
        System.out.println("La hora es: " + hora + ":" + minuto + ":" + segundo);
    }
}