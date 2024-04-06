package andrey.glava2;

/**
 * ЗАдача номер 10,стр.96.
 */

public class Zadacha102 {
    /**
     * Метод main.
     * @param args - аргумент метода main.
     */
    public static void main(String[] args) {
        int i, j;
        boolean simple;
        for (i = 2; i < 100; i++) {
            simple = true;

            for (j = 2; j <= i / j; j++) {
                if ((i % j) == 0) {
                    simple = false;
                }
            }
            if (simple) {
                System.out.println(i + "-простое число");
            }
        }
    }

}
