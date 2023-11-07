package javaapplication11;
public class JavaApplication11 {
    public static void main(String[] args) {
         int[] cagua=new int[30];
        int may=10,men=120,suma=0,cmayprom=0;
        for(int i=0;i<cagua.length;i++){
            cagua[i]=(int)(Math.random()*111+10);
            System.out.print( cagua[i]+" ");
            if(cagua[i]>may) may=cagua[i];
            if(cagua[i]<men) men=cagua[i];
            suma+=cagua[i];
        }
double prom=suma*1.0/cagua.length;
        int indmen=0,indmay=0;
        System.out.println("\nDIAS DE MAYOR LLUVIA");
        for(int i=0;i<cagua.length;i++) {
            if(cagua[i]==may) System.out.print((i+1)+" ");
            if(cagua[i]>prom) cmayprom++;
        }
        System.out.println("\nDIAS DE MENOR LLUVIA");
        for(int i=0;i<cagua.length;i++) 
            if(cagua[i]==men) System.out.print((i+1)+" ");
        System.out.println("\nmayor lluvia (mm)= "+may);
         System.out.println("menor lluvia (mm)= "+men);
         System.out.println("promedio lluvia(mm)= "+prom);
         System.out.println("nro dias lluvia > promedio= "+cmayprom);
    }
}
