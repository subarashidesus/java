package compuesto;
import java.util.Scanner;
public class Compuesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese un numero natural ");
        int numero= sc.nextInt();
        boolean esPrimo = true;
        for(int i = 2; i < numero; i++){
            if(numero%i==0){
                esPrimo = false;
                break;
                        
            }
        }
        if(!esPrimo) System.out.println(numero+" es compuesto");
        else System.out.println("No es compuesto, es primo");
    }
    
}
