package xxx;
import java.util.Date;
public class Xxx {
    public static void main(String[] args) {
        Date hoy = new Date();
        
        double numero = 8.45978;
        int num = 422;
        
        System.out.printf("La fecha de hoy --> %tD%n ", hoy);
        System.out.printf("La hora exacta -->  %tT%n ", hoy);
        System.out.printf("Fecha y hora -> %tD - %tT%n ", hoy, hoy);
        
        System.out.println("\n\nHola mundo, me \'llamo\' Gustavo Amaro");
        System.out.println("Hola mundo, me \\llamo\\ Gustavo \t\t Amaro");
        System.out.println("Hola mundo, me llamo Gustavo Amaro");
        System.out.println("Hola mundo, me llamo \"Gustavo\" Amaro");
        
        System.out.printf("\n\nSolo dos decimales -> %.3f", numero);
        System.out.printf("\n\nConversion a entero octal -> %o%n", num);
        
    }
    
}
