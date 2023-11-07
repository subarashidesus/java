package google;
public class Google {
    public static void main(String[] args) {
        /* 
        1 0  0   0   0    0   0 
         0  1  0  0  0   0   0 
        0   0   1   0  0  0 0 0
        0  0   0   0 1  0  0  0
         00  0   0  1 0  0  0 1
        
        
        1  1  1  1   1   1  1  1  1
        1 0   0   0  0   0  0  0  1
        1  0   0  0 
        1 
        1 
        1 
        1 
        1 
        1  
        
        Diagonal pricipal es c == f
        */
        
        int[][] matriz = new int[7][7];
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                
                if(i == j){
                    matriz[i][j] = 1;
                }else
                {
                    matriz[i][j] =0;
                }
            }
        }
        System.out.println("Mostrar datos de la matriz");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.printf("%-5d", matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
}
