package softuni;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double RATE = 1.79549;
        double amtBGN = Double.parseDouble(in.nextLine());
        double amtUSD = amtBGN * RATE;
        System.out.printf("%.2f BGN", amtUSD);

        in.close();
    }
}
