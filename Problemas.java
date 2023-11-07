package problemas;
import java.util.Scanner;
public class Problemas {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        boolean esPrimo = true;
        for(int i = 2; i < n ; i++ ){
            if(n%i==0){
                esPrimo=false;
                break;
            }
        }
        if(esPrimo) System.out.println(n+" Si es primo");
        else System.out.println(n+" No es primo");
    }
    
}
