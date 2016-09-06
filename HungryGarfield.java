package softuni;

import java.util.Scanner;

public class HungryGarfield {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double sum = Double.parseDouble(in.nextLine());
        double rate = Double.parseDouble(in.nextLine());

        double pizzaP = Double.parseDouble(in.nextLine());
        double lasagnaP = Double.parseDouble(in.nextLine());
        double sandwichP = Double.parseDouble(in.nextLine());

        long pizzaQty = Long.parseLong(in.nextLine());
        long lasagnaQty = Long.parseLong(in.nextLine());
        long sandwichQty = Long.parseLong(in.nextLine());
        in.close();

        Double cost = (pizzaP / rate) * pizzaQty + (lasagnaP / rate) * lasagnaQty + (sandwichP / rate) * sandwichQty;
        if (cost <= sum) {
            System.out.printf("Garfield is well fed, John is awesome. Money left: $%.2f.", (sum - cost));
        } else {
            System.out.printf("Garfield is hungry. John is a badass. Money needed: $%.2f.", (cost - sum));
        }
    }
}
