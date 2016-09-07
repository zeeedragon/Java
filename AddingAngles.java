package softuni;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingAngles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Integer> degs = new ArrayList<>();
        String[] input = in.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            degs.add(Integer.parseInt(input[i]));
        }
        //System.out.println(degs);

        boolean isFound = false;
        for (int i = 0; i < degs.size(); i++) {
            for (int j = i + 1; j < degs.size(); j++) {
                for (int k = j + 1; k < degs.size(); k++) {
                    if ((degs.get(i) + degs.get(j) + degs.get(k)) % 360 == 0) {
                        isFound = true;
                        System.out.println(degs.get(i) + " + " + degs.get(j) + " + " + degs.get(k) + " = " +
                                (degs.get(i) + degs.get(j) + degs.get(k)) + " degrees");
                    }
                }
            }
        }
        if(!isFound) {
            System.out.println("No");
        }
    }
}
