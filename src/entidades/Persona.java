package entidades;

public class Persona {
    private String nombre ;
    private String apellido ;
    private int edad;
    private int dni;

    public Persona(){

    }
    public Persona(String nombre, String apellido, int edad, int dni){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setDni(dni);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getApellido(String apellido){
        return apellido;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(int edad){
        return edad;
    }

    public void setDni(int dni){
        this.dni = dni;
    }

    public int getDni(int dni){
        return dni;
    }

    
    public boolean esMayorDeEdad(){
        if(this.edad > 18){
            return true;
        }else{
            return false;
        }
    }

}
