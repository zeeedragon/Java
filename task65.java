package javaMusala;
//movie theater 5 rows, 10 seats each
//random price per seat between 5-10lv
//randomly generate which seats are taken and which are available
//return availability and price for a seat entered by console(row and col)
//finally print map of the theater with prices and available seats

import java.util.Random;
import java.util.Scanner;


public class task65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5; //count of iterations
        int[][] prices = new int[5][10];
        int[][] spots = new int[5][10];

        int[][] pricesNow = generatePrices(prices);
        int[][] spotsNow =  generateFreeSpots(spots);

        while (n != 0) {
            int line = in.nextInt(); // 0-4
            int seat = in.nextInt(); // 0-9
            if (isTaken(spotsNow, line, seat) == 1) {
                System.out.print("Seat taken ");
                System.out.println(pricesNow[line][seat] + "lv");
            } else {
                System.out.print("Seat available ");
                System.out.println(pricesNow[line][seat] + "lv");
            }
            n--;
        }
        in.close();

        print(spotsNow, 5, 10);
        System.out.println();
        print(pricesNow, 5, 10);
        System.out.println();
    }

    public static int isTaken(int[][] n, int line, int seat) {
        return n[line][seat];
    }

    public static int[][] generatePrices(int[][] n) {
        Random rand = new Random();

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                n[i][j] = rand.nextInt(11 - 5) + 5; //price 5-10
            }
        }
        return n;
    }

    public static int[][] generateFreeSpots(int[][] n) {

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                double availability = Math.random();
                if (availability >= 0.5) {
                    n[i][j] = 1;
                } else {
                    n[i][j] = 0;
                }
            }
        }
        return n;
    }

    public static void print(int[][] n, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(n[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
