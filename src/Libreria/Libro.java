package Libreria;

public class Libro implements MostrarInfo{

    private String titulo = "soy un libro";

    @Override
    public void imprimir() {
        System.out.println(titulo);
    }
    
}
