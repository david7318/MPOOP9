package actividadesExtra;

/**
 * Súper clase abstracta Mascota que hereda de Persona.
 * @author David Montoya
 */
public abstract class Empleado extends Persona{
    private float salario;
    private int horaEntrada, horaSalida;

    /**
     * Constructor vacío.
     */
    public Empleado() {
    }
    /**
     * Constructor que recibe los parámetros de la clase Empleado.
     * @param salario Salario del empleado.
     * @param horaEntrada Hora de entrada del empleado.
     * @param horaSalida Hora de salida del empleado.
     * @param mascota Mascota del empleado.
     * @param nombre Nombre del empleado.
     * @param edad Edad del empleado.
     */
    public Empleado(float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.salario = salario;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    /**
     * Método abstracto que deberá indicar cuando un objeto de tipo Empleado está aclarando dudas.
     */
    public abstract void aclararDudas();
    
    /**
     * Método que devuelve la información del empleado.
     * @return Devuelve la informacion del alumno en forma del empleado.
     */
    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "salario=" + salario + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }
}

