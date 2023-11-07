package matrices;
public class Matrices {
    public static void main(String[] args) {
        int[][] m = new int[15][12];
        int[] asumsueldo = new int[15];
        for(int i = 0; i < m.length; i++){
            int acumf = 0;
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = (int)(Math.random()*7001+2000);
                acumf += m[i][j];
                asumsueldo[i] = acumf;
                System.out.print(m[i][j]+"\t");
            }
            System.out.println("| " +asumsueldo[i]);
        }
    }
    
}
    