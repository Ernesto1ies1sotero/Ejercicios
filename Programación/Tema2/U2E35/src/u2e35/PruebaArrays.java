
package u2e35;


public class PruebaArrays {

    public static void main(String[] args) {
        double[] notas = new double [25];
        
        
        notas [2]= 4.3;
        notas [3]= 5.3;
        notas [5]= 5.6;
        notas [7]= 7.8;
        System.out.println("La nota de la posición 0 es " +notas[0]);
        System.out.println("La nota de la posición 2 es " +notas[2]);
        System.out.println("La nota de la posición 4 es " +notas[4]);
        System.out.println("La nota de la posición 5 es " +notas[5]);
        
        int[] metrosRecorridos= {200, 400,800,1500,42000};
        
        System.out.println("\n" +(metrosRecorridos[0]+ metrosRecorridos[2]));
        System.out.println("\nLos metros recorridos son de la  posicion 0 es "+metrosRecorridos[0]+" de la posición 1 es "+metrosRecorridos[1]+
        " y de la posición 2 es "+metrosRecorridos[2]);
        
        System.out.println(metrosRecorridos[20]);
        
        
    }
    
}
