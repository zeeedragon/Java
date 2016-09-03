package softuni;

import java.util.Scanner;
import java.util.regex.Matcher;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int oddNumbersSum = 0;
        int evenNumbersSum = 0;

        for (int i = 0; i < 2 * n; i++) {
            int number = in.nextInt();

            if (i % 2 == 0) {
                evenNumbersSum += number;
            } else {
                oddNumbersSum += number;
            }
        }
        int bigger = Math.max(evenNumbersSum, oddNumbersSum);
        int smaller = Math.min(evenNumbersSum, oddNumbersSum);
        if (bigger == smaller) {
            System.out.println("Yes, sum=" + evenNumbersSum);
        } else {
            System.out.println("No, diff=" + (bigger - smaller));
        }
    }
}
