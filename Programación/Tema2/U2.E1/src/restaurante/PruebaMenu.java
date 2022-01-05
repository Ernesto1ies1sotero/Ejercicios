
package restaurante;

public class PruebaMenu {
    public static void main(String[] args) {
        Menu menu1 = new Menu();
        
        menu1.setPrimerPlato("Ensalada de la casa");
        menu1.setSegundoPlato("Solomillo al Whiskey");
        menu1.setCalorias(798);
        menu1.setPrecio(11.95);
        
        menu1.imprimeMenu();
    }
    
     
    
}
