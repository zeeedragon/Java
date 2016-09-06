package softuni;

import java.util.Scanner;

public class Illuminati {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.toLowerCase();
        int len = input.length();
        int counter = 0;
        long sum = 0;
        for (int i = 0; i < len; i++) {
            if (input.charAt(i) == 'a'
                    || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {
                counter++;
            }
            sum += calcVawel(input.charAt(i));
        }
        System.out.println(counter);
        System.out.println(sum);
    }

    public static int calcVawel(char ch) {

        int valueVowel = 0;
        switch (ch) {
            case 'a':
                valueVowel += 65;
                break;
            case 'e':
                valueVowel += 69;
                break;
            case 'i':
                valueVowel += 73;
                break;
            case 'o':
                valueVowel += 79;
                break;
            case 'u':
                valueVowel += 85;
                break;
            default:
                valueVowel += 0;
                break;
        }

        return valueVowel;
    }
}
