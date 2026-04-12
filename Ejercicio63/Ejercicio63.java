package poo.Ejercicio63;
// la clase hospital puede tener lo siguiente
// Atributos: nombre, ubicación, número de camas
// Métodos: admitirPaciente(), darAlta(), programarCita()
// Objetos hospital1 = new hospital();
// hospital1.nombre = "Hospital Central";
// hospital1.ubicación = "Calle Principal 123";
// hospital1.númeroDeCamas = 200;
class hospital {
    String nombre;
    String ubicación;
    int númeroDeCamas;

    void admitirPaciente() {
        System.out.println("Admitiendo paciente en " + nombre);
    }

    void darAlta() {
        System.out.println("Dando de alta a un paciente en " + nombre);
    }

    void programarCita() {
        System.out.println("Programando cita en " + nombre);
    }
}