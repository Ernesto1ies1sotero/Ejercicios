package u2e31;

import java.util.Scanner;

public class RevientaCandadoR {

    public static void main(String[] args) {
        CandadoNumerico candado = new CandadoNumerico();
        Scanner sc = new Scanner(System.in);

        
        int cod = (int)(Math.random()*10000);
        System.out.println("Se ha generado un número secreto");
        //se puede usar la clase Random
        //Random r =new Random();
        
       
        candado.setNumSecreto(cod);

        boolean candadoAbierto = false;
        int intento = 0;

        while (!candadoAbierto) {

            if (!candado.intentaAbrir(intento)) {
                System.out.println("Probando con el número " + intento + " no se abrio");
                intento++;
                
            } else {
                candadoAbierto = true;
                System.out.println("Probadno con el número " + intento + " se abrio");
                
            }
        }

    }

}
