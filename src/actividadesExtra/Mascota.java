package actividadesExtra;

/**
 * Súper clase abstracta Mascota que hereda de SerVivo.
 * @author David Montoya
 */
public abstract class Mascota extends SerVivo{ 
    private String color;
    private String raza;
    private String colorOjos;
    /**
     * Constructor vacío.
     */
    public Mascota() {
    }
    /**
     * Constructor que recibe los parámetros de la clase SerVivo.
     * @param color Color de la mascota.
     * @param raza Raza de la mascota.
     * @param colorOjos Color de ojos de la mascota.
     * @param nombre Nombre de la mascota.
     * @param edad Edad de la mascota.
     */
    public Mascota(String color, String raza, String colorOjos, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }
    /**
     * Método abstracto que deberá indicar cuando un objeto de tipo Mascota está durmiendo.
     */
    public abstract void dormir ();
    /**
     * Método abstracto que deberá indicar cuando un objeto de tipo Mascota está saltando.
     */
    public abstract void saltar ();
    /**
     * Método abstracto que deberá indicar cuando un objeto de tipo Mascota está jugando.
     */
    public abstract void jugar ();
    
    /**
     * Método que devuelve la información de la mascota.
     * @return Devuelve la informacion de la masctoa en forma de String.
     */
    @Override
    public String toString() {
        return super.toString()+"Mascota{" + "color=" + color + ", raza=" + raza + ", colorOjos=" + colorOjos + '}';
    }
   
}

