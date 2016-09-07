package softuni;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestOddEvenSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        ArrayList<Integer> al = new ArrayList<>();

        Pattern pat = Pattern.compile("\\d+");
        Matcher match = pat.matcher(input);
        while (match.find()) {
            int number = Integer.parseInt(match.group());
            al.add(number);
        }
        Integer[] numbers = al.toArray(new Integer[0]);

        String lastState;
        if (numbers[0] == 0) {
            lastState = "zero";
        } else if (numbers[0] % 2 == 0) {
            lastState = "even";
        } else {
            lastState = "odd";
        }

        int maxLength = 1;
        int tempLength = 1;

        for (int i = 1; i < numbers.length; i++) {
            Integer number = numbers[i];
            if (numbers[i] == 0) {
                if (lastState.equals("odd")) {
                    lastState = "even";
                } else if (lastState.equals("even")) {
                    lastState = "odd";
                }
                tempLength++;
            } else if (numbers[i] % 2 == 0) {
                if (lastState.equals("odd") || lastState.equals("zero")) {
                    tempLength++;
                } else {
                    tempLength = 1;
                }
                lastState = "even";
            } else {
                if (lastState.equals("even") || lastState.equals("zero")) {
                    tempLength++;
                } else {
                    tempLength = 1;
                }
                lastState = "odd";
            }

            if (tempLength > maxLength) {
                maxLength = tempLength;
            }
        }
        System.out.println(maxLength);
    }
}
