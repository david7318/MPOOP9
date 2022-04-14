package actividadesExtra;

/**
 * Súper clase abstracta SerVivo.
 * @author David Montoya
 */
public abstract class SerVivo {
    private String nombre;
    private int edad;
    
    /**
     * Constructor vacío.
     */
    public SerVivo() {
    }
    /**
     * Constructor que recibe los parámetros de la clase SerVivo.
     * @param nombre Nombre del ser vivo.
     * @param edad Edad del ser vivo.
     */
    public SerVivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /**
     * Método abstracto que deberá indicar cuando un objeto de tipo SerVivo está respirando.
     */
    public abstract void respirar();
    
    /**
     * Método que devuelve la información del ser vivo.
     * @return Devuelve la informacion del ser vivo en forma de String.
     */
    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}

