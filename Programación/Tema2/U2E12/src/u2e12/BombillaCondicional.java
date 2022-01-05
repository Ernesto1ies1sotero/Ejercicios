
package u2e12;

public class BombillaCondicional {
    
    public String marca;
    public int potencia,numVecesEncendida;
    public boolean encendida;

   

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void imprimeMarca(){
        System.out.println("Su marca es de "+marca);
    }

   

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public void imprimePotencia(){
        System.out.println("Su potencia es de "+potencia);
    }
    
    public void encender(){
        if(encendida){
            System.out.println("La bombilla ya estaba encendida");
        }else {
        
            encendida = true;
            numVecesEncendida++;
        }
    }
    
    public void apagada(){
        if(encendida){
            encendida = false;
        }else{ 
            System.out.println("La bombilla ya estaba apagada");
       
                   
        }
    }
    public void setNumVecesEncendida(int numVecesEncendida) {
        this.numVecesEncendida = numVecesEncendida;
    }
    
    public int getNumVecesEncendida() {
        return numVecesEncendida;
    }
    
   
    public void imprimeEstado(){
        System.out.println("La bombilla esta encendida " +encendida);
    }
    
    
}
