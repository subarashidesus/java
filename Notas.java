package notas;
public class Notas {
    public static void main(String[] args) {
        double[][] matriz = new double[10][4];
        double acumg = 0.0;
        for(int i = 0; i < matriz.length; i++){
            double acum = 0;
            
            for(int j = 0; j < matriz[0].length - 1; j++){
                matriz[i][j] = (int)(Math.random()*21);
                acum += matriz[i][j];
                System.out.print(matriz[i][j]+"\t");
            }
            matriz[i][matriz[i].length-1] = acum/(matriz[i].length-1);
            acumg += matriz[i][matriz[i].length-1];
            System.out.print("| promedio alumno[" +i+ "] = " +matriz[i][matriz[i].length-1]);
            System.out.println();
        }
        double promg = acumg / matriz.length;
        int contmayprom = 0;
        for(int i = 0; i < matriz.length; i++){
            if(matriz[i][matriz[i].length-1] > promg) contmayprom++;
        }
        System.out.println("\nhay " +contmayprom+ " mayores al promedio: " +promg);
    }
    
}
