package softuni;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celT = Double.parseDouble(in.nextLine());

        double farhT = (celT * 9) / 5 + 32;
        System.out.printf("%.2f", farhT);

        in.close();
    }
}
