package mpoop9;

import actividadesExtra.Alumno;
import actividadesExtra.Gato;
import actividadesExtra.Mesero;
import actividadesExtra.Perro;
import actividadesExtra.ProfesorAsignatura;
import actividadesExtra.ProfesorCarrera;

/**
 * Clase principal.
 * @author David Montoya
 */
public class MPOOP9 {

    public static void main(String[] args) {
        System.out.println("'n-------DESARROLLO-------");
        //Poligono poligno= new Poligono(); NO SE PUEDEN IMPLEMENTAR CLASES ABSTRACTAS
        
        Triangulo triangulo= new Triangulo();
        System.out.println(triangulo);
        
        Cuadrilatero cuadrilatero= new Cuadrilatero();
        System.out.println(cuadrilatero);
        
        System.out.println(triangulo.getBase());
        Triangulo triangulo2 = triangulo;
        System.out.println(triangulo2.getBase());
        
        triangulo2.setBase(9);
        System.out.println(triangulo2.getBase());
        System.out.println(triangulo.getBase());
        triangulo2.setBase(0);
        
        System.out.println("'n-------ACTIVIDADES EXTRA-------");
        System.out.println("\n-----Creando un perro-----");
        Perro perro = new Perro(true, "café","husky","azules","Laila",5);
        System.out.println(perro);
        System.out.println("\n-----Creando un gato-----");
        Gato gato = new Gato ("blanco", "persa", "verdes", "Milo", 4);
        System.out.println(gato);
        
        System.out.println("\n-----Creando un alumno-----");
        Alumno alumno = new Alumno("Eléctrica", 5, perro ,"Juan", 19);
        System.out.println(alumno);
        
        System.out.println("\n-----Creando un mesero-----");
        Mesero mesero = new Mesero("Vapiano", "negro", 7_500, 10, 19,gato,"Juan", 21);
        System.out.println(mesero);
        
        System.out.println("\n-----Creando un profesor de asignatura-----");
        ProfesorAsignatura profesor1 = new ProfesorAsignatura("Mecánica", 8_500, 9, 11, perro, "Benito", 40);
        System.out.println(profesor1);
        
        System.out.println("\n-----Creando un profesor de carrera-----");
        ProfesorCarrera profesor2 = new ProfesorCarrera(3, 4,11_500, 7, 13,gato, "Fidel", 52);
        System.out.println(profesor2);
    }
}
