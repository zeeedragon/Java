package softuni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HayvanNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digitsSum = in.nextInt();
        int sumOfThreeNumbers = in.nextInt();
        List<String> allCombinations = combinations();
        List<String> result = Solutions(allCombinations, digitsSum, sumOfThreeNumbers);
        Collections.sort(result);
        if (result.size() != 0) {
            for (String item : result) {
                System.out.println(item);
            }
        } else {
            System.out.println("No");
        }
    }

    private static List<String> Solutions(List<String> allCombinations, int digitSum, int sumOfThreeNumbers) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < allCombinations.size(); i++) {
            for (int j = i; j < allCombinations.size(); j++) {
                int sum = Integer.parseInt(allCombinations.get(j)) - Integer.parseInt(allCombinations.get(i));
                if (sum == sumOfThreeNumbers) {
                    for (int k = j; k < allCombinations.size(); k++) {
                        sum = Integer.parseInt(allCombinations.get(k)) - Integer.parseInt(allCombinations.get(j));
                        if (sum == sumOfThreeNumbers) {
                            int sumOfAllDigits = getSumOfThreeNumbers(allCombinations.get(i)) +
                                    getSumOfThreeNumbers(allCombinations.get(j)) +
                                    getSumOfThreeNumbers(allCombinations.get(k));
                            if (sumOfAllDigits == digitSum) {
                                result.add(allCombinations.get(i) + allCombinations.get(j) + allCombinations.get(k));
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static int getSumOfThreeNumbers(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(Character.toString(s.charAt(i)));
        }
        return sum;
    }


    private static List<String> combinations() {
        List<String> allCombinations = new ArrayList<String>();
        for (int i = 5; i <= 9; i++) {
            for (int j = 5; j <= 9; j++) {
                for (int k = 5; k <= 9; k++) {
                    allCombinations.add(i + "" + j + "" + k);
                }
            }
        }

        return allCombinations;
    }
}
