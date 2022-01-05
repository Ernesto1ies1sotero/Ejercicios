
package PruebaTablaMulti9_2;

import java.util.Scanner;


public class PruebaTablaMulti {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int n =sc.nextInt();
        int contador=0;
        while(contador<=10){
        
            System.out.println(contador+" x"+n +"= "+contador*n);
            contador++;
        
        }
        
    }
    
}
