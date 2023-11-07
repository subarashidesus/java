package academico;
public class Academico {
    public static void main(String[] args) {
        alumno angel = new alumno( " Angel Chira", 45);
        alumno ale = new alumno();
        ale.setNombre("Alesandro Miranda");
        ale.setCreditos(42);
        System.out.println(angel+ "\n" + ale);
    }
    
}
