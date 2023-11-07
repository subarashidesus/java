package personas;
public class Operaciones {
    
    
    // Inicializamos
    private int numero_1;
    private int numero_2;
    

    // Constructor
    public Operaciones(int numero_1) {
        this.numero_1 = numero_1;
    }
    
    
    // Get and setters
    public int getNumero_1() {
        return numero_1;
    }

    public void setNumero_1(int numero_1) {
        this.numero_1 = numero_1;
    }

    public int getNumero_2() {
        return numero_2;
    }

    //Atributos
    public void setNumero_2(int numero_2) {
        this.numero_2 = numero_2;
    }
    
    //Todo este metodo te retorna un valor entero por ejemplo -> 30
    public int Realizar_suma(int numero_1, int numero_2){
        int suma;
        
        // suma = 10 + 20 ;
        // suma = 30;
        suma = numero_1 + numero_2;
        
        // retunr suma;
        // return 30;
        return suma;
    }
    
}
