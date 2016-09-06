package softuni;

import java.util.Scanner;

public class WorkHours {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int projectHours = in.nextInt();
        long availableDays = in.nextLong();
        long productivity = in.nextLong();

        long availableHours = availableDays * 12;
        double workingHours = availableHours - (availableHours * (10.00 / 100.00));
        double productiveHours = workingHours * (productivity / 100.00);
        int finalProductive = (int) productiveHours;

        int diff = finalProductive - projectHours;

        if (diff >= 0) {
            System.out.println("Yes");
            System.out.println(diff);
        } else {
            System.out.println("No");
            System.out.println(diff);
        }  
    }
}
