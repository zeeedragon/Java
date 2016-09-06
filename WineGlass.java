package softuni;

import java.util.Scanner;

public class WineGlass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();

        for (int row = 0; row < rows / 2; row++) {
            String dots = newString('.', row);
            String stars = newString('*', (rows - 2 * (1 + row)));
            System.out.printf("%s\\%s/%1$s", dots, stars).println();

        }
        String dashes = newString('-', rows);

        if (rows < 12) {
            printStem(rows, rows / 2 - 1);

        } else {
            printStem(rows, rows / 2 - 2);
            System.out.println(dashes);
        }
        System.out.println(dashes);
    }

    private static void printStem(int rows, int repetitions) {
        for (int row = 0; row < repetitions; row++) {
            String dots = newString('.', (rows - 2) / 2);
            System.out.printf("%s||%1$s", dots).println();

        }
    }

    public static String newString(char ch, int size) {
        return new String(new char[size]).replace('\0', ch);
    }
}
