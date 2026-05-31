public class ErrorHerencia extends Empleado, Persona {}
//no compila porque una clase no puede heredar de dos clases al mismo tiempo, lo que se conoce como herencia múltiple. En Java, una clase solo puede extender de una clase padre. Para solucionar este error, se debe elegir una sola clase para heredar o utilizar interfaces si se necesita implementar múltiples comportamientos.
