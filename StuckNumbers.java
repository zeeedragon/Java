package softuni;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StuckNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();

        }


        ArrayList<String> output = new ArrayList<String>();

        for (int a = 0; a < numbers.length; a++) {
            for (int b = 0; b < numbers.length; b++) {
                for (int c = 0; c < numbers.length; c++) {
                    for (int d = 0; d < numbers.length; d++) {
                        boolean checkNotEqual = numbers[a] != numbers[b] &&
                                numbers[a] != numbers[c] &&
                                numbers[a] != numbers[d] &&
                                numbers[b] != numbers[c] &&
                                numbers[b] != numbers[d] &&
                                numbers[c] != numbers[d];
                        if (checkNotEqual && ("" + numbers[a] + numbers[b]).equals
                                ("" + numbers[c] + numbers[d])) {
                            output.add(numbers[a] + "|" + numbers[b] + "=="
                                    + numbers[c] + "|" + numbers[d]);
                        }
                    }

                }

            }

        }
        if (output.isEmpty()) {
            System.out.println("No");
        } else if (n < 4) {
            System.out.println("No");
        } else {
            for (String str : output) {
                System.out.println(str);
            }
        }
    }
}
