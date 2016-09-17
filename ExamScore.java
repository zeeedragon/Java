package softuni;

import java.util.*;

public class ExamScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        in.nextLine();
        in.nextLine();

        TreeMap<Integer, TreeMap<String, Double>> entries = new TreeMap<>();
        int numberOfEntries = 0;
        while (true) {
            numberOfEntries++;
            String inputLine = in.nextLine();
            if (inputLine.startsWith("-")) {
                break;
            }

            String[] tokens = inputLine.split("[ |]+");
            //System.out.println(Arrays.toString(tokens));

            String name = tokens[1] + " " + tokens[2];
            int score = Integer.parseInt(tokens[3]);
            String result = tokens[4];

            String[] entry = new String[2];
            entry[0] = name;
            entry[1] = result;

            if (!entries.containsKey(score)) {
                TreeMap<String, Double> studentData = new TreeMap<>();
                entries.put(score, studentData);
            }

            entries.get(score).put(entry[0], Double.parseDouble(entry[1]));
        }

        Double[] averages = new Double[numberOfEntries];
        int counter = 0;
        for (Map.Entry<Integer, TreeMap<String, Double>> entry : entries.entrySet()) {

            Double average = 0.0;
            int countStudents = entry.getValue().entrySet().size();
            for (Map.Entry<String, Double> subentry : entry.getValue().entrySet()) {
                average = average + subentry.getValue();
            }

            average = average / countStudents;
            averages[counter] = average;
            counter++;
        }

        int newCounter = 0;
        for (Map.Entry<Integer, TreeMap<String, Double>> entry : entries.entrySet()) {
            String result = "";
            System.out.print(entry.getKey() + " -> ");
            System.out.print(entry.getValue().keySet());
            System.out.print("; avg=");
            System.out.printf("%.2f", averages[newCounter]);
            newCounter++;
            System.out.println();
        }
    }
}

