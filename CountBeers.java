package softuni;

import java.util.Scanner;

public class CountBeers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int beers = 0;
        int stacks = 0;

        while (true) {
            String input = in.nextLine();
            if (input.equals("End")) {
                break;
            } else {
                String[] arr = input.split(" ");
                if (arr[1].equals("stacks")) {
                    stacks += Integer.parseInt(arr[0]);
                } else {
                    beers += Integer.parseInt(arr[0]);
                }
            }
        }
        System.out.println((stacks + beers / 20) + " stacks + " + (beers % 20) + " beers");
    }
}
