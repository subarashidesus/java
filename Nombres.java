package nombres;

import java.util.Scanner;

public class Nombres {
        private static final int FILAS = 3;
        private static final int COLUMNAS = 3;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[][] nombres = new String[FILAS][COLUMNAS];
            for(int i = 0; i < nombres.length; i++){
                for(int j = 0; j < nombres.length; j++){
                    System.out.print("Ingrese un nombre ("+(i+1)+","+(j+1)+")que empiece con A: ");
                    nombres[i][j] = sc.nextLine();
                }
            }
            for(int i = 0; i < nombres.length; i++){
                for(int j = 0; j < nombres[0].length; j++){
                    System.out.print(nombres[i][j] + "\t");
                }
                System.out.println();
            }
            int f, c;
            do{
                System.out.println("\nIngrese fila(1 a 3): ");
                f = sc.nextInt();
                if(f < 1 || f > 3) System.out.println("Fila no valida, trate de nuevo");
            }while(f<1 || f > 3);
            do{
                System.out.println("\n ingrese columna (1 a 3)");
            }
    }
    
}
