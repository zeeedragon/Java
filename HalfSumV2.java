package softuni;

import java.util.Scanner;

public class HalfSumV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] nums = new int[2 * n];
        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i < 2 * n; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum1 += nums[i];
        }


        for (int i = n; i < 2 * n; i++) {
            sum2 += nums[i];

        }

        if (sum1 == sum2) {
            System.out.println("Yes, sum=" +  sum1);
        } else {
            System.out.println("No, diff=" + Math.abs(sum1 - sum2));
        }
    }
}
