package softuni;

import java.util.Scanner;

public class Rectangleof10x10Stars {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for( int i = 0; i < 10 ; i++) {
            for(int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
