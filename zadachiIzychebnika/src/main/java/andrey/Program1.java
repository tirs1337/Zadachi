package andrey;

public class Program1 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore, answer = '.';
        String c = " ";
        do {
            System.out.println("Задумана клавиша имеющая знак препинания.");
            System.out.println("Попробуй ее угадать: ");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("**Правильно** ");
            else {
                System.out.print("...Увы , не угадали. Задуманная буква находится ");
                if (ch < answer) System.out.println("дальше по алфавиту.");
                else System.out.println("ближе по алфавиту.");
                System.out.println("Повторите попытку!\n");

            }
        } while (answer != ch);
    }

}


