package personas;
public class ClassYobjetos {
    public static void main(String[] args) {
        
        Personas p1 = new Personas("Paulo", 20, " Saman de los santos", "M");
        Personas p2 = new Personas("Gustavo");
        
        
        // referencia al constructor 1 
        System.out.println("Nombre - > " + p1.getNombre());
        p1.setNombre("Elias");
        System.out.println("\n ");
        
        System.out.println("Nombre -> " + p1.getNombre());
        System.out.println("Edad -> " + p1.getEdad());
        System.out.println("Apellidos -> " + p1.getApellidos());
        System.out.println("Sexo ->" +p1.getSexo());
        
    }// Referencia al constructor 2
    
       /* Persona p1 = new Persona();
        
        p1.setNombre("Gustavo");
        
        System.out.println("Mi nombre es -> " + p1.getNombre());
        
    }
    
}
