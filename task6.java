package javaMusala;

import java.util.Scanner;


public class task6 {
    public static void main(String[] args) {
        round();
    }

    public static void round() {
        Scanner in = new Scanner(System.in);
        final double PI = Math.PI;
        double r = in.nextDouble();
        System.out.println("Circle Perimeter = " + String.format("%.2f", 2 * PI * r));
        System.out.println("Circle Surface = " + String.format("%.2f", PI * r * r));
        System.out.println("Sphere Volume = " + String.format("%.2f", 4/3 * PI * r * r * r));
        System.out.println("Sphere Area = " + String.format("%.2f", 4 * PI * r * r));
    }
}
