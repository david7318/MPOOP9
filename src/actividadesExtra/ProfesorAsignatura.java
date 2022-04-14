package actividadesExtra;

/**
 * Clase que crea a un profesor de asiganatura.
 * @author David Montoya
 */
public class ProfesorAsignatura extends Profesor{
    private String nombreAsignatura;
    /**
     * Constructor vacio
     */
    public ProfesorAsignatura() {
    }
    /**
     * Constructor con parámetros.
     * @param nombreAsignatura Nombre de la asigntura que imparte.
     * @param salario Salario del profesor.
     * @param horaEntrada Hora de entrada del profesor.
     * @param horaSalida Hora de salida del profesor.
     * @param mascota Mascota del profesor.
     * @param nombre Nombre del profesor.
     * @param edad Edad del profesor.
     */
    public ProfesorAsignatura(String nombreAsignatura, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.nombreAsignatura = nombreAsignatura;
    }
    
    
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR.
    
    /**
     * Método que indica si el profesor reprueba a alguien.
     */
    @Override
    public void reprobar() {
        System.out.println("El profesor reprueba a sus alumnos.");
    }
    /**
     * Método que indica si el profesor pasa a alguien.
     */
    @Override
    public void pasarAlumno() {
        System.out.println("El profesor pasa a sus alumnos.");
    }
    /**
     * Método que indica si el profesor está explicando.
     */
    @Override
    public void explicar() {
        System.out.println("El profesor está explicando.");
    }
    /**
     * Método que indica si el profesor está aclarando dudas.
     */
    @Override
    public void aclararDudas() {
        System.out.println("El profesor está aclarando dudas.");
    }
    /**
     * Método que indica si el profesor está respirando.
     */
    @Override
    public void respirar() {
        System.out.println("El profesor está respirando.");
    }
    
    
    /**
     * Metodo que devuelve la informacion de la clase ProfesorAsignatura
     * concatenada con la informacion de la super clase Profesor
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + "ProfesorAsignatura{" + "nombreAsignatura=" + nombreAsignatura + '}';
    }
}
