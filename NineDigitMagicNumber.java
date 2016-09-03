package softuni;

public class NineDigitMagicNumber {
    public static int sumOfDigits(int number) {
        int first = number / 100;
        int second = number % 100 / 10;
        int third = number % 10;
        return first + second + third;
    }

    public static boolean DigitLimited(int number) {
        int first = number / 100;
        int second = number % 100 / 10;
        int third = number % 10;
        return first > 0 && first < 8 && second > 0 && second < 8 && third > 0 && third < 8;
    }

    public static void main(String[] args) {
        int sum = 45;
        int diff = 100;
        boolean foundAny = false;
        for (int n1 = 111; n1 <= 777; n1++) {
            int n2 = n1 + diff;
            int n3 = n1 + 2 * diff;

            if (sumOfDigits(n1) + sumOfDigits(n2) + sumOfDigits(n3) == sum && DigitLimited(n1) && DigitLimited(n2) && DigitLimited(n3)) {
                foundAny = true;
                System.out.println(n1 + "" + n2 + "" + n3);
            }
        }
        if (!foundAny) {
            System.out.println("No");
        }
    }
}
