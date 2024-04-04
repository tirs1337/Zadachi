package andrey.glava2;
/**
 * Задача из учебника стр.107.
 */
public class Help {
    /**
     * Метод main.
     * @param args - аргумент метода main.
     * @throws java.io.IOException - указанна из-за того, что применяется "System,in.read ()".
     */
    public static void main(String[] args)
        throws java.io.IOException {
        char choice;
        System.out.println("Справка по:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println("Выберите вариант: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch (choice) {
            case '1' :
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2' :
                System.out.println("Традиционный оператор switch: \n");
                System.out.println("switch (выражение) {");
                System.out.println(" case константа : ");
                System.out.println("   последовательность операторов");
                System.out.println("   break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            default:
                System.out.print("Выбранный вариант не найден.");

        }
    }
}
