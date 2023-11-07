package boletas;
import java.util.Scanner;
public class Boletas {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int op;
        do{
            System.out.println("-------MENU PRINCIPAL-----");
            System.out.println("1 DATOS EMPLEADO");
            System.out.println("2 SALARIO Y BOLETAS");
            System.out.println("3 impimir reporte");
            System.out.print("ingrese opcion(1--2--3");
            op = sc.nextInt();
            if (op != 1 && op != 2 && op != 3)
                System.out.println("OPCION errada, trate de nuevo");
        }while(op != 1 && op != 2 && op != 3);
        if(op == 1) 
    }
    
}
