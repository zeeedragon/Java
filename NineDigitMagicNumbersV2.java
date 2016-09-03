package softuni;

import java.util.Scanner;

public class NineDigitMagicNumbersV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = Integer.parseInt(in.nextLine());
        int diff = Integer.parseInt(in.nextLine());
        int counter = 0;

        for (int n1 = 111; n1 <= 777; n1++) {

            int n2 = n1 + diff;
            int n3 = n1 + 2 * diff;

            if (sumDigits(n1) + sumDigits(n2) + sumDigits(n3) == sum && isAllowed(n1) && isAllowed(n2) && isAllowed(n3)) {
                System.out.println("" + n1 + n2 + n3);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("No");
        }
    }

    public static boolean isAllowed(int n) {
        int first = n / 100;
        int second = (n % 100) / 10;
        int third = n % 10;
        return first > 0 && first < 8 && second > 0 && second < 8 && third > 0 && third < 8;
    }

    public static int sumDigits(int n) {
        int first = n / 100;
        int second = (n % 100) / 10;
        int third = n % 10;
        return first + second + third;
    }


}
