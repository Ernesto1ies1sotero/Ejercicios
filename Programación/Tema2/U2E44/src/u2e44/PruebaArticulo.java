package u2e44;

import java.util.Scanner;

public class PruebaArticulo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Articulo[] array = new Articulo[5];

//
//        a.setIdArticulo(1);
//        a.setNombre("Reloj");
//        a.setPrecio(12);
//        array[0] = a;
        array[0] = new Articulo();
        array[0].setIdArticulo(1);
        array[0].setNombre("ratón");
        array[0].setPrecio(12);
//        a = new Articulo();
//
//        a.setIdArticulo(2);
//        a.setNombre("Pantalla");
//        a.setPrecio(145);
//
//        array[1] = a;

        array[1] = new Articulo();
        array[1].setIdArticulo(2);
        array[1].setNombre("pantalla");
        array[1].setPrecio(145);
//        a = new Articulo();
//        array[2] = a;
////También se puede poner aquí array[2]=a;
//        a.setIdArticulo(3);
//        a.setNombre("coche");
//        a.setPrecio(10);

        array[2] = new Articulo();
        array[2].setIdArticulo(3);
        array[2].setNombre("Reloj");
        array[2].setPrecio(164);
//        a = new Articulo();
//        array[3] = a;
//        a.setIdArticulo(4);
//        a.setNombre("Raton");
//        a.setPrecio(16);
        array[3] = new Articulo();
        array[3].setIdArticulo(4);
        array[3].setNombre("teclado");
        array[3].setPrecio(38);
//        a = new Articulo();
//        array[4] = a;
//        a.setIdArticulo(5);
//        a.setNombre("PC");
//        a.setPrecio(1450);

        array[4] = new Articulo();
        array[4].setIdArticulo(5);
        array[4].setNombre("Jamón");
        array[4].setPrecio(147);

//        System.out.println("¿Qué id del arículo deseas encontrar?");
//        int IdArtBuscado = sc.nextInt();
        System.out.println("Nombre del artíuclo");
        String nombreBusca = sc.nextLine();
        int i = 0;
        int pos = -1;

//        for (i = 0; i < array.length; i++) {
//            if (IdArtBuscado == array[i].getIdArticulo()) {
//                pos = i;
//                break;
//            }
//
//        }
        for (i = 0; i < array.length; i++) {
            if (nombreBusca.equalsIgnoreCase(array[i].getNombre())) {
                pos = i;
                break;
            }
            
        }
        
        if (pos == -1) {
            System.out.println("\nArticulo no encontrado");
        } else {
            System.out.println("El id del artículos es " + array[i].getIdArticulo());
            System.out.println("El nombre del artículo es " + array[i].getNombre());
            System.out.println("El precio del artículo es " + array[i].getPrecio());
            
        }
        System.out.println("\n");
        for (i = 0; i < array.length; i++) {
            int Id = array[i].getIdArticulo();
            String N = array[i].getNombre();
            double P = array[i].getPrecio();
            
            System.out.println("El Id del arículo es " + Id + " con un nombre " + N + " con un precio " + P + " €"
                    + " una posición de " + i);
//            System.out.printf("%-5s%10s%25s%n",Id,N,P);
        }
        
    }
    
}
