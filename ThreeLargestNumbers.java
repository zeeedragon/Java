package softuni;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ThreeLargestNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);
        int n = Integer.parseInt(in.nextLine());
        BigDecimal[] input = new BigDecimal[n];

        for (int i = 0; i < n; i++) {
            BigDecimal num = new BigDecimal(in.nextLine());
            input[i] = num;
        }
        Arrays.sort(input);

        for (int i = input.length - 1, count = 3; i >= 0 && count > 0; i--, count--) {
            System.out.println(input[i].toPlainString());

        }
    }
}
