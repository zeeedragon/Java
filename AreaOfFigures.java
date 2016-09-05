package softuni;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String figure = in.nextLine();
        switch (figure) {
            case "rectangle": {
                double a = in.nextDouble();
                double b = in.nextDouble();
                calcRectangles(a, b);
                break;
            }
            case "square": {
                double a = in.nextDouble();
                calcRectangles(a, a);
                break;
            }
            case "circle":
                double r = in.nextDouble();
                calcCircle(r);
                break;
            case "triangle": {
                double a = in.nextDouble();
                double h = in.nextDouble();
                calcTriangle(a, h);
                break;
            }
        }
    }

    private static void calcRectangles(double a, double b) {
        double area = a * b;
        System.out.printf("%.3f", area);
    }

    private static void calcCircle(double r) {
        double area = Math.PI * r * r;
        System.out.printf("%.3f", area);
    }

    private static void calcTriangle(double a, double h) {
        double area = (a * h) / 2;
        System.out.printf("%.3f", area);
    }

}
