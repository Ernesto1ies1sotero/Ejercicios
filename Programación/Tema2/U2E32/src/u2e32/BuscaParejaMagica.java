package u2e32;

public class BuscaParejaMagica {

    public static void main(String[] args) {
        int x, y;

        for (x = 0; x <= 9; x += 2) {
            for (y = 1; y <= 9; y += 2) {
                
                //if (x%2==o && y%2==1 && x+y>6 && x*y <60) es otra opción.
                //x%2==0 hace que x sea par
                if (x + y > 6 && x * y < 60) {

                    System.out.println(x + " " + y);

                }

            }

        }
    }

}
