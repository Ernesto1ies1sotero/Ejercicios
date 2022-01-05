package u2e30;

import java.util.Scanner;

public class PruebaDado2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dado2 d6 = new Dado2();

        
        int contadorSeis = 0;
        

        
        while (contadorSeis < 3) {

            int tirada = d6.tirada();
            System.out.println(tirada);
            if (tirada == 6) {
                contadorSeis++;

            }

        }
        System.out.println("Has sacado tres seis");
    }
}
