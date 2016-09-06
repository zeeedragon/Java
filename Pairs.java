package softuni;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] sequence = input.split("\\s+");
        //System.out.println(Arrays.toString(sequence));
        int maxPairDiff = 0, lastPair = 0;

        for (int i = 0; i < sequence.length - 1; i += 2) {
            int sum = Integer.parseInt(sequence[i]) + Integer.parseInt(sequence[i + 1]);
            if (i != 0) {
                if (i == 2) {
                    maxPairDiff = Math.abs(sum - lastPair);
                } else {
                    if (sum != lastPair) {
                        int diff = Math.abs(sum - lastPair);
                        if (diff > maxPairDiff) {
                            maxPairDiff = diff;
                        }
                    }
                }
            }
            lastPair = sum;
        }
        if (maxPairDiff == 0) {
            System.out.println("Yes, value=" + lastPair);
        } else {
            System.out.println("No, maxdiff=" + maxPairDiff);
        }
    }
}
