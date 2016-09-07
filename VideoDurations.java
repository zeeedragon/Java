package softuni;

import java.util.Scanner;

public class VideoDurations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hrs = 0;
        int mins = 0;

        while (true) {
            String input = in.nextLine();
            if (input.equals("End")) {
                break;
            } else {
                String[] duration = input.split(":");
                hrs += Integer.parseInt(duration[0]);
                mins += Integer.parseInt(duration[1]);
            }
        }

        hrs += mins / 60;
        mins = mins % 60;

        if (mins < 10) {
            System.out.println(hrs + ":0" + mins);
        } else {
            System.out.println(hrs + ":" + mins);
        }
    }
}
