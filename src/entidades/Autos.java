package entidades;

public class Autos {

    private int puertas;
    private String marca;
    
    public Autos(int puertas, String marca) {
        this.puertas = puertas;
        this.marca = marca;
    }



    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void abrirPuertas(){
        
    }

}
