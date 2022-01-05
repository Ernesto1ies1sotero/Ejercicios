package u2e31;

public class Random {

    public static void main(String[] args) {

        CandadoNumerico candado = new CandadoNumerico();
        int cod = (int) (Math.random() * 10000);

        System.out.println("Se ha generado un numero secreto");
        
        candado.setNumSecreto(cod);
        int contador = 0;
        boolean intento = candado.intentaAbrir(contador);
        intento = false;

        while (!intento) {
            contador++;
            System.out.println("Se ha intendo abrir con " + contador);
            if (cod == contador) {
                intento = true;

            }

        }
        System.out.println("Acertaste la clave era " + contador);
    }

}

    


