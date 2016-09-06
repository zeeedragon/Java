package softuni;

import java.util.Scanner;

public class InsideTheBuilding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = Integer.parseInt(in.nextLine());
        int counter = 5;
        int x = 0;
        int y = 0;
        while (counter != 0) {
            x = Integer.parseInt(in.nextLine());
            y = Integer.parseInt(in.nextLine());
            counter--;
            if (((x >= 0 && x <= 3 * size) && (y >= 0 && y <= size)) ||
            ((x >= size && x <= 2 * size) && (y >= size && y <= 4 * size))) {
                System.out.println("inside");
            } else{
                System.out.println("outside");
            }
        }
    }
}
