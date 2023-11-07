package javaapplication46;
import java.util.Scanner;
public class JavaApplication46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el numero de puntos: ");
        int nroptos = sc.nextInt();
        double[][] puntos = new double[nroptos][2];
        System.out.print("Ingrese " +nroptos+ " puntos: ");
        for(int i = 0; i < nroptos; i++){
            puntos[i][0] = sc.nextDouble();
            puntos[i][1] = sc.nextDouble();
        }
        // p1 y p2 son los indices de los puntos del arreglo
        int p1 = 0, p2 = 1; //dos puntos iniciales
        double menorDistancia = distancia(puntos[p1][0], puntos[p1][1], puntos[p2][0], puntos[p2][1]);
        for(int i = 0; i < puntos.length; i++){
            for(int j= i + 1; j < puntos.length; j++){
                double distancia = distancia(puntos[i][0], puntos[i][1], puntos[j][0], puntos[j][1]);
                if(distancia < menorDistancia){
                    menorDistancia = distancia;
                    p1 = i;
                    p2 = j;
                }
            }
        }
        System.out.println("Los puntos más cercanos son: (" +
                puntos[p1][0]+ "," + puntos[p1][1]+ ") y (" +puntos[p2][0]+ ","+ puntos[p2][1]+")");
        
               
                
    }
    public static double distancia(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
    
}
