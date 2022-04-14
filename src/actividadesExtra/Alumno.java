package actividadesExtra;

/**
 *  Clase que crea a un Alumno que se hereda de Persona.
 * @author David Montoya
 */
public class Alumno extends Persona{
    private String carrera;
    private int semestre;

    /**
     * Constructor vacío.
     */
    public Alumno() {
    }
    /**
     * Constructor que recibe los parámetros de la clase Alumno.
     * @param carrera Carrera del alumno.
     * @param semestre Semestre que cursa el alumno.
     * @param mascota Mascota del alumno.
     * @param nombre Nombre del alumno.
     * @param edad Edad del alumno.
     */
    public Alumno(String carrera, int semestre, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    /**
    *Método para indicar que el alumno está respirando.
    */
    @Override
    public void respirar() {
        System.out.println("El alumno está respirando.");
    }
    /**
    *Método para indicar que el alumno está aprendiendo.
    */
    public void aprender(){
        System.out.println("Estoy aprendiendo.");
    }
    /**
    *Método para indicar que el alumno está estudiando.
    */
    public void estudiar(){
        System.out.println("Estoy estudiando.");
    }
    /**
    *Método para indicar que el alumno se está dando de baja.
    */
    public void darseDeBaja(){
        System.out.println("Me estoy dando de baja.");
    }
    /**
     * Método que devuelve la información del alumno.
     * @return Devuelve la informacion del alumno en forma de String.
     */
    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "carrera=" + carrera + ", semestre=" + semestre + '}';
    }

}

