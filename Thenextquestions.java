package thenextquestions;

import java.util.Scanner;

public class Thenextquestions {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int suma = 0;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.println("Matriz [" +i+ "][" +j+ "]: ");
                matriz[i][j] = lector.nextInt();
        }
     }    
        
        System.out.println("\n");
        for(int i = 0; i < matriz.length; i++){
            for(int j= 0; j < matriz[0].length; j++)
                
            System.out.println(j);
        }
            
                ´
    }
    
}