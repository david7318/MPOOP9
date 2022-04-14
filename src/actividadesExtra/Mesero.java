package actividadesExtra;

/**
 * Clase que crea a un mesero y que hereda de Empleado.
 * @author David Montoya
 */
public class Mesero extends Empleado{
    private String restaurante;
    private String colorDelUniforme;
    /**
     * Constructor vacío.
     */
    public Mesero() {
    }
    
    /**
     * Constructor con parámetros.
     * @param restaurante Restaurante donde trabaja.
     * @param colorDelUniforme Color del uniforme.
     * @param salario Salario del mesero.
     * @param horaEntrada Hora de entrada de trabajar del mesero.
     * @param horaSalida Hora de salida de trabajar del mesero.
     * @param mascota Mascota del mesero.
     * @param nombre Nombre del mesero.
     * @param edad Edad del mesero.
     */
    public Mesero(String restaurante, String colorDelUniforme, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.restaurante = restaurante;
        this.colorDelUniforme = colorDelUniforme;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getColorDelUniforme() {
        return colorDelUniforme;
    }

    public void setColorDelUniforme(String colorDelUniforme) {
        this.colorDelUniforme = colorDelUniforme;
    }
    
    /**
     * Metodo que recibe la propina.
     */
    public void recibirPropina(){
        System.out.println("Gracias por su propina");
    }
    /**
     * Metodo que da el pedido.
     */
    public void darPedido(){
        System.out.println("El pedido de mesa es...");
    }
    /**
     * Metodo que toma la orden.
     */
    public void recibirPedido(){
        System.out.println("Le tomo su orden");
    }
    /**
     * Método que indica que el mesero está aclarando dudas.
     */
    @Override
    public void aclararDudas() {
        System.out.println("El mesero aclara dudas.");
    }
    /**
     * Método que indica que el mesero está respirando.
     */
    @Override
    public void respirar() {
        System.out.println("El mesero respira.");
    }
    
    /**
     * Metodo que devuelve la informacion del mesero concatenado 
     * con la informacion de la superclase Empleado
     * @return Informacion del mesero concatenado 
     * con la informacion de la superclase Empleado
     */
    @Override
    public String toString() {
        return super.toString() + "Mesero{" + "restaurante=" + restaurante 
                + ", colorDelUniforme=" + colorDelUniforme + '}';
    }  
}

