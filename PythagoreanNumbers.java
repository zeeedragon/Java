package softuni;

import java.util.HashSet;
import java.util.Scanner;

public class PythagoreanNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            int num = in.nextInt();
            nums[i] = num;
        }
        HashSet<Integer> sqrt = new HashSet<>();
        for (int num : nums) {
            sqrt.add(num * num);
        }


        int counter = 0;
        for (int a : nums) {
            for (int b : nums) {
                int cSqrt = a * a + b * b;
                if (a <= b && sqrt.contains(cSqrt)) {
                    int c = (int) Math.sqrt(cSqrt);
                    System.out.printf("%d*%d + %d*%d = %d*%d\n", a, a, b, b, c, c);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("No");
        }
    }
}
