package ejercicio_3;
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        /* arreglos bidimensionales - matrices */
        // Declarar y crear (vacio)
        int[][] items = new int [3][3];
        //Leer los elementos de la matriz
        
        for(int f = 0; f < items.length; f++){
            for(int c = 0; c < items.length; c++){
                 System.out.println("Ingresar elementos a la matriz");
                items[f][c] = sc.nextInt();
            }
        }
        for(int f = 0; f < items.length; f++) // Este for es para la fila
        {
            for(int c = 0; c < items[0].length; c++)
            {
                System.out.print(items[f][c]+ " - ");
            }
            System.out.println("");
        }
        // for (int f = 0; f < items.length; f++)
            /* for(int c = 0; c < items[0].length; c++)
        {
        System.out.println("");
        }
        System.out.println
        */
    }
    
}
