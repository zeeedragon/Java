package softuni;

import java.util.Scanner;

public class BitsUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int step = Integer.parseInt(in.nextLine());
        String concat = "";

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(in.nextLine());
            String bin = String.format("%8s", Integer.toBinaryString(num)).replace(" ", "0");
            concat += bin;
        }

        //System.out.println(concat);
        String modified = "0";

        for (int i = 0; i < concat.length() - 1; i++) {
            if (concat.charAt(i + 1) == '0' && i % step == 0) {
                modified += '1';
            } else {
                modified += concat.charAt(i + 1);
            }
        }
        //System.out.println(modified);

        for (int i = 0; i < modified.length(); i += 8) {
            String binSplits = modified.substring(i, i + 8);
            System.out.println(Integer.parseInt(binSplits, 2));
        }
    }


}
