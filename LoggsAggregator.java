package softuni;

import java.util.Scanner;
import java.util.TreeMap;

public class LoggsAggregator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        TreeMap<String, TreeMap<String, Integer>> users = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] userInput = in.nextLine().split(" ");
            String ip = userInput[0];
            String user = userInput[1];
            Integer min = Integer.parseInt(userInput[2]);

            if (!users.containsKey(user)) {
                users.put(user, new TreeMap<String, Integer>());
                users.get(user).put(ip, min);
            } else if (users.get(user).containsKey(ip)) {
                int tempMinutes = users.get(user).get(ip);
                users.get(user).put(ip, tempMinutes + min);
            } else {
                users.get(user).put(ip, min);
            }
        }
        for (String user : users.keySet()) {
            System.out.print(user + ": ");

            int totalMins = 0;

            for (String ip : users.get(user).keySet()) {
                totalMins += users.get(user).get(ip);
            }

            System.out.print(totalMins + " ");
            System.out.println(users.get(user).keySet());
            System.out.println();
        }
    }
}
