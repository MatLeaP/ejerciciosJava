package entidades;

public class Cuenta {

    private int cantidad;
    private String titular;
    
    public Cuenta(int cantidad, String titular){
        this.setTitular(titular);
        this.setCantidad(cantidad);
    }

    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public void ingresar(int cantidad){
        cantidad += cantidad;
    }

    public int retirar(int cantidad){
        return cantidad;
    }

}
