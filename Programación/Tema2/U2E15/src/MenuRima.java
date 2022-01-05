
import java.util.Scanner;

public class MenuRima {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número del 1 al 5");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Que no pare ninguno");
                break;
            case 2:
                System.out.println("Estoy como dios");
                break;
            case 3:
                System.out.println("Dile hola al inglés");
                break;
            case 4:
                System.out.println("Nos vamos al teatro");
                break;
            case 5:
                System.out.println("Programo con ahinco");
                break;
            default:
                System.out.println("Te he dicho un número del 1 al 5");
                break;
        }

    }

}
