package U2E19;

import java.util.Scanner;

public class PruebaValidaEntrada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayorCero;

        //Pedir al usuario el número 
        do {

            System.out.println("Dame un número mayor que cero");
            mayorCero = sc.nextInt();
            //comprobar si esta fuera de rango

            if (mayorCero <= 0) {
                System.out.println("El número que te he pedido es mayor que cero");
            }

        } while (mayorCero <= 0);

        //menorigualcero
        int menorIgualCero;
        do {
            System.out.println("Dame un número menor o igual que cero");
            menorIgualCero = sc.nextInt();

            if (menorIgualCero > 0) {
                System.out.println("El número que te he pedido tiene que ser menor o igual que cero");
            }
        } while (menorIgualCero > 0);

        //un número real al usuario que tiene que estar comprendido entre 1.3 y
        //19.8 ambos incluidos.
        double realRango;
        do {
            System.out.println("Introduce un número comprendido entre 1.3 y 19.8");
            realRango = sc.nextDouble();
            if (realRango < 1.3 || realRango > 19.8) {
                System.out.println("El nº que te he pedido esta comprendido 1.3 y 19.8");
            }
        } while (realRango < 1.3 || realRango > 19.8);
        //rango algo comprendiod entre los 2 se representa con ||
        //e le pide un carácter al usuario que tiene que sólo se considerará válido si es “S” o
        //  “N”. Se debe almacenar en una variable llamada siNo
        String siNo;
        sc.nextLine();//Limpia el bucle
        do {
            System.out.println("Introduce el caracter S o N");
            siNo = sc.nextLine();
            if (!(siNo.equals("S") || siNo.equals("N"))) {
                System.out.println("El carácter tiene que ser S o N");
            }
        } while (!(siNo.equals("S") || siNo.equals("N")));

        System.out.println("El numero mayor que cero es " + mayorCero);
        System.out.println(" El número menor o igual que cero es  " + menorIgualCero);
        System.out.println("El número comprendido entre 1.3 y 19. es " +realRango);
        System.out.println("El carácter es " + siNo);

    }

}
