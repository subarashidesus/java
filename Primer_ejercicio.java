package primer_ejercicio;

import java.util.Scanner;

public class Primer_ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int promedio = 0;
        int total = 0;
        int[][] sueldos = new int [3][4];
        
        
        for(int f = 0; f < sueldos.length; f++){
            for(int c = 0; c < sueldos[0].length; c++){
                System.out.print("Ingrese el sueldo del trabajador: ");
                sueldos[f][c] = sc.nextInt();
                if(sueldos.length > 1000 && sueldos.length > 1000)
                total += sueldos[f][c];
                promedio = total / 12;
            }  
        }
        System.out.println("");
        System.out.println("\nTodos los sueldos de los empleados");
        for(int f = 0; f < sueldos.length; f++){
            for(int c = 0; c < sueldos[0].length; c++){
                System.out.print(sueldos[f][c]+ " - ");
            }
            System.out.println("");
            
        }
        System.out.println("");
        System.out.println("\nEl total de los sueldos es: " +total);
        System.out.println("El promedio de sueldos es: " +promedio);
    }
    
}

    
