package entidades;

public class Serie {
    private String titulo;
    private int temporada;
    private int capitulo;
    private String genero;
    private boolean disponible = true;

    public Serie(){

    }
    public Serie(String titulo, int temporada){
        this.setTitulo(titulo);
        this.setTemporada(temporada);
    }
    public Serie(String titulo, int temporada, int capitulo, String genero, boolean disponible ){
        this.setTitulo(titulo);
        this.setTemporada(temporada);
        this.setCapitulo(capitulo);
        this.setDisponible(disponible);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setGenero(String genero){
        this.genero =  genero;
    }
    
    public String getGenero(){
        return genero;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    
    public boolean getDisponible(){
        return disponible;
    }
}
