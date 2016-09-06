package softuni;

import java.util.Arrays;
import java.util.Scanner;

public class TheExplorerV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        char[][] picture = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(picture[i], '-');
        }
        int leftCol = n / 2;
        int rightCol = n / 2;
        picture[0][leftCol] = '*';
        picture[n - 1][rightCol] = '*';

        for (int row = 1, col = leftCol - 1; row < n / 2 + 1; row++, col--) {
            picture[row][col] = '*';
        }
        for (int row = 1, col = rightCol + 1; row < n / 2 + 1; row++, col++) {
            picture[row][col] = '*';
        }
        for (int row = n / 2 + 1, col = 1; row < n; row++, col++) {
            picture[row][col] = '*';
        }
        for (int row = n / 2 + 1, col = n - 2; row < n; row++, col--) {
            picture[row][col] = '*';
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(picture[i][j]);
            }
            System.out.println();
        }
    }
}
