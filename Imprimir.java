package imprimir;
import java.util.Scanner;
public class Imprimir {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese la dimension de la matriz cuadrada (n>1): ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        for(int i = 0; i < m.length; i++){
            
            for(int j= 0; j < m[i].length; j++){
                m[i][j] = (int)(Math.random()*6+1);
                System.out.print(m[i][j]+ "\t");
            }
            System.out.println();
        }
        
        System.out.println("Los elementos de la diagonal son: ");
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(i == j) System.out.print(m[i][j]+"\t");
            }
            
        }
    }
    
}
