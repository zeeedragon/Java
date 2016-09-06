package softuni;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = Double.parseDouble(in.nextLine());
        double b = Double.parseDouble(in.nextLine());

        System.out.println( a > b ? a : b);
        in.close();
    }
}
