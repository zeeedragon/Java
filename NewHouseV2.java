package softuni;

import java.util.Scanner;

public class NewHouseV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int innerDots = 0;
        int outerDots = n / 2;

        for (int i = 0; i < n / 2 + 1; i++) {
            Print(outerDots, '-');
            Print(innerDots, '*');
            Print(1, '*');
            Print(innerDots, '*');
            Print(outerDots, '-');
            System.out.println();
            innerDots++;
            outerDots--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print('|');
            Print(n - 2, '*');
            System.out.print('|');
            System.out.println();
        }
    }

    public static void Print(int n, char ch) {
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
    }
}
