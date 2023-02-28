package entidades;

public class Humano {

    private int edad;
    private String nombre;

    public Humano() {

    }

    public Humano(int edad, String nombre) {
        this.setEdad(edad);
        this.setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void llamarAlImprimir() {
        imprimirInformacion();
    }

    private void imprimirInformacion() {
        System.out.println(this.edad);
        System.out.println(this.nombre);
    }
}

