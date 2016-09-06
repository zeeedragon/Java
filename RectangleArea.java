package softuni;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long width = Long.parseLong(in.nextLine());
        long height = Long.parseLong(in.nextLine());

        System.out.println(width * height);
    }
}
