package u2e43;

import java.util.Scanner;

public class U2E43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombrePerros = {"Toby", "Rocky", "Filete", "Perruedines", "Torrija"};

        System.out.println("Dime un nombre de perro");
        String nuevoNombre = sc.nextLine();
        int pos = -1;
        //ZONA DE QUE REALIZA LA BUSQUEDA
        for (int i = 0; i < nombrePerros.length; i++) {
            if (nombrePerros[i].equalsIgnoreCase(nuevoNombre)) {
                pos = i;
                break;//para algoritmo de busqueda hay que poner el break, ya que si no sería un algorito de reccorido.
                       //TENEMOS QUE INDICAR DÓNDE PARAR LA BUSQUEDA;
            }
        }
        /*Zona que da la info, se pone separada ya que si lo ponemos en el for nos repetira en el mensaje 
        si el perro esta en la pocioón 4 nos reppetira el mensaje "no est aen el ranking" tres veces hasta que aparezca.
        Y si no esta nos repite el mensaje que no esta 5 veces. 
        LA PARTE DEL INFORME DEBE ESTAR FUERA DEL FOR (de la zona ded busqueda)!!!!
        */
        //ZONA QUE GENERA EL INFORME
        if (pos == -1) {
            System.out.println(nuevoNombre + " no esta en el Top 5 del ranking");
        } else {
            System.out.println("El nombre " + nuevoNombre + " ocupa el puesto "
                    + (pos + 1) + " del Top 5 de nombre de perros");

        }

    }

}
