package softuni;

import java.util.Scanner;

public class RectangleWithStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cols = 0;

        //first row
        for (int i = 0; i < 2 * n; i++) {
            System.out.print("%");
        }
        System.out.println();
        //mid
        if (n % 2 == 0) {
            for (int rows = 0; rows < n - 1; rows++) {
                System.out.print("%");
                for (cols = 0; cols < 2 * n - 2; cols++) {
                    System.out.print(".");
                    if (rows == n / 2 + 1) {
                        System.out.print("**");
                    }
                }
                System.out.print("%");
                System.out.println();
            }
        }

        //last row
        for (int i = 0; i < 2 * n; i++) {
            System.out.print("%");
        }
        System.out.println();
    }
}
