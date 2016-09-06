package softuni;

import java.util.Scanner;

public class IlluminatiV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int len = input.length();
        int counter = 0;
        int sum = 0;
        input = input.toUpperCase();
        for (int i = 0; i < len; i++) {
            if (input.charAt(i) == 'A'
                    || input.charAt(i) == 'E'
                    || input.charAt(i) == 'I'
                    || input.charAt(i) == 'O'
                    || input.charAt(i) == 'U') {
                counter++;
                sum += input.charAt(i);
            }
        }
        System.out.println(counter);
        System.out.println(sum);
    }
}
