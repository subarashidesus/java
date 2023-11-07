package academico;
public class alumno extends Persona {
    public double getCreditos() {
        return creditos;
    }
    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }
    public alumno() {
    }

    public String toString() {
        return "alumno{" + " nombre = " + super.toString() + creditos=" + creditos + '}';
    }
    public alumno(String nombre, double creditos) {
        this.creditos = creditos;
    }    
    private double creditos;
}
