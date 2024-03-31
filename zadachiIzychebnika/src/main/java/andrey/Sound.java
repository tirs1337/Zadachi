package andrey;

/**
 * Расчет расстояния до места вспышки(стр. 73).
 */
public class Sound {
    /**
     * метод main.
     * @param args - аргумент метода main.
     */
    public static void main(String[] args) {
        double dist;
        dist = 7.2 * 335;
        System.out.println("Место вспышки молнии находится на расстоянии " + dist + " метров. " );
        double dist2;
        dist2 = (7.2 / 2) * 335; /**
         *Тут дополнительная задача. Условия там же .
         */
        System.out.println("Расстояние до крупного объекта " + dist2 + " метров.");
    }
}
