package calses;
import java.util.Scanner;
public class Calses {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        /*vacio
        inicializado
        */
        //Arreglo bidimensionales - Vacio
        int[][] nums;
        //Crear
        nums = new int [2][2];
        //asignar los elementos a la matriz
        nums[0][0] = 5;
        nums[0][1] = 10;
        nums[1][0] = 15;
        nums[1][1] = 20;
        //Visualizar todos los elementos de la matriz
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j <nums.length; j++){
                System.out.println("[" +i+ "][" +j+ "]" + " ==> " + nums[i][j]);
            }
        }
                
    }
    
}
