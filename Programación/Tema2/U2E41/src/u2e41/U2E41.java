package u2e41;

import java.util.Random;
import java.util.Scanner;

public class U2E41 {

    public static void main(String[] args) {
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);

        int[] numEnteros = new int[2000];

        int pos = -1;

        for (int i = 0; i < numEnteros.length; i++) {
            numEnteros[i] = rm.nextInt(1001);
        }
        System.out.println("¿Que numero quieres buscar?");
        int numBusca = sc.nextInt();
//Algoritmo de busqueda

        for (int i = 0; i < numEnteros.length; i++) {
            if (numBusca == numEnteros[i]) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Número no encontrado");
        } else {
            System.out.println("La posición del numero " + numEnteros[pos] + "  es la " + pos);
        }

    }
}
