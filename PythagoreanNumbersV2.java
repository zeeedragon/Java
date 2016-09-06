package softuni;

import java.util.Scanner;

public class PythagoreanNumbersV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (nums[i] <= nums[j] && nums[i] * nums[i] + nums[j] * nums[j] == nums[k] * nums[k]) {
                        System.out.printf("%1$d*%1$d + %2$d*%2$d = %3$d*%3$d\n", nums[i], nums[j], nums[k]);
                        counter++;
                    }
                }
            }
        }
        if (counter == 0) {
            System.out.println("No");
        }
    }
}
