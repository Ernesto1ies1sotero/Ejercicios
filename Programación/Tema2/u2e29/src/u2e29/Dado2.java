package u2e29;

import java.util.Random;
import java.util.Scanner;

public class Dado2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int numElegido;

        do {
            System.out.println("Elige un número");
            numElegido = sc.nextInt();

        } while (numElegido <= 0 || numElegido > 6);
       
        boolean coincide = false;

        while (!coincide) {
             int dado = rm.nextInt(7);
            System.out.println(dado);
            if (dado == numElegido) {
                coincide = true;
            }

        }
        System.out.println("Acertaste ");
    }

}
