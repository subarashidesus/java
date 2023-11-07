package estudiante;
public class Estudiante {
    public static void main(String[] args) {
        Estudiantes e = new Estudiantes();
       Estudiantes g= new Estudiantes();
       e.nombre = "Elianadel Santisbenan"; e.creditos= 44;
       g.nombre = "Gustavo Amaro"; g.creditos=44;
        System.out.println(e+"\n"+g);
        System.out.println("termino el ciclo, actualizamos creditos aprobados");
        e.actualizacreditos(22); g.actualizacreditos(10);
        System.out.println(e.toString());
        System.out.println(g);
    }
}
class Estudiantes{
    public String nombre;
    public double creditos;
    public void actualizacreditos(double credarprob){
        creditos += credarprob;
    }
    public String toString(){
        return "Estudiante nombre: " +nombre + ", creditos "+ creditos;
    }
}
