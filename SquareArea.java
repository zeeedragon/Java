package softuni;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("a = ");
        int side = Integer.parseInt(in.nextLine());
        System.out.printf("Area = %d", side * side);
    }
}
