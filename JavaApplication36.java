package javaapplication36;
public class JavaApplication36 {
    public static void main(String[] args) {
        char[][] respuestas = {
            {'A','B','C','C','D'},
            {'F','B','C','C','D'},
            {'C','O','C','C','D'},
            {'E','F','A','C','D'},
            {'E','B','D','E','G'},
            {'G','U','C','C','D'},
            {'A','B','C','C','D'}  };
        char[] claves = {'A','B','C','C','D'};
        for(int i = 0; i < respuestas.length; i++){
            int correctas = 0;
            for(int j= 0; j < respuestas[i].length; j++){
                if(respuestas[i][j] == claves[j])
                    correctas++;
                }
            System.out.println("Estudiante " +i+ " tiene " +correctas+ " bien respondidas");
            }
        }
        }
    
}
