import entidades.Humano;
import entidades.Pelicula;
import entidades.Autos;
import entidades.Cuenta;
import entidades.Persona;
import entidades.Pelicula;
import Figuras.Cuadrado;
import Libreria.Autor;
import Libreria.Genero;
import Libreria.Libro;
import Libreria.MostrarInfo;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*Autos fiat = new Autos(0, "Fiat");
        
        
        System.out.println(fiat.getMarca());
        System.out.println(fiat.getPuertas());
        System.out.println(fiat.getMarca());
        
        Cuenta uno = new Cuenta(0, "Matias");

        uno.ingresar(500);
        System.out.println(uno.getTitular());
        System.out.println(uno.getCantidad());


        Persona persona1 = new Persona("Matias", "Perona", 34 , 1010101);
        System.out.println(persona1.esMayorDeEdad());
        Persona persona2 = new Persona("Santiago", "Perona", 6, 2421);
        System.out.println(persona2.esMayorDeEdad());

        Pelicula terminator = new Pelicula("Terminator 2", 1994);
        System.out.println(terminator.getAño());
        System.out.println(terminator.getTitulo());

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setNumeroLados(2);
        cuadrado.mostrarCantidadDeLados("cuadrado");*/

        //clases abstractas, interfaces y polimorfismo
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setNumeroLados(2);
        cuadrado.mostrarCantidadDeLados("cuadrado");

        MostrarInfo autor = new Autor();
        MostrarInfo genero = new Genero();
        MostrarInfo libro = new Libro();
        procesar(autor);
        procesar(genero);
        procesar(libro);

    }
    private static void procesar(MostrarInfo m){
        m.imprimir();
    }
}
