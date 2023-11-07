package javaapplication60;
public class JavaApplication60 {
    public static void main(String[] args) {
        Estudiante e= new Estudiante();
        Estudiante g= new Estudiante();
        e.setNombre("Elianadel Santibel");
        System.out.println(e+"\n"+g);
        System.out.println("termino el ciclo, actualizamos creditos aprobadors");
        e.actualizacreditos(22); g.actualizacreditos(10);
        System.out.println(e);
        System.out.println(g);
        Estudiante j = new Estudiante("Julio Garcia", 38);
        System.out.println(j);
        Jframe f= new JFrame();
        JOptionPare
        
    }
    class Estudiante{
        private String nombre;
        private double creditos;
        public Estudiante(){
            creditos = 12;
        }
        public Estudiante(String nombre)
    }
    
}
