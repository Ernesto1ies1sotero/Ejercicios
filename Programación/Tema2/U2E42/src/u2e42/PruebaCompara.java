/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2e42;

/**
 *
 * @author Ernesto
 */
public class PruebaCompara {
    public static void main(String[] args) {
        Compara comp = new Compara();
        
        comp.setCadena1("Ana");
        comp.setCadena2("Anacleto");
        System.out.println("Son iguales? "+comp.sonIguales());
        
        comp.setCadena1("Pedro");
        comp.setCadena2("pedro");
        System.out.println("Son iguales? "+comp.sonIguales());
        
        comp.setCadena1("Ana");
        comp.setCadena2("Ana");
         System.out.println("Son iguales? "+comp.sonIguales());
    }
    
}
