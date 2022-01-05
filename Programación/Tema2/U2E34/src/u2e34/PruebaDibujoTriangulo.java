package u2e34;

import java.util.Scanner;

public class PruebaDibujoTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col,tam,fila;
        
        do {
            System.out.println("Dime el tamaño del triángulo (5-30):");
            tam = sc.nextInt();
            if(tam < 5 || tam > 30){
                System.out.println("Es de 5 a 30");
            }
        } while (tam < 5 || tam > 30);
       
//col dibuja los asterícos
        for (fila = 1; fila <= tam; fila++) {
            for (col = 1; col <= fila; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

}
