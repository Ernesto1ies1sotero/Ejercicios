package u2e31;

import java.util.Scanner;

public class RevientaCandado {

    public static void main(String[] args) {
        CandadoNumerico candado = new CandadoNumerico();
        Scanner sc = new Scanner(System.in);
        int cod;
        do {
            System.out.println("Introduce el numero secreto");
            cod = sc.nextInt();
        } while (cod < 0 || cod > 9999);

        candado.setNumSecreto(cod);
        int contador = 0;
        boolean intento = candado.intentaAbrir(contador);
        intento = false;

        while (!intento) {
            contador++;
            System.out.println("Se ha intendo abrir con " + contador);
            if (cod == contador) {
                intento = true;

            }

        }
        System.out.println("Acertaste la clave era " + contador);
    }

}
