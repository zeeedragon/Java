package softuni;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();
        type = type.toLowerCase();
        int cols = in.nextInt();
        int rows = in.nextInt();

        double saloon = rows * cols;
        if (type.equals("discount")) {
            System.out.printf("%.2f leva", saloon * 5);
        } else if (type.equals("normal")) {
            System.out.printf("%.2f leva", saloon * 7.5);
        } else {
            System.out.printf("%.2f leva", saloon * 12);
        }
    }
}
