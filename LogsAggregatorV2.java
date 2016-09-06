package softuni;

import javax.swing.event.TreeSelectionEvent;
import java.util.*;

public class LogsAggregatorV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        TreeMap<String, Integer> durations = new TreeMap<>();
        HashMap<String, TreeSet<String>> ipAddresses = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String logLine = in.nextLine();
            String[] logTokens = logLine.split(" ");
            String ip = logTokens[0];
            String user = logTokens[1];
            int duration = Integer.parseInt(logTokens[2]);

            Integer oldDuration = durations.get(user);
            if (oldDuration == null) {
                oldDuration = 0;
            }
            durations.put(user, oldDuration + duration);


            TreeSet<String> ipSet = ipAddresses.get(user);
            if (ipSet == null) {
                ipSet = new TreeSet<>();
            }
            ipSet.add(ip);
            ipAddresses.put(user, ipSet);
        }

        for (Map.Entry<String, Integer> userAndDuration : durations.entrySet()) {
            String user = userAndDuration.getKey();
            int duration = userAndDuration.getValue();
            TreeSet<String> ipSet = ipAddresses.get(user);
            System.out.println(user + ": " + duration + " " + ipSet);
        }

    }
}
