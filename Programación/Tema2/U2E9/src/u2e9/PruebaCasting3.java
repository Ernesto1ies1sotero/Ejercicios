
package u2e9;

import java.util.Scanner;


public class PruebaCasting3 {
    public static void main(String[] args) {
        PersonaCondicional p1 = new PersonaCondicional();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cual es tú edad?");
        p1.setEdad(sc.nextInt());
        
        System.out.println("¿Cual es tú altura?");
        p1.setAltura(sc.nextInt());
        
        p1.setEstaCasado(false);
        
        if(p1.getEdad()>=18&&p1.getEdad()<=30&&!p1.isEstaCasado()
                ||p1.getEdad()>30&&p1.getEdad()<40&&!p1.isEstaCasado()&&p1.getAltura()>190
                ||p1.getEdad()>=40||p1.isEstaCasado()) {
            System.out.println("Has conseguido el papel");
        
        }
        
    }
            
            
    
}
