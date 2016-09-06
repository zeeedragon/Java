package softuni;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        //first line
        System.out.print("+ ");
        for (int i = 0; i < count - 2; i++) {
            System.out.print("- ");
        }
        System.out.print("+ ");
        System.out.println();

        //mid section
        for (int i = 0; i < count - 2; i++) {
            System.out.print("| ");
            for (int j = 0; j < count - 2; j++) {
                System.out.print("- ");
            }
            System.out.print("|");
            System.out.println();
        }

        //last line
        System.out.print("+ ");
        for (int i = 0; i < count - 2; i++) {
            System.out.print("- ");
        }
        System.out.print("+ ");
    }
}
