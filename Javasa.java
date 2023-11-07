package javasa;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Javasa {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
         int n_filas, n_colum, matriz[][];
         
         
         n_filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de filas"));
         n_colum = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de columnas"));
         
         matriz = new int[n_filas][n_colum];
         
         for(int i = 0; i < n_filas ; i++){
             for(int j = 0; j < n_colum; j++){
                 System.out.println("Matriz [" +i+ "][" +j+ "]: ");
                 matriz[i][j] = lector.nextInt();
             }
         }
         
         if(n_filas == n_colum){
             boolean simetrica = true;
             int i , j;
             i = 0;
             while( i < n_filas && simetrica == true){
                 j = 0;
                 while(j < i && simetrica == true){
                     if(matriz[i][j] != matriz [j][i]){
                         simetrica = false;
                     }
                     j++;
                 }
                 i++;
             }
             
             if(simetrica == false){
                 JOptionPane.showMessageDialog(null, "No es simetrica");
             }else{
                 JOptionPane.showMessageDialog(null, "Es una matriz cuadrada y simetrica");
                 
             }
          
         }else{
             JOptionPane.showMessageDialog(null, "No es simetrica");
         }
    }
    
}
