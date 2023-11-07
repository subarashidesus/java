package sumatoria;

import java.util.Scanner;

public class Sumatoria {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        int a = sc.nextInt();
        System.out.println("Ingrese el valor de b");
        int b = sc.nextInt();
        double s= 0;
        System.out.println("Ingrese la cantidad de terminos");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            s += 1.0/ (a+i * b);
        }
        System.out.println("La suma es " +s);
                
    }
    
}
