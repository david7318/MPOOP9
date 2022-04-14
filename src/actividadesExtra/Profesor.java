package actividadesExtra;

/**
 * Súper clase abstracta Profesor que hereda de Empleado.
 * @author David Montoya
 */
public abstract class Profesor extends Empleado{
    private int numAlumno;
    
    /**
     * Constructor vacio
     */
    public Profesor() {
    }
    /**
     * Constructor con parámetros.
     * @param salario Salario del profesor.
     * @param horaEntrada Hora de entrada del profesor.
     * @param horaSalida Hora de salida del profesor.
     * @param mascota Mascota del profesor.
     * @param nombre Nombre del profesor.
     * @param edad Edad del profesor.
     */
    public Profesor(float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
    }
    /**
     * Método abstracto que deberá indicar cuando un objeto de tipo Profesor está reprobando a alguien.
     */
    public abstract void reprobar();
    /**
     * Método abstracto que deberá indicar cuando un objeto de tipo Profesor está pasando a sus alumnos.
     */
    public abstract void pasarAlumno();
    /**
     * Método abstracto que deberá indicar cuando un objeto de tipo Profesor está explicando a sus alumnos.
     */
    public abstract void explicar();
    
    /**
     * Metodo que devuelve la informacion de la clase Profesor
     * concatenada con la informacion de la super clase Empleado
     * @return La informacion de la clase Profesor
     * concatenada con la informacion de la super clase Empleado
     */
    @Override
    public String toString() {
        return super.toString() + "Profesor{" + '}';
    }  
}

