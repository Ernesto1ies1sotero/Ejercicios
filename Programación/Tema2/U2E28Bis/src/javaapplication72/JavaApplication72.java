package javaapplication72;

import java.util.Scanner;

public class JavaApplication72 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int contador = 0;
//        
//        while(contador<100){
//            contador++;
//            if(contador%2==1){
//                System.out.println(contador);
//            }
//            
//        }
//        System.out.println("----------");
        int num = 0;
        do {
            System.out.println("Dame un número del 1 a 100");
            num = sc.nextInt();
            if (num < 0 || num > 100) {
                System.out.println("Te he dicho del 0 al 100");
            }
        } while (num < 0 || num > 100);

//            if (num % 2 == 1) {
//                num = num - 1;
//                while (num > 0) {
//                    num = num - 2;
//                    System.out.println(num);
//                }
//            }
//      for (int i=0;i<=100;i +=2){
//          System.out.println(i);
//      }  
        while (num > 0) {
            num--;
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

}
