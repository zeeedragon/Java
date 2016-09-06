package softuni;

import java.util.Scanner;

public class PointInFigure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine());
        int y = Integer.parseInt(in.nextLine());

        if ((x >= 2 && x <= 4 && y <= 1 && y >= -3) ||
                (x >= 10 && x <= 12 && y <= 1 && y >= -3) ||
                (x >= 4 && x <= 10 && y <= 3 && y >= -5)) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
    }
}
