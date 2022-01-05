
package u2e12;


public class PruebaBombillaCondicional {
    public static void main(String[] args) {
          BombillaCondicional bombi = new BombillaCondicional();
          
          bombi.setMarca("Philips");
          bombi.imprimeMarca();
          bombi.setPotencia(100);
          bombi.imprimePotencia();
          bombi.setNumVecesEncendida(0);
          bombi.imprimeEstado();
          bombi.encender();
          bombi.apagada();
          bombi.apagada();
          bombi.encender();
          bombi.encender();
          bombi.apagada();
          bombi.imprimeEstado();
          System.out.println("La bombilla se ha encendido " +bombi.getNumVecesEncendida()
          + " veces.");
              
        
    }
  
    
    
}
