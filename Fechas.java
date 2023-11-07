package fechas;
import java.util.Date;
public class Fechas {
    public static void main(String[] args)
    {
        Date hoy = new Date();
        System.out.printf("La fecha de hoy --> %tD%n ", hoy);
        System.out.printf("La fecha de hoy --> %tT%n ", hoy);
    }
    
}
