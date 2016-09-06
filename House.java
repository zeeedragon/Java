package softuni;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String star = "*";

        if (n % 2 == 0) {
            for (int i = 0; i < (n + 1) / 2; i++) {
                for (int j = (n - 2) / 2; j > i; j--) {
                    System.out.print("_");
                }
                for (int j = 0; j < (n - 2) / 2; j++) {
                    System.out.print("**");
                }
                for (int j = (n - 2) / 2; j > i; j--) {
                    System.out.print("_");
                }
                System.out.println();
            }
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.print("|");
            for (int j = 0; j < n - 2; j++) {
                System.out.print("*");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
