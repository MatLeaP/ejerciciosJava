package Libreria;

public class Autor implements MostrarInfo {

    private String nombre = "matias";
    private String apellido = "perona";

    @Override
    public void imprimir() {
        System.out.println(nombre);
        System.out.println(apellido);
    }
    
}
