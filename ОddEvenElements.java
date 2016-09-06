package softuni;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class ОddEvenElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal oddSum = new BigDecimal("" + 0);
        BigDecimal oddMax = new BigDecimal("" + Integer.MIN_VALUE);
        BigDecimal oddMin = new BigDecimal("" + Integer.MAX_VALUE);

        BigDecimal evenSum = new BigDecimal("" + 0);
        BigDecimal evenMax = new BigDecimal("" + Integer.MIN_VALUE);
        BigDecimal evenMin = new BigDecimal("" + Integer.MAX_VALUE);

        String inputNumbers = in.nextLine();
        String[] numbersArr = inputNumbers.split("\\s+");

        if (numbersArr.equals("")) {
            numbersArr = new String[0];
        }
        //System.out.println(String.join(", ", numbersArr));

        for (int i = 0; i < numbersArr.length; i++) {
            BigDecimal currentNumber = new BigDecimal("" + Double.parseDouble(numbersArr[i]));

            if (i % 2 == 0) {
                oddSum = oddSum.add(currentNumber);
                if (currentNumber.compareTo(oddMin) == -1) {
                    oddMin = currentNumber;
                }

                if (currentNumber.compareTo(oddMax) == 1) {
                    oddMax = currentNumber;
                }
            } else {
                evenSum = evenSum.add(currentNumber);
                if (currentNumber.compareTo(evenMin) == -1) {
                    evenMin = currentNumber;
                }
                if (currentNumber.compareTo(evenMax) == 1) {
                    evenMax = currentNumber;
                }
            }
        }

        DecimalFormat df = new DecimalFormat("##########.##");
        if (numbersArr.length > 1) {
            System.out.printf("OddSum=%1$s, OddMin=%2$s, OddMax=%3$s, EvenSum=%4$s, " +
                            " EvenMin=%5$s, EvenMax=%6$s", df.format(oddSum), df.format(oddMin), df.format(oddMax),
                    df.format(evenSum), df.format(evenMin), df.format(evenMax));
        } else if (numbersArr.length == 1) {
            System.out.printf("OddSum=%1$s, OddMin=%2$s, OddMax=%3$s"
                    + " EvenSum=No, EvenMin=No, EvenMax=No", df.format(oddSum), df.format(oddMin), df.format(oddMax));
        } else if (numbersArr.length == 0) {
            System.out.println("No");
        }
    }
}
