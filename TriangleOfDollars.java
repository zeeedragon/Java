package softuni;

import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
