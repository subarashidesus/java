package arreglo;
public class Arreglo {
    public static void main(String[] args) {
        int[] vector = new int[10];
        int c=0;
        for(int i = 0; i < vector.length; i++){
            vector[i]=(int)(Math.random()*21+10);
            if(vector[i]%3 == 0&&vector[i]%5==0)c++;
            System.out.println(vector[i]+"");
        }
        System.out.println("\nhay"+c+"xxx");
    }
    
}
