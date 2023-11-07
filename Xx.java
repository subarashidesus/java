package xx;
public class Xx {
    public static void main(String[] args) {
        /* arreglo lineal (vector) - inicializado */
        
        int [] numeros = { 2, 4, 6, 8, 10};
        // Visualizar los elementos del arreglo
        for(int x = 0; x < numeros.length; x++ ){
            System.out.println(numeros[x]);
        }
        
        System.out.println();
        String[] paises = {"Peru","Ecuador","Colombia","Bolivia","Brasil"};
        for(int z= 0; z < paises.length; z++){
            System.out.println(paises[z]);
        }// for(int y = 0; y < sueldos.length; y++){
        
           System.out.println("");
           double[] sueldos = {1200.0, 1500.5, 2500.5, 4500.25};
           for(int y = 0; y < sueldos.length; y++){
               System.out.println(sueldos[y]);
           }
           System.out.println();
           boolean[] estados = {true, false, false, true, true};
           int m= 0;
           while(m < estados.length){
               System.out.println(estados[m]);
               m++;
           }
               
    }
    
}
