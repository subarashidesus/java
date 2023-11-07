package personas;


public class Uso_operaciones {
    public static void main(String[] args) {
        Operaciones op_1 = new Operaciones(10);
    
    int suma;
    
    op_1.setNumero_1(20);
    suma = op_1.Realizar_suma(op_1.getNumero_1(),op_1.getNumero_2());
    
        System.out.println("La suma es -> " + suma );
        
    }        
}
