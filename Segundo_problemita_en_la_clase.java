package segundo_problemita_en_la_clase;
public class Segundo_problemita_en_la_clase {
    public static void main(String[] args) {
        /* Arreglos bidimensionales - Matrices */
        //Declarar inicializado
        int[][] nums = {{1, 2, 5}, 
                        {2, 4, 6},
                        {11, 50, 80}};
                           
        //Recorrer todos los elementos de la matriz
        for(int x= 0; x < nums.length; x++){
            for(int z = 0; z < nums[0].length; z++){
                System.out.print("[" + x + "][" + z + "]" + "--->" + nums[x][z]+ " - ");
            }
            System.out.println(" ");
            
        }
        
    }
    
}
