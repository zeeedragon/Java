package softuni;

import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double b1 = Double.parseDouble(in.nextLine());
        double b2 = Double.parseDouble(in.nextLine());
        double h = Double.parseDouble(in.nextLine());

        double area = (b1 + b2) * h / 2;
        System.out.println("Trapezoid area = " + area);
    }
}
