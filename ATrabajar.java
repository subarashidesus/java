package a.trabajar;
public class ATrabajar {
    public static void main(String[] args) {
         int[] a={0,1,2,3,4,5,6,7,8,9};
        int[] b={6,7,8,9,10,11,12,13,14,15};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]) System.out.print(a[i]+ " ");
            }
        }
        System.out.println();  
    }
}
