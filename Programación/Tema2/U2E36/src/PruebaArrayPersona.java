
public class PruebaArrayPersona {

    public static void main(String[] args) {
        Persona[] familia = new Persona[4];
        
        /*También se puede hacer con variables intermedias
        Persona padre = new Persona(); 
        padre.setRol("Padre");
        padre.setEdad(43);
        familia[0] = padre;
        */
        familia[0] = new Persona();
        familia[0].setRol("Padre");
        familia[0].setEdad(43);
        

        familia[1] = new Persona();
        familia[1].setRol("Madre");
        familia[1].setEdad(40);

        familia[2] = new Persona();
        familia[2].setRol("Hijo");
        familia[2].setEdad(24);

        familia[3] = new Persona();
        familia[3].setRol("Hija");
        familia[3].setEdad(14);
        
        for(int i = 0; i<familia.length;i++){
            System.out.println("La posición "+ i +" la ocupa el/la "+ familia[i].getRol()+
                        " coun una edad de " + familia[i].getEdad());
        }

       /* System.out.println("La posición 0 la ocupa el " + familia[0].getRol() + " con una edad de " + familia[0].getEdad());
        System.out.println("La posición 1 la ocupa la " + familia[1].getRol() + " con una edad de " + familia[1].getEdad());
        System.out.println("La posición 2 la ocupa el " + familia[2].getRol() + " con una edad de " + familia[2].getEdad());
        System.out.println("La posición 3 la ocupa la " + familia[3].getRol() + " con una edad de " + familia[3].getEdad());
        
        familia[2]= null;
        System.out.println("\nLa posición 0 la ocupa el " + familia[0].getRol() + " con una edad de " + familia[0].getEdad());
        System.out.println("La posición 1 la ocupa la " + familia[1].getRol() + " con una edad de " + familia[1].getEdad());
        System.out.println("La posición 3 la ocupa la " + familia[3].getRol() + " con una edad de " + familia[3].getEdad());
        //si hago un System.out.println("La posición 2 la ocupa el " + familia[2].getRol() + " con una edad de " + familia[2].getEdad());
        //me apercera un null.exception ya que la posción 2 está vacia.
        System.out.println("\n");*/
        
        System.out.println("\n"+familia.length);
        
        for (int i = 0; i<familia.length; i++){
            Persona p = familia[i];
            if(p!=null) {
                System.out.println("La posición "+ i +" la ocupa el/la "+ p.getRol()+
                        " coun una edad de " + p.getEdad());
            }
        }
        
        familia[2]= new Persona();
        
        familia[2].setEdad(80);
        familia[2].setRol("Abuelo");
        
       
        /*System.out.println("\nLa posición 0 la ocupa el " + familia[0].getRol() + " con una edad de " + familia[0].getEdad());
        System.out.println("La posición 1 la ocupa la " + familia[1].getRol() + " con una edad de " + familia[1].getEdad());
        System.out.println("La posición 2 la ocupa el " + familia[2].getRol() + " con una edad de " + familia[2].getEdad());
        System.out.println("La posición 3 la ocupa la " + familia[3].getRol() + " con una edad de " + familia[3].getEdad());*/
    
    System.out.println("\n");
        
        for (int i = 0; i<familia.length; i++){
            Persona p = familia[i];
            if(p!=null) {
                System.out.println("La posición "+ i +" la ocupa el/la "+ p.getRol()+
                        " coun una edad de " + p.getEdad());
            }
        }
    
    }    

}
