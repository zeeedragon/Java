package softuni;

import java.util.Scanner;
import java.util.TreeMap;

public class ActivityTracker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] input;

        TreeMap<Integer, TreeMap<String, Double>> res = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            input = in.nextLine().split(" ");
            int month = getMonth(input[0]);
            String user = input[1];
            double distance = Double.parseDouble(input[2]);

            if (res.get(month) == null) {
                res.put(month, new TreeMap<String, Double>());
            }

            double oldDistanse = 0;
            TreeMap<String, Double> userData = res.get(month);
            if (userData.containsKey(user)) {
                oldDistanse = userData.get(user);
            }
            userData.put(user, distance + oldDistanse);
        }
        for (Integer month : res.keySet()) {
            System.out.print(month + ": ");
            TreeMap<String, Double> users = res.get(month);

            int count = 0;
            for (String name : users.keySet()) {
                if (count > 0) {
                    System.out.printf(", %s(%.0f)", name, users.get(name));
                } else {
                    System.out.printf("%s(%.0f)", name, users.get(name));
                }
                count++;
            }
            System.out.println();
        }
    }

    public static int getMonth(String date) {
        int month = Integer.parseInt(date.substring(3, 5));
        return month;
    }
}
