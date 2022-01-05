package u2e29;

import java.util.Scanner;

public class PruebaDado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dado d6 = new Dado();

        System.out.println("¿Qué números deseas que salga en la tirada");
        int num = sc.nextInt();

        while (num < 1 || num > 6) {
            System.out.println("Dime un número entre 1 y 6: ");
            num = sc.nextInt();

        }

        boolean coincide = false;
        while (!coincide) {
            
            int dado = d6.tirada();
            System.out.println( dado);
            if (dado == num) {
                coincide = true;
            }
            

        }
        System.out.println("Tu numero coincide");
    }
}
/*Opcion 2
numTirada = dado.tirada();
while(numTirada!=numDeseado){
    System.out.println("Ha salido el número "+numTirada);
}
System.out.println("Salio en númoro deseado "+numTirada);
*/

/*OPCION 2 --> es  la mía
boolean coincide = falase;

*/