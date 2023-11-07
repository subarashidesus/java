package insertar;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Insertar {
    public static void main(String[] args) {
         Scanner lector = new Scanner(System.in);
         
         int [][] matriz;
         int n_colum, n_filas;
         
         n_filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de filas"));
          n_colum = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de filas"));
          
         matriz = new int [n_filas][n_colum];

          
          //Mostrero de datos solo creación, te va botar 0 en cada matriz
          
          
          for(int i = 0; i < n_filas; i++){
              for(int j = 0; j < n_colum; j++){
                  System.out.println(matriz[i][j]+ " ");
              }
              System.out.println("");
          }
          
         //Ingresar datos
         System.out.println("Insertando en cada fila y columna de la matriz");
         for(int i = 0; i < n_filas; i++){
             System.out.println("Inserción de Fila " + (i + 1));
             for(int j = 0; j < n_colum; j++){
                 System.out.println("Matriz [" + i + "][" + j + "]:");
                 matriz[i][j] = lector.nextInt();
             }
         }
         // Muestreo de datos
         System.out.println("Mostar matriz de datos");
         for(int i = 0; i < n_filas; i++){
             for(int j = 0; j < n_colum; j++){
                 System.out.print(matriz[i][j] +" ");
             }
             System.out.println("");
    }
    
}
}
