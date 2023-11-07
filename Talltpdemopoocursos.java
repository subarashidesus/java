package talltpdemopoocursos;
import java.util.Date;
public class Talltpdemopoocursos {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCodigo(123); curso1.setNombre("Matematica 1");
        curso1.setCreditos(6); curso1.fecha = new Date();
        
        Curso curso2 = new Curso(789, "Fisica", 4);
        
        System.out.println("Curso: CodigO= " + curso1.getCodigo() + 
                ", nombre = " + curso1.getNombre() + ", creditos = " + curso1.getCreditos() +
                ", fecha instauracion = " + curso1.getFecha());
        System.out.println("Curso: CodigO= " + curso2.getCodigo() + 
                ", nombre = " + curso2.getNombre() + ", creditos = " + curso2.getCreditos() +
                ", fecha instauracion = " + curso2.getFecha());
    }  
}

class Curso{
    int codigo;
    String nombre;
    int creditos;
    Date fecha;
    public Curso(){
        fecha = new Date();
    }
    public Curso(int codigo, String nombre, int creditos){
        fecha = new Date();
        this.codigo = codigo; this.nombre = nombre; this.creditos = creditos;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCreditos(int creditos){
        this.creditos = creditos;
    }
    
    
    
    
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCreditos(){
        return creditos;
    }
    public Date getFecha(){
        return fecha;
    }
}
