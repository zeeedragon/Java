package javaMusala;

import java.util.Scanner;

public class Task28v2 {
    public static void main(String[] args) {
        System.out.println("Enter 4 digits: ");

        Scanner in = new Scanner(System.in);

        int x1 = Integer.parseInt(in.nextLine());
        int x2 = Integer.parseInt(in.nextLine());
        int x3 = Integer.parseInt(in.nextLine());
        int x4 = Integer.parseInt(in.nextLine());

        if (x1 == x4 && x2 == x3) {
            System.out.println("в двойки");
        } else {
            System.out.println("не в двойки");
        }
    }
}
