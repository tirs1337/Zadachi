package andrey;

/**
 * Вывод таблицы истинности для логических операций(стр. 92)
 */
public class LogicalOpTable {
    /**
     * метод main.
     * @param args - аргумент метода main.
     */
    public static void main(String[] args) {
        boolean p,q;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");// тут я добавил еще добавил по знаку табуляции.
        p = true;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));



        p = true; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p)); {

            int a, b; /** Тут я вообще не уверен в задачи, пытался через преобразования
             и цикл for, это показалось самым оптимальным.
             */
            System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");
            a = 1;
            b = 1;
            System.out.print(a + "\t\t" + b + "\t\t");
            System.out.print((a&b) + "\t\t" + (a|b) + "\t\t");
            System.out.println((a^b) + "\t\t" + (a-a));
            a = 1;
            b = 0;
            System.out.print(a + "\t\t" + b + "\t\t");
            System.out.print((a&b) + "\t\t" + (a|b) + "\t\t");
            System.out.println((a^b) + "\t\t" + (a-a));
            a = 0;
            b = 1;
            System.out.print(a + "\t\t" + b + "\t\t");
            System.out.print((a&b) + "\t\t" + (a|b) + "\t\t");
            System.out.println((a^b) + "\t\t" + (a+b));
            a = 0;
            b = 0;
            System.out.print(a + "\t\t" + b + "\t\t");
            System.out.print((a&b) + "\t\t" + (a|b) + "\t\t");
            System.out.println((a^b) + "\t\t" + (a + 1));



        }





    }
}