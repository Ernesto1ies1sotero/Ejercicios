package U2E16;

import java.util.Scanner;

public class PruebaMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número");
        double a = sc.nextDouble();

        System.out.println("MENU DE POTENCIAS");
        System.out.println("1 – Calcular el cuadrado");
        System.out.println("2 – Calcular el cubo");
        System.out.println("3 – Calcular la raíz cuadrada");
        System.out.println("Escoja una opción:");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El resultado es " + Math.pow(a, 2));
                break;
            case 2:
                System.out.println("El resultado es " + Math.pow(a, 3));
                break;
            case 3:
                System.out.println("El resultado es " + Math.sqrt(a));
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
                

        }
    }

}
