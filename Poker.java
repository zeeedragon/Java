package softuni;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cardsNumber = 5;
        String hand = "Nothing";
        int[] cards = new int[13];

        for (int i = 0; i < cardsNumber; i++) {
            String card = in.nextLine();
            card = card.toUpperCase();

            switch (card) {
                case "2":
                    cards[0]++;
                    break;
                case "3":
                    cards[1]++;
                    break;
                case "4":
                    cards[2]++;
                    break;
                case "5":
                    cards[3]++;
                    break;
                case "6":
                    cards[4]++;
                    break;
                case "7":
                    cards[5]++;
                    break;
                case "8":
                    cards[6]++;
                    break;
                case "9":
                    cards[7]++;
                    break;
                case "10":
                    cards[8]++;
                    break;
                case "J":
                    cards[9]++;
                    break;
                case "Q":
                    cards[10]++;
                    break;
                case "K":
                    cards[11]++;
                    break;
                case "A":
                    cards[12]++;
                    break;
            }
        }
        int doubles = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == 2) {
                doubles++;
            }
        }
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == 5) {
                hand = "Impossible";
            }
            if (cards[i] == 4) {
                hand = "Four of a Kind";
            }
            if (cards[i] == 3) {
                hand = "Three of a Kind";
            }
            if (doubles == 2) {
                hand = "Two Pairs";
            }
            if (cards[i] == 3 && doubles == 1) {
                hand = "Full House";
                break;
            }
            if (doubles == 1) {
                hand = "One Pair";
            }
        }

        for (int i = 0; i < cards.length - cardsNumber; i++) {
            if (cards[i] == 1
                    && cards[i] == cards[i + 1]
                    && cards[i] == cards[i + 2]
                    && cards[i] == cards[i + 3]
                    && cards[i] == cards[i + 4]) {
                hand = "Straight";
            }
        }

        if (cards[0] == 1
                && cards[1] == 1
                && cards[2] == 1
                && cards[3] == 1
                && cards[12] == 1) {
            hand = "Straight";
        }
        System.out.println(hand);
    }
}
