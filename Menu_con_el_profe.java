package menu_con_el_profe;
import java.util.Scanner;
public class Menu_con_el_profe {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int operacion, salario = 0, numero_boletas = 0, mes_actual = 0; 
        String nombre = null, tipo = null;
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Noviembre", "Diciembre"};
        do{
            do{
            System.out.println("================");
            System.out.println("    OPCIONES    ");
            System.out.println("================");
            System.out.println(" [1] Opcion 1   ");
            System.out.println(" [2] Opcion 2   ");
            System.out.println(" [3] Opcion 3   ");
            System.out.println(" [4] Salida   ");
            System.out.println("================");
            System.out.print("Ingrese la opcion");
            operacion = sc.nextInt();
        }while(operacion != 1 && operacion != 2 && operacion != 3);
        switch(operacion){
            case 1:
                System.out.print("Ingrese su nombre: ");
                nombre = sc.nextLine();
                nombre = sc.nextLine();
                System.out.println("Ingrese el tipo: ");
                tipo = sc.nextLine();
                break;
            case 2:
                System.out.println("Ingrese su salario: ");
                salario = sc.nextInt();
                System.out.println("Ingrese numero de boletas");
                numero_boletas = sc.nextInt();
                System.out.println("Ingrese el numero de mes en que se encuentra");
                mes_actual = sc.nextInt();
                break;
            case 3:
                System.out.println("Empleado: " +nombre);
                System.out.println("Tipo" +tipo);
                for(int i = 0; i < mes_actual; i++){
                    System.out.print(meses[i]+" ");
                    System.out.print(salario+" ");
                    if(numero_boletas <= (i+1)) System.out.println(" Si");
                    else System.out.println(" No");
                }
                System.out.println("\nBoletas emitidas: " +numero_boletas);
                System.out.println("Boletas restantes " +(mes_actual - numero_boletas));
                break;
            case 4: System.exit(0);
        }
    }while(operacion != 4);

}
}