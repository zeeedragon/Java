package softuni;

import java.util.Scanner;

public class InchesToCm {
    public static void main(String[] args) {
        final double INCH = 2.54;
        Scanner in = new Scanner(System.in);
        System.out.println("inches = ");
        double inches = Double.parseDouble(in.nextLine());
        double cm = inches * INCH;
        System.out.printf("centimetres = %.2f", cm);

    }

    public static class PersonalTItles {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double age = Double.parseDouble(in.nextLine());
            String gender = in.nextLine();
            char ch = gender.charAt(0);
            if (ch == 'm') {
                if (age >= 16) {
                    System.out.println("Mr.");
                } else {
                    System.out.println("Master");
                }
            } else {
                if (age >= 16) {
                    System.out.println("Ms.");
                } else {
                    System.out.println("Miss");
                }
            }
        }
    }

    public static class SmallShop {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int numOfCables = Integer.parseInt(in.nextLine());
            int sum = 0;
            int qty = 0;
            int validCables = 0;

            while (numOfCables != 0) {

                qty = Integer.parseInt(in.nextLine());
                String measure = in.nextLine();

                if (qty < 20 && !measure.equals("meters")) {
                    qty = 0;
                    validCables--;
                }
                if (measure.equals("meters")) {
                    qty *= 100;
                }
                sum += qty;
                numOfCables--;
                validCables++;
            }
            //sum with extracted waist
            sum -= (validCables - 1) * 3;
            //sum final
            int finalCut = sum  / (504);
            int remainder = sum % (504);
            System.out.println(finalCut);
            System.out.println(remainder);
        }
    }
}
