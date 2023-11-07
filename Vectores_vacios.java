package vectores_vacios;

import java.util.Scanner;

public class Vectores_vacios {
    public static void main(String[] args) {
        /* arreglo lineal o vector - vacio*/
        int[] numeros = new int[4];
        int i = 0;
        int s= 0;
        //Ingresar por teclado por teclado 
        Scanner sc= new Scanner(System.in);
        for(i = 0; i < numeros.length; i++){
            System.out.println("Ingrese elementos al vector: ");
            numeros[i] = sc.nextInt();
            s += numeros[i];
            
            }
        System.out.println("La suma de los elementos: " +s);
        
        // Impresion de los elementos del vector
        System.out.println("Todos los elementos del vector");
        for(int j= 0;j < numeros.length; j++){
            System.out.println("[" +j+ "]" +"="+ numeros[j]);
        }
                
    }
    
}
