
package restaurante;

/**
 * 
 * @author Ernesto
 * version 1.0
 */
public class Menu {

    /**
     * cadena que representa el primer plato del menú
     */
    public String primerPlato;
    
    /**
     * cadena que representa el segundo plato del menú
     */
    
    public String segundoPlato;
    /**
     * Es un entero que representa el Kval del menú
     */
    
    public int calorias;
    /**
     * Es un entero que representa el precio del menú
     */
    
    public double precio;
    /**
     * Devolvemos la propeidad del primer plato
     * @return retornmaos las propiedad del primer plato
     */
    public String getPrimerPlato() {
        return primerPlato;
    }
    /**
     * Permite cambiar el primer plato
     * @param primerPlato Representa el valor de la propiead
     */
    public void setPrimerPlato(String primerPlato) {
        this.primerPlato = primerPlato;
    }
    /**
     * Devolvemos la propeidad del segundo plato
     * @return retornmaos las propiedad del segundo plato
     */
    public String getSegundoPlato() {
        return segundoPlato;
    }
//this indica que es la propiedad
    /**
     * Permite cambiar el segundo plato
     * @param segundoPlato Representa el valor de la propiead
     */
    public void setSegundoPlato(String segundoPlato) {
        this.segundoPlato = segundoPlato;
    }
    /**
     * Permitecambiar la propeidad de calorias
     * @return retornmaos las propiedad de calorias
     */
    public int getCalorias() {
        return calorias;
    }
    /**
     * Devolvemos la propeidad de precio
     * @param calorias cambia el numero de calorias
     */
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    /**
     * Devolvemos la propeidad de precio
     * @return retornmaos las propiedad de precio
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Permitecambiar la propeidad de precio
     * @param precio cambia el valor del precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void imprimeMenu(){
        System.out.printf("%-22s%22s%n","PRIMER PLATO","SEGUNDO PLATO");
        System.out.printf("%-22s%22s%n",primerPlato,segundoPlato);
        System.out.println("----------------------------------------------");
        System.out.printf("%-22s%22s%n","CALORÍAS","PRECIO");
        System.out.printf("%-22s%22s%n",calorias,precio + "€");
    }
    
   
    
    
}
