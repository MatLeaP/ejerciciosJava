package entidades;

public class Pelicula {
    private String titulo;
    private String genero;
    private int duracion;
    private boolean disponible = true;
    private int año;


    public Pelicula(String titulo, int año){
        this.titulo = titulo;
        this.año = año;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }  

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public int getAño() {
        return año;
    }
}
