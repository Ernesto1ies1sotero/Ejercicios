package es.tuespiral.u2.e40.articulos;

import java.util.Scanner;

public class PruebaArrayArticulos {
    public static void main(String[] args) {
        // DEFINICIONES Y LA INICIALIZACIÓN
        Articulo[] array = new Articulo[5];
        Scanner sc = new Scanner(System.in);
        
        Articulo a = new Articulo();
        a.setIdArticulo(1);
        a.setNombre("Reloj");
        a.setPrecio(12);
        
        array[0] = a;
        
        a = new Articulo();
        a.setIdArticulo(2);
        a.setNombre("Ratón");
        a.setPrecio(10);
        
        array[1] = a;
        
        a = new Articulo();
        a.setIdArticulo(3);
        a.setNombre("Teclado");
        a.setPrecio(15);
        
        array[2] = a;
        
        a = new Articulo();
        a.setIdArticulo(4);
        a.setNombre("Monitor");
        a.setPrecio(150);
        
        array[3] = a;
        
        a = new Articulo();
        a.setIdArticulo(5);
        a.setNombre("Impresora");
        a.setPrecio(150);
        
        array[4] = a;
        
        // PEDIR AL USUARIO QUÉ BUSCAMOS
        System.out.println("Dime qué identificador de artículos buscas: ");
        int idBuscado = sc.nextInt();
        
        // ALGORITMO DE BÚSQUEDA
        int pos = -1;
        for(int i=0; i < array.length; i++) {
            Articulo elem = array[i];
            if(idBuscado == elem.getIdArticulo()) {
                pos = i;
                break;
            }
        }
        
        // RESULTADO DE LA BÚSQUEDA
        if (pos == -1) 
            System.out.println("Artículo no encontrado");
        else {
            Articulo elem = array[pos];
            System.out.println("idArticulo = "+elem.getIdArticulo());
            System.out.println("Nombre = "+elem.getNombre());
            System.out.println("Precio = "+elem.getPrecio());
        } 
        
        // RECORRIDO E IMPRESIÓN DEL ARRAY
        for (int i=0; i < array.length;i++) {
            a = array[i];
            System.out.println("Posicion "+i+
                    " idArticulo = "+a.getIdArticulo()+
                    " nombre = "+a.getNombre()+
                    " precio = "+a.getPrecio()+"€");
        }
        
    }
}
