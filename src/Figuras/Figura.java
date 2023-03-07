package Figuras;

public abstract class Figura {
    private int numeroLados;

    public Figura(){

    }

    public abstract double calcularArea();

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    
    public int getNumeroLados() {
        return numeroLados;
    }

    public void mostrarCantidadDeLados(String nombre){
        System.out.println("Soy un " + nombre + " y tengo " + numeroLados);
    }


}
