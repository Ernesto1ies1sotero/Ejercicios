package u2e31;

import java.util.Scanner;

public class RevientaCandado {

    public static void main(String[] args) {
        CandadoNumerico candado = new CandadoNumerico();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número secreto entre 0 y 9999");
        int cod = sc.nextInt();
//esto mejor hacerlo con do while
        while (cod < 0 || cod > 9999) {
            System.out.println("Dime un número entre 0 y 9999: ");
            cod = sc.nextInt();

        }
        candado.setNumSecreto(cod);

        boolean candadoAbierto = false;
        int intento = 0;
        /*
        while (!candado.intentaAbrir(intento)){
            intento++;
        }
         */
        while (!candadoAbierto) {

            if (!candado.intentaAbrir(intento)) {
                System.out.println("Probando con el número " + intento + " no se abrio");
                intento++;

            } else {
                candadoAbierto = true;
            }
            System.out.println("Probadno con el número " + intento + " se abrio");
//mejor hcerlo en positivo, cambiando el if por if(candado.intentaAbrir(intento))
        }
    }

}
