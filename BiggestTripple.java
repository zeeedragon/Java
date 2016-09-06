package softuni;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Collection;
import java.util.Scanner;

public class BiggestTripple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] numbersAsStrings = in.nextLine().split("\\s+");
        int[] numbers = new int[numbersAsStrings.length];
        for (int i = 0; i < numbersAsStrings.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStrings[i]);
        }
        int currentSum = 0;
        int currentStartIndex = 0;
        int currentSubsequenceLength = 0;
        int bestStartIndex = 0;
        int bestSubsequenceLength = 0;
        int bestSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i += 3) {
            currentSum = numbers[i];
            currentSubsequenceLength = 1;

            if (i + 1 < numbers.length) {
                currentSum += numbers[i + 1];
                currentSubsequenceLength++;
            }

            if (i + 2 < numbers.length) {
                currentSum += numbers[i + 2];
                currentSubsequenceLength++;
            }

            if (currentSum > bestSum) {
                bestStartIndex = i;
                bestSum = currentSum;
                bestSubsequenceLength = currentSubsequenceLength;
            }
        }
        String output = "";
        for (int i = bestStartIndex; i < bestStartIndex + bestSubsequenceLength; i++) {
            output += numbers[i] + " ";

        }
        System.out.println(output.toLowerCase());
    }
}
