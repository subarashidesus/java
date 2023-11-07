package que_buena;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Que_buena {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int n_elementos, opcion, aux;
        
        n_elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingresar tamaño del arreglo"));
        
        int[] arreglo = new int[n_elementos];
        
        for(int i = 0; i < n_elementos; i++){
            System.out.println("Ingresar numero " +(i + 1)+ ":"); 
            arreglo[i] = lector.nextInt();
        }
        
        System.out.println("""
                           Menu de opciones
                           [1] Ordenar de forma ascendente
                           [2] Ordenar de forma descendente
                           Elegir opcion:""");
        opcion = lector.nextInt();
        switch(opcion){
            case 1 -> {
                for (int i = 0; i < n_elementos - 1; i++){
                    for (int j = 0; j < n_elementos - 1; j++){
                        
                        if(arreglo[j] > arreglo [ j + 1]){
                            aux = arreglo[j];
                            arreglo[j] = arreglo[j + 1];
                            arreglo[j + 1] = aux;
                        }
                    }
                }
                
                System.out.println("Arreglo ordenado");
                for(int i = 0; i < n_elementos; i++){
                    System.out.print(arreglo[i] + " - ");
                }
                
            }
            case 2 -> {
                for (int i = 0; i < n_elementos - 1; i++){
                    for( int j = 0; j < n_elementos - 1; j++){
                        
                        if(arreglo[j] < arreglo [ j + 1]){
                            aux = arreglo[j];
                            arreglo[j] = arreglo [j + 1];
                            arreglo[j + 1] = aux;
                        }
                    }
                }
                
                System.out.println("Arreglo ordenado");
                for(int i = 0; i < n_elementos; i++){
                    System.out.print(arreglo[i] + " - ");
                }  
               
        }
            default -> System.out.println("Error, no existe opcion");
        }   
    }
    
}
