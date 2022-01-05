
public class PruebabombillaCondicional2 {
    public static void main(String[] args) {
        BombillaCondicional2 bc = new BombillaCondicional2();
        
        bc.setMarca("Philips");
        bc.setPotencia(100);
        bc.imprimeEstado();
        bc.encender();//1
        bc.apagar();
        bc.encender();//2
        bc.apagar();
        bc.encender();//3
        bc.apagar();
        bc.encender();//4
        bc.apagar();
        bc.encender();//5
        bc.apagar();
        bc.encender();//6
        bc.apagar();
        bc.encender();//7
        bc.apagar();
        bc.encender();//8
        bc.apagar();
        bc.encender();//9
        bc.apagar();
        bc.encender();//10
        bc.encender();//11
        
        
        System.out.println("Números de veces encedida "+bc.getNumVecesEncendida());
        bc.imprimeEstado();
        
    }
    
}
