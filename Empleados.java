package empleados;
import java.util.Scanner;
public class Empleados {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese n: ");
        int n = sc.nextInt(), i = 1;
        do{
            System.out.println("horas turno en la primera parte del dia ");
            int hm = sc.nextInt();
            System.out.println("horas turno tarde");
            int ht=sc.nextInt();
            System.out.println("jornal trabajador" +i+ "es=" +(hm*9+ht*12) );
            
        
            i++;
            
        }while(i <= n);            
    }
    
}
