package Libreria;

public class Genero implements MostrarInfo {

    private String nombre = "terror";

    @Override
    public void imprimir() {
        System.out.println(nombre);;
    }
    
}
