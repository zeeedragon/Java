package softuni;

import java.util.Scanner;

import static com.sun.tools.doclint.Entity.mu;
import static com.sun.tools.doclint.Entity.para;

public class Eclipse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        //top
        printLine(' ', '*', n);
        printMiddle(' ', n);
        printLine(' ', '*', n);
        System.out.println();

        //mid section
        for (int i = 0; i < n - 2; i++) {
            if (i == n / 2 - 1) {
                printLine('*', '/', n);
                printMiddle('-', n);
                printLine('*', '/', n);
                System.out.println();

            } else {
                printLine('*', '/', n);
                printMiddle(' ', n);
                printLine('*', '/', n);
                System.out.println();
            }
        }
        //bottom
        printLine(' ', '*', n);
        printMiddle(' ', n);
        printLine(' ', '*', n);

    }

    public static void printLine(char aside, char middle, int number) {
        System.out.print(aside);
        for (int i = 0; i < 2 * number - 2; i++) {
            System.out.print(middle);
        }
        System.out.print(aside);
    }

    public static void printMiddle(char ch, int number) {
        for (int i = 0; i < number - 1; i++) {
            System.out.print(ch);
        }
    }

}

