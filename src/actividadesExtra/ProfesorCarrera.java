package actividadesExtra;

/**
 * Clase que crea a un profesor de carrera.
 * @author David Montoya
 */
public class ProfesorCarrera extends Profesor{
    private int numAsignaturas;
    private int grupos;
    /**
     * Constructor vacio
     */
    public ProfesorCarrera() {
    }
    
   /**
    * Constructor con parámetros.
    * @param numAsignaturas Número de asignaturas del profesor.
    * @param grupos Grupos del profesor.
    * @param salario Salario del profesor.
    * @param horaEntrada Hora de entrada del profesor.
    * @param horaSalida Hora de salida del profesor.
    * @param mascota Mascota del profesor.
    * @param nombre Nombre del profesor.
    * @param edad Edad del profesor.
    */
    public ProfesorCarrera(int numAsignaturas, int grupos, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.numAsignaturas = numAsignaturas;
        this.grupos = grupos;
    }

    public int getNumAsignaturas() {
        return numAsignaturas;
    }

    public void setNumAsignaturas(int numAsignaturas) {
        this.numAsignaturas = numAsignaturas;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
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
     * Metodo que devuelve la informacion de la clase ProfesorCarrera
     * concantenada con la informacion de la suepr clase Profesor
     * @return Informacion de la clase ProfesorCarrera
     * concantenada con la informacion de la súper clase Profesor
     */
    @Override
    public String toString() {
        return super.toString() + "ProfesorCarrera{" + "numAsignaturas=" 
                + numAsignaturas + ", grupos=" + grupos + '}';
    }
}
