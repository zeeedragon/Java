package softuni;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class МagicDates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final long DAY_IN_MILLIS = 1000 * 60 * 60 * 24;
        int startYear = in.nextInt();
        int endYear = in.nextInt();
        int magicWeight = in.nextInt();
        boolean hasMagicDate = false;

        Calendar startCalendar = Calendar.getInstance();
        startCalendar.set(startYear, 0, 1, 0, 0);
        Date startDate = startCalendar.getTime();

        Calendar endCalendar = Calendar.getInstance();
        endCalendar.set(endYear + 1, 0, 1, 0, 0);
        Date endDate = endCalendar.getTime();

        int diffInDays = (int) ((endDate.getTime() - startDate.getTime()) / DAY_IN_MILLIS);

        for (int i = 0; i < diffInDays; i++) {
            Date currentDate = new Date(startDate.getTime() + i * DAY_IN_MILLIS);
            Calendar current = Calendar.getInstance();
            current.setTime(currentDate);
            String extracted = extractDate(current, "");
            int currentWeight = getMagicWeight(extracted);
            if (currentWeight == magicWeight) {
                System.out.println(extractDate(current, "-"));
                hasMagicDate = true;
            }
        }
        if(!hasMagicDate) {
            System.out.println("No");
        }
    }

    public static int getMagicWeight(String string) {
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                int first = Integer.parseInt("" + string.charAt(i));
                int second = Integer.parseInt("" + string.charAt(j));
                result += first * second;
            }
        }
        return result;
    }

    public static String extractDate(Calendar cal, String separator) {
        String date = "";
        date += cal.get(Calendar.DAY_OF_MONTH) < 10 ? "0" : "";
        date += cal.get(Calendar.DAY_OF_MONTH);
        date += separator;
        date += cal.get(Calendar.MONTH) < 9 ? "0" : "";
        date += cal.get(Calendar.MONTH) + 1;
        date += separator;
        date += cal.get(Calendar.YEAR);
        return date;
    }
}
