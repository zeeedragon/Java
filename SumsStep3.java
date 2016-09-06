package softuni;

import java.util.Scanner;

public class SumsStep3 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0 ; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            for( i = 0; i < n; i +=3 ){
                sum1 += arr[i];
            }

            for( i = 1; i < n; i +=3 ){
                sum2 += arr[i];
            }
            for( i = 2; i < n; i +=3 ) {
                sum3 += arr[i];
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
