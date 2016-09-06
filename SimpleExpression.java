package softuni;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SimpleExpression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String userInput = in.nextLine();

        Pattern digitRegex = Pattern.compile("[\\d\\.]+");
        Matcher digitMatch = digitRegex.matcher(userInput);

        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> operands = new ArrayList<>();

        while (digitMatch.find()) {
            numbers.add(digitMatch.group());
        }

        Pattern operandsRegex = Pattern.compile("[+-]+");
        Matcher operandsMatch = operandsRegex.matcher(userInput);

        while (operandsMatch.find()) {
            operands.add(operandsMatch.group());
        }

        BigDecimal sum = new BigDecimal(numbers.get(0));
        for (int i = 0; i < operands.size(); i++) {
            if (operands.get(i).equals("+")) {
                sum = sum.add(new BigDecimal(numbers.get(i + 1)));
            }
            if (operands.get(i).equals("-")) {
                sum = sum.subtract(new BigDecimal(numbers.get(i + 1)));
            }
        }

        System.out.println(sum.toPlainString());
    }
}
