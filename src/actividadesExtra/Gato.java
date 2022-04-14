package actividadesExtra;

/**
 * Clase que crea a un Gato y que hereda de Mascota.
 * @author David Montoya
 */
public class Gato extends Mascota {
    /**
     * Constructor vacío.
     */
    public Gato() {
    }
    
    /**
     * Constructor con parámetros.
     * @param color Color del gato.
     * @param raza Raza del gato.
     * @param colorOjos Color de ojos del gato.
     * @param nombre Nombre del gato.
     * @param edad Edad del gato.
     */
    public Gato(String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
    }
    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    /**
     * Método que indica cuando un objeto de tipo Gato está rasguñando.
     */
    public void rasguniar() {
        System.out.println("Estoy rasguñando");
    }
    /**
     * Método que indica cuando un objeto de tipo Gato está trepando.
     */
    public void trepar() {
        System.out.println("Estoy trepando");
    }
    /**
     * Método que indica cuando un objeto de tipo Gato está durmiendo.
     */
    @Override
    public void dormir() {
        System.out.println("El gato está durmiendo.");
    }
    /**
     * Método que indica cuando un objeto de tipo Gato está saltando.
     */
    @Override
    public void saltar() {
        System.out.println("El gato está saltando.");
    }
    
    /**
     * Método que indica cuando un objeto de tipo Gato está jugando.
     */
    @Override
    public void jugar() {
        System.out.println("El gato está jugando.");
    }
    /**
     * Método que indica cuando un objeto de tipo Gato está respirando.
     */
    @Override
    public void respirar() {
        System.out.println("El gato está respirando.");
    }
    
    /**
     * Método que devuelve la información del gato.
     * @return Devuelve la informacion del gato en forma de String.
     */
    @Override
    public String toString() {
        return super.toString()+"Gato{" + '}';
    }
    
}
