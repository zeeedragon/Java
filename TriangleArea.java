package softuni;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side = Double.parseDouble(in.nextLine());
        double h = Double.parseDouble(in.nextLine());

        double area = (side * h) / 2;
        System.out.printf("Triangle area = %.2f", area);
        in.close();
    }
}
