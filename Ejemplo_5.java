package ejemplo_5;
import java.util.Scanner;
public class Ejemplo_5 {
    public static void main(String[] args) {
        /*Ejercicio 1: Crear un vector donde se almacena 5 notas ingresadas
        por teclado, pide calcular su promedio*/
        int [] notas = new int[5];
        int i = 0;
        double promedio ;
        //Ingresar por telcaod 
        Scanner sc= new Scanner(System.in);
        for(i = 0; i < notas.length; i++){
            System.out.println("Ingrese las notas: ");
            notas[i] = sc.nextInt();
            
        }
        System.out.println("Todos los elementos del vector");
        for(int j= 0; j < notas.length; j++){
            System.out.println("[" +j+ "]" +"="+ notas[j]);
        }
        
        








//s = + s
    }
    
}
