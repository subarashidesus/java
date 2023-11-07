package explicacion;
import java.util.Scanner;
public class Explicacion {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int[][] items = new int[3][3];
        for(int f = 0; f < items.length; f++){
            for(int c = 0; c < items.length; c++){
                System.out.println("Ingrese elementos a la matriz");
                items[f][c] = sc.nextInt();
            }
        }
        System.out.println("");
        for(int i = 0; i < items.length; i++){
            for(int j = 0; j < items.length; j++){
                System.out.println(items[i][j]);
            }
        }
    }
    
}
