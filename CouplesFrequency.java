package softuni;

import java.util.*;

public class CouplesFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] stringArray = in.nextLine().split(" ");
        String[] couples = new String[stringArray.length - 1];

        for (int i = 0; i < couples.length; i++) {
            couples[i] = stringArray[i] + " " + stringArray[i + 1];
            //System.out.println(couples[i]);
        }

        Map<String, Integer> couplesCounts = new LinkedHashMap<>();
        for (String couple : couples) {
            Integer count = couplesCounts.get(couple);
            if (count == null) {
                count = 0;
            }
            couplesCounts.put(couple, count + 1);
        }
        //System.out.println(couplesCounts);
        for (String s : couplesCounts.keySet()) {
            double percentage = (couplesCounts.get(s) / (double) couples.length) * 100;
            System.out.printf("%s -> %.2f%%\n", s, percentage);
        }
    }
}
