package u2e38;

import java.util.Random;

public class NumTiradas {

    public static void main(String[] args) {
        Random rnd = new Random();

        final int NUM_TIRADAS = 50;
        int[] tirada = new int[NUM_TIRADAS];
        int[] frecuencia = new int[6];
       
        for (int i = 0; i < tirada.length; i++) {
            tirada[i] = rnd.nextInt(6) + 1;
        }

        for (int i = 0; i < tirada.length; i++) {

            switch (tirada[i]) {
                case 1:
                    frecuencia[0]++;
                    break;
                case 2:
                    frecuencia[1]++;
                    break;
                case 3:
                    frecuencia[2]++;
                    break;
                case 4:
                    frecuencia[3]++;
                    break;
                case 5:
                    frecuencia[4]++;
                    break;
                case 6:
                    frecuencia[5]++;
                    break;
            }

            /*
            if (listaTirada[i] == 6) {
                numVeces[5]++;

            } else if (listaTirada[i] == 5) {
                numVeces[4]++;

            } else if (listaTirada[i] == 4) {
                numVeces[3]++;

            } else if (listaTirada[i] == 3) {
                numVeces[2]++;

            } else if (listaTirada[i] == 2) {
                numVeces[1]++;

            } else {
                numVeces[0]++;

            }*/
        }

        System.out.println("Se ha analizado " + NUM_TIRADAS + " tiradas de un dado de 6 caras y se obtienen los\n"
                + "siguientes resultados:");

        System.out.println("\nEl número 6 ha aparecido " + frecuencia[5] + " veces");
        System.out.println("El número 5 ha aparecido " + frecuencia[4] + " veces");
        System.out.println("El número 4 ha aparecido " + frecuencia[3] + " veces");
        System.out.println("El número 3 ha aparecido " + frecuencia[2] + " veces");
        System.out.println("El número 2 ha aparecido " + frecuencia[1] + " veces");
        System.out.println("El número 1 ha aparecido " + frecuencia[0] + " veces");
        
        System.out.println("\nEl porcentage de 5 es de "+frecuencia[4]*100/tirada.length + "%");
        System.out.println("El porcentage de 1 es de "+frecuencia[0]*100/tirada.length + "%");
    }

}
