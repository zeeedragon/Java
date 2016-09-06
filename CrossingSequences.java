package softuni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrossingSequences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNum = in.nextInt();
        int secondNum = in.nextInt();
        int thirdNum = in.nextInt();

        int initialNum = in.nextInt();
        int step = in.nextInt();

        List<Integer> trib = new ArrayList<Integer>();
        trib.add(firstNum);
        trib.add(secondNum);
        trib.add(thirdNum);

        int tribNum = 0;
        while (tribNum < 1000000) {
            tribNum = firstNum + secondNum + thirdNum;
            firstNum = secondNum;
            secondNum = thirdNum;
            thirdNum = tribNum;
            trib.add(tribNum);
        }

        for (int i = 0; i < trib.size(); i++) {
            //System.out.print(trib.get(i) + " ");
        }

        int nextStep = 0;
        boolean found = false;

        if (initialNum == trib.get(0) || initialNum == trib.get(1) || initialNum == trib.get(2)) {
            found = true;
        } else {
            while (!found) {
                nextStep += step;

                for (int i = 0; i < 2 && !found; i++) {
                    initialNum += nextStep;
                    for (int j = 0; j < trib.size(); j++) {
                        if (initialNum == trib.get(j)) {
                            found = true;
                            break;
                        }
                    }
                }
                if (initialNum > 1000000) {
                    break;
                }
            }
        }

        if (found) {
            System.out.println(initialNum);
        } else {
            System.out.println("No");
        }
    }
}
