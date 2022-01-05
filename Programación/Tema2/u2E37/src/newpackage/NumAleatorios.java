package newpackage;

import java.util.Random;

public class NumAleatorios {

    public static void main(String[] args) {

        Random rnd = new Random();

        int[] numAleatorio = new int[500];
//El primer for recoge 500 numeros aleatorios entre 0 y 1000, sería la primera parte del ejercicio
        for (int i = 0; i < numAleatorio.length; i++) {
            numAleatorio[i] = rnd.nextInt(1001);
        }
        //Toma estos números aleatorios y recoge los mayores de 800
        
        for (int i = 0; i < numAleatorio.length; i++) {
            if (numAleatorio[i] % 2 == 0 && numAleatorio[i] >= 800) {
                System.out.println(numAleatorio[i]);
            }
        }
    }

}
