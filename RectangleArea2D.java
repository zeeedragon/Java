package softuni;

import java.util.Scanner;

public class RectangleArea2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = Double.parseDouble(in.nextLine());
        double y1 = Double.parseDouble(in.nextLine());
        double x2 = Double.parseDouble(in.nextLine());
        double y2 = Double.parseDouble(in.nextLine());

        double height = Math.abs(y1 - y2);
        double width = Math.abs(x1 - x2);
        double area = height * width;
        double perimer = 2 * (height + width);
        System.out.println(area);
        System.out.println(perimer);
        in.close();
    }
}
