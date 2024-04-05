package andrey;

/**
 * Это задача со стр 63(10номер).
 */
public class zadacha10 {
    /**
     * метод main.
     * @param arg - аргумент метода main.
     */
    public static void main(String[] arg) {
        double inch, meter;
        int counter;
        counter = 0;
        for (inch = 1; inch <= 144; inch++) {
            meter = inch * 39.37; // преобразование в метры.
            System.out.println(inch + " дюйма соответствует " + meter + " метрам.");

            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0; // сброс счетчика.
            }

        }
    }
}
