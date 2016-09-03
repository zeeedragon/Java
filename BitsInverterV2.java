package softuni;

import java.util.Scanner;

public class BitsInverterV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int step = in.nextInt();
        int index = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            for (int bit = 7; bit >= 0; bit--) {
                index++;
                if ((step == 1) || (index % step == 1)) {
                    num = num ^ (1 << bit);
                }
            }
            System.out.println(num);
        }
    }
}
