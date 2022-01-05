
package u2e39;

import java.util.Random;

public class PruebaNumBaj {

    public static void main(String[] args) {

        Random rnd = new Random();

        int[] lista = new int[500];
        int min = 1000001;

        for (int i = 0; i < lista.length; i++) {
            lista[i] = rnd.nextInt(1000001);
            if (lista[i] < min) {
                min = lista[i];

            }

        }

        System.out.println("El numero mínimo es " + min);
    }

}
