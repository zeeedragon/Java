package softuni;

import java.text.ParseException;
import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int p1 = in.nextInt();
        int p2 = in.nextInt();
        int p3 = in.nextInt();

        int total = p1 + p2 + p3;
        int remainder = total % 60;
        if (total < 10) {
            System.out.printf("0:0%d", total);
        } else if (total >= 10 && total < 60) {
            System.out.printf("0:%d", total);
        } else if (total >= 60) {
            if (remainder < 10) {
                System.out.printf("%d:0%d", total / 60, remainder);
            } else {
                System.out.printf("%d:%d", total / 60, remainder);
            }
        }
    }
}
