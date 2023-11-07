package personas;
public class Personas {
    private String nombre;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    private int edad;
    private String apellidos;
    private char sexo;
    // Constructor
    public Personas(String nombre, int edad, String apellidos, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.sexo = sexo;
    }
    public Personas(String nombre){
        this.nombre = nombre;
        this.edad = 0;
        this.apellidos = null;
        this.sexo = ' ';
    }
    
    
    
    
    
    
  
}
