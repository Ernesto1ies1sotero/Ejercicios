package u2e14;

import java.util.Scanner;

public class PruebaEdades {

    public static void main(String[] args) {
        Persona p = new Persona();
        Scanner sc = new Scanner(System.in);
        p.setNombre("Pedro");

        int edad = p.getEdad();
        do {

            System.out.println("Dime una edad");
            edad = sc.nextInt();
        } while (edad < 0);

        if (edad >= 0 && edad <= 3) {
            System.out.println("Es un bébe");
        } else if (edad <= 12) {
            System.out.println("Es un niño");
        } else if (edad <= 20) {
            System.out.println("Es un adolescente");
        } else {
            System.out.println("Es un adulto");
        }
    }

}
