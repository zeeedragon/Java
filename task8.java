package javaMusala;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        fuelCalculations();
    }

    public static void fuelCalculations() {
        Scanner in = new Scanner(System.in);
        double vol = in.nextDouble();
        double kmPerLitre = in.nextDouble();
        double pricePerLitre = in.nextDouble();

        double costPer100 = 100/kmPerLitre * pricePerLitre;
        double dist = vol * kmPerLitre;

        System.out.println("Cost per 100km " + String.format("%.2f", costPer100));
        System.out.println("Distance with current amount " + String.format("%.2f", dist));
    }
}
