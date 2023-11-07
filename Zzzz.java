package zzzz;
public class Zzzz {
    public static void main(String[] args) {
        char[][] respuestas = {
        {'A','B','C','C','D','E','E','A','D'},
        {'A','B','C','C','D','E','E','A','D'},
        {'E','B','C','C','D','E','E','A','D'},
        {'E','B','C','C','D','E','E','A','D'},
        {'B','B','C','C','D','E','E','A','D'},
        {'S','B','C','C','D','E','E','A','D'},
        {'A','B','C','C','D','E','E','A','D'},
        {'A','B','C','C','D','E','E','A','D'}   };
        char[]claves = {'A','B','A','C','C','D','E','E','A','D'};
        for(int i = 0; i < respuestas.length; i++){
            int correctas = 0;
            for(int j = 0; j < respuestas[i].length; j++){
                if(respuestas[i][j] == claves[j])
                correctas ++;
            }
            System.out.println("Estudiante " +i+ " tiene " +correctas+ " bien respondidas");
        }
    }
    
    }
    

