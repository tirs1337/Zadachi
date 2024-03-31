package andrey;

/**
 * Демонстрация работы блока.
 */
public class BlockTest {
    /**
     * Метод main.
     * @param args - аргумент метода main.
     */
    public static void main(String[] args) {
        int x, y;
        y = 20;
        // Целью этого цикла является блок.
        for (x = 0; x < 10; x++) {
            System.out.println("Значение x: " + x);
            System.out.println("Значение x: " + y);
            y = y - 2;
        }
    }
}
