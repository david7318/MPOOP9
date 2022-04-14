package actividadesExtra;

/**
 * Clase que crea a un Perro y que hereda de Mascota.
 * @author David Montoya
 */
public class Perro extends Mascota {
    private boolean colaCortada;
    /**
     * Constructor vacío.
     */
    public Perro() {
    }
    /**
     * Constructor con parámetros.
     * @param colaCortada Indica si el perro tiene la cola cortada.
     * @param color Color del perro.
     * @param raza Raza del perro.
     * @param colorOjos Color de ojos del perro.
     * @param nombre Nombre del perro.
     * @param edad Edad del perro.
     */
    public Perro(boolean colaCortada, String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.colaCortada = colaCortada;
    }
   
    public boolean isColaCortada() {
        return colaCortada;
    }
    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }
    
    //MÉTODOS DEFINIDOS POR EL PROGRAMADOR
    /**
     * Método que indica cuando un objeto de tipo Perro está corriendo.
     */
    public void correr (){
    System.out.println("Estoy corriendo");
    }
    /**
     * Método que indica cuando un objeto de tipo Perro está corriendo.
     */
    public void corretear (){
    System.out.println("Estoy correteando");}    
    /**
     * Método que indica cuando un objeto de tipo Perro está durmiendo.
     */
    @Override
    public void dormir() {
        System.out.println("El perro está durmiendo.");
    }
    
    /**
     * Método que indica cuando un objeto de tipo Perro está saltando.
     */
    @Override
    public void saltar() {
        System.out.println("El perro está saltando.");
    }
    /**
     * Método que indica cuando un objeto de tipo Perro está jugando.
     */
    @Override
    public void jugar() {
        System.out.println("El perro está jugando.");
    }
    /**
     * Método que indica cuando un objeto de tipo Perro está respirando.
     */
    @Override
    public void respirar() {
        System.out.println("El perro está respirando.");
    }
    
    /**
     * Método que devuelve la información del perro.
     * @return Devuelve la informacion del perro en forma de String.
     */
    @Override
    public String toString() {
        return super.toString()+"Perro{" + "colaCortada=" + colaCortada + '}';
    }
}