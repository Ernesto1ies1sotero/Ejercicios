package u2e44;

import java.util.Scanner;

public class PruebaArticulo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CONST=5;
        Articulo[] array = new Articulo[CONST];
        Articulo a = new Articulo();

        a = new Articulo();
        array[0] = a;
        a.setIdArticulo(1);
        a.setNombre("Reloj");
        a.setPrecio(12);

        a = new Articulo();
        array[1] = a;
        a.setIdArticulo(2);
        a.setNombre("Casita");
        a.setPrecio(16);

        a = new Articulo();
        array[2] = a;
        a.setIdArticulo(3);
        a.setNombre("PC");
        a.setPrecio(1785);

        a = new Articulo();
        array[3] = a;
        a.setIdArticulo(4);
        a.setNombre("Pantalla");
        a.setPrecio(160);

        a = new Articulo();
        array[4] = a;
        a.setIdArticulo(5);
        a.setNombre("Casita");
        a.setPrecio(16);

//        for (int i = 0; i < array.length; i++) {
//            a=array[i];
//            System.out.println("El id del artículo es " + a.getIdArticulo()
//                    + " su nombre es " + a.getNombre() + " su precio es de " + a.getPrecio());
//        }
        int i = 0; 
        //no es neceario que se llame elem se puede llamar de otra manera 
        //como  por ejemplo "x"
        for (Articulo x : array) {

            System.out.println("El id del artículo es " + x.getIdArticulo()
                    + " su nombre es " + x.getNombre() + " su precio es de " + x.getPrecio()
                    + " su posición es " + i);

            i++;

        }

    }

}
