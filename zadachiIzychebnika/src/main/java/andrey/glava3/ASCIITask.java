package andrey.glava3;

/**
 * Это задача номер 10, стр. 134.
 */
public class ASCIITask {
    /**
     * метода main.
     * @param args - аргумент метода main.
     * @throws java.io.IOException - указанна из-за того, что применяется "System,in.read ()".
     */
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        int i;
        i = 0;
        do {
            ch = (char) System.in.read();

            if (ch >= 65 & ch <= 90) {
                ch = (char) (ch + 32);
                System.out.println(ch);
                i = i + 1;
            }  else {
                if (ch >= 97 & ch <= 122) {
                ch = (char) (ch - 32);
                System.out.println(ch);
                i = i + 1;
            }

            }
        } while (ch != '.');
        System.out.println(i);
    }
}



