package arreglos;
public class Arreglos {
    public static void main(String[] args) {
        //Creando matriz con inicializador
        int[][] matriz = {{1, 2, 3}, 
                          {2, 4, 8},
                          {8, 10, 11}};
        
        /* int[] [] matriz_2 = new int [5][5];
        for(int
        
        */
        //Creando matriz con palabra reservada "new"
        int[][] matriz_2 = new int[5][5];
        
        // Mostrar datos de la matriz
        for(int i = 0; i < matriz.length; i++) // Este for es para la fila
        {
            for(int j = 0; j < matriz[0].length; j++)
            {
                System.out.print(matriz[i][j]+ " - ");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz 2");
        
        //Mostrar datos de la matriz
          
        for(int i = 0; i < matriz_2.length; i++) // Este for es para la fila
        {
            for(int j = 0; j < matriz_2[0].length; j++)
            {
                System.out.print(matriz_2[i][j]+ " - ");
            }
            System.out.println("");
        }
        
        matriz_2[0][0] = 1;
        matriz_2[2][2] = 1;
        
        System.out.println("\nMatriz con datos en [0][0] y [2][2]");
         for(int i = 0; i < matriz_2.length; i++) // Este for es para la fila
        {
            for(int j = 0; j < matriz_2[0].length; j++)
            {
                System.out.print(matriz_2[i][j]+ " - ");
            }
            System.out.println("");
        }
        
    }
    
}
