
package u2e7;

import java.util.Scanner;


public class PruebaCasting {
    public static void main(String[] args) {
        PersonaCondicional p1 = new PersonaCondicional();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cual es tú edad?");
        p1.setEdad(sc.nextInt());
        
        System.out.println("¿Cual es tú altura?");
        p1.setAltura(sc.nextInt());
        
        p1.setEstaCasado(false);
        //p1.isEstaCasado()==false
        //seescribe más !p1.isEstaCasado()
        if(p1.getEdad()>=18&&p1.getEdad()<=30
                &&p1.isEstaCasado()==false&&p1.getAltura()>175) {
            System.out.println("Has conseguido el papel");
        }
    }
            
            
    
}
