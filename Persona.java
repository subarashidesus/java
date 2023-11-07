package academico;
public class Persona {

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
    }
    private String nombre;

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
