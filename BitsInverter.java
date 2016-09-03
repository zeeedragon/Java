package softuni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BitsInverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int step = Integer.parseInt(in.nextLine());

        String concat = "";

        //converting input into binary and concatеnating it into a single string;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(in.nextLine());
            String toBin = String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
            concat += toBin;

        }

        //iterating over the concat string converted into a char array and doing the bit swap
        char[] chArray = concat.toCharArray();
        for (int i = 0; i < chArray.length; i += step) {
            if (chArray[i] == '1') {
                chArray[i] = '0';
            } else {
                chArray[i] = '1';
            }
        }

        //getting the swapped 8-bit words into a string array;
        String swapped = new String(chArray);
        List<String> binWord = new ArrayList<>();
        int index = 0;
        while (index < swapped.length()) {
            binWord.add(swapped.substring(index, Math.min(index + 8, swapped.length())));
            index += 8;
        }
        List<Integer> backToBase10 = new ArrayList<>();

        for (String s : binWord) {
            int inversedBitNum = Integer.parseInt(s, 2);
            backToBase10.add(inversedBitNum);
        }

        for (int i : backToBase10){
            System.out.println(i);
        }
    }
}
