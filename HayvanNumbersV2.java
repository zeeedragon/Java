package softuni;

import java.util.Scanner;


public class HayvanNumbersV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = Integer.parseInt(in.nextLine());
        int diff = Integer.parseInt(in.nextLine());
        boolean isFound = false;

        for (int num1 = 555; num1 <= 999; num1++) {
            int num2 = num1 + diff;
            int num3 = num1 + 2 * diff;
            if (isAllowedNum(num1)
                    && isAllowedNum(num2)
                    && isAllowedNum(num3)
                    && calcSum(num1) + calcSum(num2) + calcSum(num3) == sum) {
                isFound = true;
                System.out.println("" + num1 + num2 + num3);
            }
        }
        if(!isFound){
            System.out.println("No");
        }
    }

    public static int calcSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isAllowedNum(int n) {
        String num = Integer.toString(n);
        char[] arr = num.toCharArray();
        for (char item : arr) {
            if (item < '5' || item > '9') {
                return false;
            }
        }
        return true;
    }
}
