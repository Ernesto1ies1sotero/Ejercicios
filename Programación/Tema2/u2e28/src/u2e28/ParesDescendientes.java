package u2e28;

import java.util.Scanner;

public class ParesDescendientes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número real entre 0 y 100");
        int num = sc.nextInt();

        while (num < 0 || num > 100) {
            System.out.println("Dime un número entre 0 y 100: ");
            System.out.println("");
            num = sc.nextInt();
        }
        if (num % 2 == 1) {
            num--;
        }
        while (num >= 0) {
            System.out.println("" + num);
            num -= 2;

        }

    }

}
