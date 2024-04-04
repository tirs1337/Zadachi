package andrey.glava2;

import java.sql.SQLOutput;

/**
 * Задача из учебника стр.119.
 */
public class Help2 {
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
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while\n");
        System.out.println("Выберите вариант: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Традиционный оператор switch: \n");
                System.out.println("switch (выражение) {");
                System.out.println(" case константа : ");
                System.out.println("   последовательность операторов");
                System.out.println("   break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Цикл for:\n");
                System.out.println("for(инициализация; условие; итерация;");
                System.out.println(" оператор;");
                break;
            case '4':
                System.out.println("Цикл while:\n");
                System.out.println("while (условие) оператор;");
                break;
            case '5':
                System.out.println("Цикл do-while:\n");
                System.out.println("do {");
                System.out.println("  оператор;");
                System.out.println("} while (условие)");
                break;
        }
    }
}



