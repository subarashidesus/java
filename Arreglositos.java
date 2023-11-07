package arreglositos;
public class Arreglositos {
    public static void main(String[] args) {
       int[][] matriz;
       matriz = new int[5][5];// Creando la matriz
       matriz[2][1] = 7;
       for(int i = 0; i < matriz.length; i++){
           for(int j = 0; j < matriz[0].length; j++){
               System.out.print(matriz[i][j] +"\t");
           }
           System.out.println("");
       }
    }
    
}
