package solucion;

import java.util.Scanner;

public class Solucion {
    public static void main(String[] args) {
         Scanner lector = new Scanner (System.in);
        
        int suma_filas;
        int promedio;
        int [][] tres = new int[3][3];
        
        //Inserción de datos en la matriz
        System.out.println("Ingresar datos a la matriz ");
        
        for(int i = 0; i < tres.length; i++){
            for(int j= 0; j < tres[0].length; j++){
                System.out.print("Maatriz [" +i+ "][" +j+ "] :");
                tres[i][j] = lector.nextInt();
            }
        }
        for(int i = 0; i < tres.length; i++){
            suma_filas = 0;
            for(int j = 0; j < tres[0].length; j++){
                System.out.print(tres[i][j]+ " ");
                suma_filas += tres[i][j];
            }
            
            
            promedio = suma_filas / tres[0].length;
            System.out.print(" Suma: " +suma_filas+ " Promedio " + promedio);
            System.out.println("");
        }
    }
    
}
        
    }
    
}
