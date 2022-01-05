
import java.util.Scanner;

public class PruebaCalculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer número: ");
        int a = sc.nextInt();
        System.out.println("Dime el segundo número: ");
        int b = sc.nextInt();
        System.out.println("Dime el operador a aplicar:");

        sc.nextLine();
        String operador = sc.nextLine();
//otra opción es crear dos objetos scanner
        switch (operador) {
            case "+":
                System.out.println("El resulatado de " + a + " + " + b + " es " + (a + b));
                break;
            case "-":
                System.out.println("El resulatado de " + a + " - " + b + " es " + (a - b));
                break;
            case "*":
                System.out.println("El resulatado de " + a + " * " + b + " es " + (a * b));
                break;
            case "/":
                System.out.println("El resulatado de " + a + " / " + b + " es " + (a / b));
                break;
            default:
                System.out.println("Operación no válida");
                break;

        }

    }

}
