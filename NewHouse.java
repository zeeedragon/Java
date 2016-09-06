package softuni;

import java.util.Arrays;
import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int dashesLeft = n / 2;
        int dashesRight = n / 2;
        int stars = 1;
        char[] dashesArr = new char[dashesLeft];
        Arrays.fill(dashesArr, '-');

        //roof
        for (int i = 0; i < n / 2 + 1; i++) {
            char[] dashesLeftArrLoop = new char[dashesLeft];
            char[] starArr = new char[stars];
            char[] dashesRightArr = new char[dashesRight];
            Arrays.fill(dashesLeftArrLoop, '-');
            Arrays.fill(starArr, '*');
            Arrays.fill(dashesRightArr, '-');
            String dashesLeftString = new String(dashesLeftArrLoop);
            String starsString = new String(starArr);
            String dashesRightString = new String(dashesRightArr);
            System.out.println(dashesLeftString + starsString + dashesRightString);
            dashesLeft--;
            stars += 2;
            dashesRight--;
        }

        //body
        for (int i = 0; i < n; i++) {
            System.out.print('|');
            for (int j = 0; j < n - 2; j++) {
                System.out.print('*');
            }
            System.out.print('|');
            System.out.println();
        }
    }
}
