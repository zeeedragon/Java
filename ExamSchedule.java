package softuni;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ExamSchedule {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startingHr = Integer.parseInt(in.nextLine());
        int startingMin = Integer.parseInt(in.nextLine());
        String timeOfDay = in.nextLine();
        int durationHrs = Integer.parseInt(in.nextLine());
        int durationMin = Integer.parseInt(in.nextLine());

        startingHr %= 12;
        if (timeOfDay.equals("PM")) {
            startingHr += 12;
        }

        LocalDateTime now = LocalDateTime.of(0, 1, 1, startingHr, startingMin);
        LocalDateTime endTime = now.plusMinutes(durationMin).plusHours(durationHrs);

        System.out.printf("%1$tI:%1$tM:%1$Tp", endTime);

    }
}
