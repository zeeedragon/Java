package softuni;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class FruitMarket {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner in = new Scanner(System.in);
        String dayOfWeek = in.nextLine();
        String[] products = new String[3];
        double[] quantities = new double[3];
        for (int i = 0; i < 3; i++) {
            quantities[i] = Double.parseDouble(in.nextLine());
            products[i] = in.nextLine();
        }

        double totalSum = 0;
        for (int i = 0; i < 3; i++) {
            totalSum += calcSum(dayOfWeek, products[i], quantities[i]);

        }
        System.out.printf("%.2f", totalSum).println();

    }

    private static double calcSum(String dayOfWeek, String product, double quantity) {
        double price = 0;
        boolean isFruit = false;

        switch (product) {
            case "banana":
                price = 1.8;
                isFruit = true;
                break;
            case "orange":
                isFruit = true;
                price = 1.6;
                break;
            case "apple":
                isFruit = true;
                price = 0.86;
                break;
            case "tomato":
                price = 3.2;
                break;
            case "cucumber":
                price = 2.75;
                break;
            default:
                break;
        }

        switch (dayOfWeek) {
            case "Monday":
                break;
            case "Tuesday":
                if (isFruit) {
                    price *= 0.8;
                }
                break;
            case "Wednesday":
                if (!isFruit) {
                    price *= 0.9;
                }
                break;
            case "Thursday":
                if (product.equals("banana")) {
                    price *= 0.7;
                }
                break;
            case "Friday":
                price *= 0.9;
                break;
            case "Saturday":
                break;
            case "Sunday":
                price *= 0.95;
                break;
            default:
                break;

        }
        return price * quantity;
    }

}
