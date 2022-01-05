package u2e39;

import java.util.Random;

public class PruebaNumAl {

    public static void main(String[] args) {

        Random rnd = new Random();

        int[] lista = new int[500];
        int max = -1;
        
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rnd.nextInt(1000001);
        }

        for (int i = 0; i < lista.length; i++) {
                if (lista[i] > max) {
                max = lista[i];

            }

        }

        System.out.println("El numero máximo es " + max);
    }

}
