package softuni;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double r = Double.parseDouble(in.nextLine());

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        System.out.printf("Area = %.13f\n", area);
        System.out.printf("Perimeter = %.13f\n", perimeter);
    }
}
