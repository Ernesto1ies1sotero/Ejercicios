
import java.util.Scanner;

public class PruebaBombilla2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BombillaCondicional2 b = new BombillaCondicional2();

        int opciones;
        do {
            System.out.println("MENÚ DE OPCIONES");
            System.out.println("0 - SALIR");
            System.out.println("1 - Enciende");
            System.out.println("2 – Apaga");
            System.out.println("3 – Imprime estado");
            System.out.println("4 – Crea una nueva bombilla");
            System.out.println("Escoge una opción:");
            opciones = sc.nextInt();

            switch (opciones) {
                case 0:
                    System.out.println("Salir");
                    break;
                case 1:
                    b.encender();
                    break;
                case 2:
                    b.apagar();
                    break;
                case 3:
                    b.imprimeEstado();
                    break;
                case 4:
                    b = new BombillaCondicional2();
                    System.out.println("Nueva bombilla");
                    break;
                default:
                    System.out.println("Elige la opción correcta");
                    break;

            }

        } while (opciones != 0);

    }

}
