package andrey.glava2;

/**
 * Тут надо было понять что не так с фрагментом кода. 5 номер, стр.93.
 */

public class Zadacha55 {
    /**
     * метод main.
     * @param args - аргумент метода main.
     */
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            int sum;
            sum = ++i;
            System.out.println("Сумма; " + sum);
        }
    }
}
// переменная i не была задана, а переменная sum была задана не правильно.
// я дал переменную i, и после начачала цикла for, в новом блоке я задал переменную sum.