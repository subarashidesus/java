package nuevo;
public class Nuevo {
    public static void main(String[] args) {
        int[][] m= new int[15][12];
        int[] asumsueldo=new int[15];
        int[] asummes=new int[12];
        int totaltotal=0;
        for(int i=0;i<m.length;i++){
            int acumf=0;
            for(int j=0;j<m[i].length;j++){
                m[i][j]=(int)(Math.random()*2+1);
                acumf+=m[i][j];
                asumsueldo[i]=acumf;
                System.out.print(m[i][j]+"\t");
            }
            totaltotal+=asumsueldo[i];
            System.out.print("| "+asumsueldo[i]);
            System.out.printf(" | %6.2f \n",asumsueldo[i]/12.0);
        }
System.out.println("--------------------------------------------------------------------------------------------");
        for(int j=0;j<m[0].length;j++){
            int acumes=0,i;
             for( i=0;i<m.length;i++){
                 acumes+=m[i][j];
                 asummes[j]=acumes;
             }
            System.out.print(asummes[j]+"\t");
        }
        System.out.println();
         for(int j=0;j<m[0].length;j++){
             System.out.printf("%4.2f\t",asummes[j]/15.0);
         }
         System.out.println();
         System.out.println("el total total pagado anual es "+totaltotal);
    }
}

/* System.out.println("--------------------------------------";
   for(int j = 0; j < length; j ++){
  System.out.print( " | % 6.2f "
*/