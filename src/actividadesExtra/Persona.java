package actividadesExtra;

/**
 * Súper clase abstracta Persona que hereda de SerVivo.
 * @author David Montoya
 */
public abstract class Persona extends SerVivo{
    private Mascota mascota;
    /**
     * Constructor vacío.
     */
    public Persona() {
    }
    /**
     * Constructor que recibe los parámetros de la clase Persona.
     * @param mascota La mascota del ser vivo.
     * @param nombre El nombre del ser vivo.
     * @param edad La edad del ser vivo.
     */
    public Persona(Mascota mascota, String nombre, int edad) {
        super(nombre, edad);
        this.mascota = mascota;
    }
    
    /**
     * Método que devuelve la información de la persona.
     * @return Devuelve la informacion de la persona en forma de String.
     */
    @Override
    public String toString() {
        return super.toString()+"Persona{" + "mascota=" + mascota + '}';
    }
}
