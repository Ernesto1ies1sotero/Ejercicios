package u2e33;

public class BuscaTrioMagico {

    public static void main(String[] args) {

        int x, y, z;

        for (x = 0; x <= 9; x += 2) {
            for (y = 1; y <= 9; y += 2) {
                for (z = 0; z <= 9; z += 2) {

                    if (x + y + z > 10 && x * y * z < 90) {

                        System.out.println(x + " " + y + " " + z);

                    }

                }
            }
        }

    }
}
