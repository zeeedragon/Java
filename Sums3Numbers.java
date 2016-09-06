package softuni;

import java.util.Arrays;
import java.util.Scanner;

public class Sums3Numbers {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        if(arr[0] + arr[1] == arr[2]) {
            System.out.println(arr[0] + " + " + arr[1] + " = " + arr[2]);
        } else {
            System.out.println("No");
        }
        //System.out.println(Arrays.toString(arr));
    }
}
