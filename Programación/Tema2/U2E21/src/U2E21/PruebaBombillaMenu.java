package U2E21;

import java.util.Scanner;

public class PruebaBombillaMenu {

    public static void main(String[] args) {
        BombillaCondicional bombi = new BombillaCondicional();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU DE OPCIONES:");
            System.out.println("0 - SALIR");
            System.out.println("1 - Enciende");
            System.out.println("2 – Apaga");
            System.out.println("3 – Imprime estado");
            System.out.println("4 – Crea una nueva bombilla");
            System.out.println("Escoge una opción:");
            opcion = sc.nextInt();

            switch (opcion) {

                case 0:
                    System.out.println("SALIR");
                    break;
                case 1:
                    bombi.encender();
                    break;
                case 2:
                    bombi.apagar();
                    break;
                case 3:
                    bombi.imprimeEstado();
                    break;
                case 4:
                    bombi = new BombillaCondicional();
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;

            }
        } while (opcion != 0);
    }

}
