package segundo_problema;
import java.util.Scanner;
public class Segundo_problema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[10];
        int s= 0;
        double prom= 0.0;
        for(int i = 0; i < notas.length; i++){
            System.out.println("Ingresa nota: ");
            notas[i] = sc.nextInt();
            s += notas[i];
            prom = s / notas.length;
        }
        System.out.println("El promedio es: " +prom);
                
    }
    
}
