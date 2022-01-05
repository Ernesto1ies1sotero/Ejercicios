package U2E21;


public class BombillaCondicional {

    public String marca;
    public int potencia, numVecesEncendida;
    public boolean encendida, fundida;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void imprimeMarca() {
        System.out.println("Su marca es de " + marca);
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void imprimePotencia() {
        System.out.println("Su potencia es de " + potencia);
    }

    public void encender() {
        if (fundida) {
            System.out.println("La bombilla esta fundida y no se puede encender");
        } else {
            if (encendida) {
                System.out.println("La bombilla ya estaba encendida");

            } else {
                encendida = true;
                numVecesEncendida++;
                if (numVecesEncendida >= 5) {
                    fundida = true;
                    encendida = false;
                    System.out.println("La bombilla se acaba de fundir");

                }
            }
        }

    }

    public void apagar() {
        if (fundida) {
            System.out.println("La bombilla esta fundida y no se puede apagar");
        } else {
            if (!encendida) {
                System.out.println("La bombilla ya estaba apagada");
            } else {
                encendida = false;

            }
        }
    }

    public void setNumVecesEncendida(int numVecesEncendida) {
        this.numVecesEncendida = numVecesEncendida;
    }

    public int getNumVecesEncendida() {
        return numVecesEncendida;
    }

    public void imprimeEstado() {
        if (fundida) {
            System.out.println("La bombila esta fundida");
        } else {
            System.out.println("La bombilla esta encendida " + encendida);
        }
    }

}
