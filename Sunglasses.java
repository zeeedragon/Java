package softuni;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 0; j < n * 2; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < n; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < n * 2; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            if (i == ((n - 1) / 2) - 1) {
                System.out.print("*");
                for (int j = 0; j < n * 2 - 2; j++) {
                    System.out.print("/");
                }
                System.out.print("*");
                for (int j = 0; j < n; j++) {
                    System.out.print("|");
                }

                System.out.print("*");
                for (int j = 0; j < n * 2 - 2; j++) {
                    System.out.print("/");
                }
                System.out.print("*");
                System.out.println();
            } else {
                System.out.print("*");
                for (int j = 0; j < n * 2 - 2; j++) {
                    System.out.print("/");
                }
                System.out.print("*");
                for (int j = 0; j < n; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");
                for (int j = 0; j < n * 2 - 2; j++) {
                    System.out.print("/");
                }
                System.out.print("*");
                System.out.println();
            }
        }
        for (int j = 0; j < n * 2; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < n; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < n * 2; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
