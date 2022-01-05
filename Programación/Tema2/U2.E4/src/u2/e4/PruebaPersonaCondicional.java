package u2.e4;
import java.util.Scanner;
public class PruebaPersonaCondicional {
    public static void main(String[] args) {

        PersonaCondicional p = new PersonaCondicional();
        
        Scanner sc = new Scanner(System.in);

        p.setPeso(0);
       
        

        System.out.println("Introduce tu edad: ");
        //int edad = sc.nextInt();
        //p.setEdad(edad);
        p.setEdad(sc.nextInt());

        System.out.println("Introduce tu altura: ");
        p.setAltura(sc.nextInt());
        
        System.out.println("Dime si estas casado (true/false):");
        boolean casado = sc.nextBoolean();
        p.setEstaCasado(casado);

        if (p.getEdad() >= 18) {
            System.out.println("Ya eres un señor/a");
        }

        if (p.getAltura() >= 185) {
            System.out.println("Eres alto/a");

        }

        if (p.isEstaCasado() == false) {
            System.out.println("No está casado");
        }
    }

}
