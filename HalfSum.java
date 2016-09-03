package softuni;

import java.util.Scanner;

public class HalfSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum2 += in.nextInt();
        }
        in.close();

        if (sum1 == sum2) {
            System.out.print("Yes, sum = " + sum1);
        } else {
            System.out.println("No, diff  = " + Math.abs(sum1 - sum2));
        }
    }
}
