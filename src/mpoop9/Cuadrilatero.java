package mpoop9;

/**
 * Clase que crea un cuadrilátero que es heredada de la clase abstracta Poligono.
 * @author David Montoya
 */
public class Cuadrilatero extends Poligono{
    private int alfa, beta;
    private float a,b;
    private float base, altura;
    /**
     * Constructor vacío.
     */
    public Cuadrilatero() {
    }
    /**
     * Constructor con parámetros.
     * @param base Base del cuadrilátero.
     * @param altura Altura del cuadrilátero.
     */
    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public int getAlfa() {
        return alfa;
    }
    public int getBeta() {
        return beta;
    }
    public float getA() {
        return a;
    }
    public float getB() {
        return b;
    }
    public float getBase() {
        return base;
    }
    public float getAltura() {
        return altura;
    }
    public void setBeta(int beta) {
        this.beta = beta;
    }
    public void setBase(float base) {
        this.base = base;
    }
    
    /**
     * Método que calcula el área del cuadrilátero.
     * @return Área del cuadrilátero.
     */        
    @Override
    public float area() {
        return base*altura;
    }
    
    /**
     * Método que calcula el perímetro del cuadrilátero.
     * @return Perímetro del cuadrilátero.
     */
    @Override
    public float perimetro() {
        return 2*(a+b);
    }
    
    /**
     * Método toString() de la clase Cuadrilatero.
     * @return Atributos de un objeto de tipo Cuadrilatero como cadena.
     */
    @Override
    public String toString() {
        return super.toString()+"Cuadrilatero{" + '}';
    }
}
