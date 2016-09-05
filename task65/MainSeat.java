package task65;
//movie theater 5 rows, 10 seats each
//random price per seat between 5-10lv
//randomly generate which seats are taken and which are available
//return availability and price for a seat entered by console(row and col)
//finally print map of the theater with prices and available seats

import java.util.Random;
import java.util.Scanner;

public class MainSeat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int rows = 5;
        int cols = 10;
        int n = 2; //count of iterations
        Seat[][] seats = new Seat[rows][cols];

        //filling int the matrix of seats
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                int price = rand.nextInt(11 - 5) + 5; //price will be between 5-10lv

                int occupied;
                if (Math.random() >= 0.5) {
                    occupied = 1;
                } else {
                    occupied = 0;
                }
                Seat currentSeat = new Seat(occupied, price);
                seats[i][j] = currentSeat;
            }
        }

        while (n != 0) {
            int row = in.nextInt();
            int seat = in.nextInt();

            if (seats[row][seat].getTaken() == 1) {
                System.out.println("Seat is booked, cost is: " + seats[row][seat].getPrice());
            } else {
                System.out.println("Seat is available, cost is: " + seats[row][seat].getPrice());
            }

            n--;
        }
        printSeats(seats);
    }

    public static void printSeats(Seat[][] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                System.out.println(s[i][j].toString());
            }
            System.out.println();
        }
    }
}
