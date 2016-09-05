package javaMusala;

import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        System.out.println("Enter 4 digits:");

        Scanner in = new Scanner(System.in);

        String x1 = in.nextLine();
        String x2 = in.nextLine();
        String x3 = in.nextLine();
        String x4 = in.nextLine();

        //combining the digits into two 2-digit numbers
        String x5 = x1 + x2;
        String x6 = x3 + x4;
        String x6reversed = x4 + x3;

        if (x5.equals(x6) || x5.equals(x6reversed)) {
            System.out.println("в двойки");
        } else {
            System.out.println("не в двойки");
        }
    }
}
