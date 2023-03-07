package Figuras;

public class Circulo extends Figura {
    
    private double radio;
    private double pi;

    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getPi() {
        return pi;
    }
    
    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public double calcularArea() {
        double resultadoCirculo = pi * (radio * radio);
        return resultadoCirculo;
    }

    
}
