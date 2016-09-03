package softuni;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String year = in.nextLine();
        int holidays = in.nextInt();
        int hometown = in.nextInt();
        double normalWknds = (48 - hometown) * (3.0 / 4.0);
        double holidayPlays = holidays * (2.0 / 3.0);
        double result = normalWknds + holidayPlays + hometown;
        if (year.equals("leap")) {
            result = (15.0 / 100.0 * result) + result;
            System.out.println((int) result);
        } else {
            System.out.println((int) result);
        }
    }
}
