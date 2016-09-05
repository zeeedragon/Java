//12.	ДСП, която по въведени брой на редовете и колоните (не повече от 20), отпечатва следната решетка:
//        +--+--+--+--+
//        |  |  |  |  |
//        +--+--+--+--+

package javaMusala;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();

        //First row

        for (int i = 0; i < cols; i++) {
            System.out.print("+--");
        }
        System.out.print('+');

        System.out.println();
        //mid section

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols; j++) {
                System.out.print("|  ");
            }
            System.out.println();
        }
        //Last row

        for (int i = 0; i < cols; i++) {
            System.out.print("+--");
        }
        System.out.print('+');
    }

    public static void grid() {

    }
}
