package softuni;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();
        long max = 0;
        long sum = 0;

        String[] input = inputLine.split("\\s+");
        long[] inputToInt = new long[input.length];

        for (int i = 0; i < inputToInt.length; i++) {
            inputToInt[i] = Long.parseLong(input[i]);
            if (max < inputToInt[i]) {
                max = inputToInt[i];
            }
            sum += inputToInt[i];
        }

        if (2 * max == sum) {
            System.out.println("Yes, sum=" + max);
        } else {
            System.out.println("No, diff=" + Math.abs(sum - (2 * max)));
        }
    }
}
