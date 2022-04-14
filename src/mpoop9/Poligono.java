package mpoop9;

/**
 * Súper clase abstracta Poligono.
 * @author David Montoya
 */
public abstract class Poligono {
    /**
     * Método abstracto que deberá regresar el área para clases heredadas.
     * @return Área del polígono.
     */
    public abstract float area();
    /**
     * Método abstracto que deberá regresar el perímetro para clases heredadas.
     * @return Perímetro del polígono.
     */
    public abstract float perimetro();
    /**
     * Método toString() de la clase Poligono.
     * @return Atributos de un objeto de tipo Poligono como cadena.
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
