package mpoop9;

/**
 * Clase que crea un triángulo que es heredada de la clase abstracta Poligono.
 * @author David Montoya
 */
public class Triangulo extends Poligono{
    private int alfa, beta, gama;
    private float a,b,c;
    private float base, altura;
    
    /**
     * Constructor vacío.
     */
    public Triangulo() {
    }
    /**
     * Constructor con parámetros.
     * @param base Base del triángulo.
     * @param altura Altura del triángulo.
     */
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }
    public int getBeta() {
        return beta;
    }
    public int getGama() {
        return gama;
    }
    public float getA() {
        return a;
    }
    public float getB() {
        return b;
    }
    public float getC() {
        return c;
    }
    public float getBase() {
        return base;
    }
    public float getAltura() {
        return altura;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Método que calcula el área del triángulo.
     * @return Área del triángulo.
     */
    @Override
    public float area() {
        return (base*altura)/2;
    }
    
    /**
     * Método que calcula el perímetro del triángulo.
     * @return Perímetro del triángulo.
     */
    @Override
    public float perimetro() {
        return a+b+c;
    }
    
    /**
     * Método toString() de la clase Triangulo.
     * @return Atributos de un objeto de tipo Triangulo como cadena.
     */
    @Override
    public String toString() {
        return super.toString()+"Triangulo{" + '}';
    }
}
