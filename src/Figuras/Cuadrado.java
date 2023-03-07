package Figuras;

public class Cuadrado extends Figura{
    
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultadoCuadrado = lado * lado;
        return resultadoCuadrado;
    }



}
