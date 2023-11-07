package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        int n1, n2,suma,resta,multiplicacion,division,mod;
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese el primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Ingresar el segundo numero: ");
        n2 = sc.nextInt();
        
        suma = n1 + n2;
        resta = n1 - n2;
        multiplicacion = n1 * n2;
        division = n1 / n2;
        mod = n1 % n2;
        
        System.out.println("La suma es: " +suma);
        System.out.println("La resta es: " +resta);
        System.out.println("La multiplicacion es: " +multiplicacion);
        System.out.println("La division es: " +division);
        System.out.println("El modulo es: " +mod);
    }
    
}
