package softuni;

import java.util.Scanner;

public class JoroTheFootballPlayer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String leap = in.nextLine();
        int addPlays = 0;
        if (leap.equals("t")) {
            addPlays = 3;
        }
        int holidays = in.nextInt();
        int hometown = in.nextInt();
        double plays = hometown + (double) 2 / 3 * (52 - hometown) + (double) 1 / 2 * holidays + addPlays;
        System.out.println((int) plays);

    }
}
