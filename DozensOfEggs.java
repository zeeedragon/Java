package softuni;

import java.util.Scanner;

public class DozensOfEggs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = new String[7];
        int eggs = 0;
        int dozens = 0;

        for (int i = 0; i < 7; i++) {
            input = in.nextLine().split(" ");
            if (input[1].equals("eggs")) {
                eggs += Integer.parseInt(input[0]);
            } else {
                dozens += Integer.parseInt(input[0]);
            }
        }
        int remainder = eggs / 12;
        if (remainder >= 1) {
            dozens += eggs / 12;
            eggs -= (12 * remainder);
        }

        System.out.println(dozens + " dozens" + " + " + eggs + " eggs");
    }
}
