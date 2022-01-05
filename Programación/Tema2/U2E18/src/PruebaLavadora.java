
import java.util.Scanner;

public class PruebaLavadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿En qué número quieres poner la lavadora?");
        System.out.println("1 – Prelavado");
        System.out.println("2 – Lavado");
        System.out.println("3 – Centrifugado");
        System.out.println("4 – Fin");
        System.out.println("5 – Prelavado");
        System.out.println("6 – Lavado en caliente");
        System.out.println("7 – Centrifugado 1");
        System.out.println("8 – Lavado en frío");
        System.out.println("9 – Suavizante");
        System.out.println("10 - Centrifugado 2");
        System.out.println("11 – Secado");
        System.out.println("12 – Fin");
        System.out.println("Seleccione una opción");
        int ciclo = sc.nextInt();

        switch (ciclo) {
            case 1:
                System.out.println("1 – Prelavado");
            case 2:
                System.out.println("2 – Lavado");
            case 3:
                System.out.println("3 – Centrifugado");
            case 4:
                System.out.println("4 – Fin");
                break;
            case 5:
                System.out.println("5 – Prelavado");
            case 6:
                System.out.println("6 – Lavado en caliente");
            case 7:
                System.out.println("7 – Centrifugado 1");
            case 8:
                System.out.println("8 – Lavado en frío");
            case 9:
                System.out.println("9 – Suavizante");
            case 10:
                System.out.println("10 - Centrifugado 2");
            case 11:
                System.out.println("11 – Secado");
            case 12:
                System.out.println("12 – Fin");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }

    }

}
