
package u2e40;


public class PruebaTraduccion {
    public static void main(String[] args) {
        Traduccion [] diccionario = new Traduccion[5];
        
        
        for (int i=0;i<diccionario.length;i++){
            diccionario[i]=new Traduccion();
        }
        //Sin el for
        
        //diccionario[0]=new Traduccion();
        diccionario[0].setEnglish("To break down");
        diccionario[0].setSpanish("Averiar");
        
        //diccionario[1]=new Traduccion();
        diccionario[1].setEnglish("To fix");
        diccionario[1].setSpanish("Arreglar");
        
        //diccionario[2]=new Traduccion();
        diccionario[2].setEnglish("To reboot");
        diccionario[2].setSpanish("Reiniciar");
        
        //diccionario[3]=new Traduccion();
        diccionario[3].setEnglish("To work");
        diccionario[3].setSpanish("Trabajar");
        
        //diccionario[4]=new Traduccion();
        diccionario[4].setEnglish("To type");
        diccionario[4].setSpanish("Teclear");
        
        int i =0;
        
        for(Traduccion elem: diccionario){
            System.out.println(elem.getEnglish()+" en español se traduce por " + 
                    elem.getSpanish());
        
        }
        
        
        
    }
    
}
