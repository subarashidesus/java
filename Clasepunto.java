package clasepunto;
public class Clasepunto {
    public static void main(String[] args) {
        Punto p0 = new Punto();
        // se le pone a la apsisa un punto 
        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(-1.34,489.55);
        System.out.println("p0 se intersecta "
         + " con p2? = " + p0.intesecta(p2) );
        System.out.println("p0 se intersecta"
                + " con p1 = " + p1.intesecta(p1));
        
        /* cero es igual a 
        /* lo que hace es que al 0 lo mueve al campo y 
        por eso que el punto tiene accsisa y ordenada
        puedo comparar si se intersectan o ono
        */
    }
    
}
