package softuni;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hr = Integer.parseInt(in.nextLine());
        int min = Integer.parseInt(in.nextLine());
        int totalMin = hr * 60 + min;
        totalMin += 15;
        int hrLater = totalMin / 60;
        int minLater = totalMin % 60;
        if (hrLater < 24 && minLater < 10) {
            System.out.printf("%d:0%d", hrLater, minLater);
        } else if (hrLater <= 23 && minLater >= 10) {
            System.out.printf("%d:%d", hrLater, minLater);
        } else if (hrLater == 24 && minLater > 0 && minLater < 10) {
            System.out.printf("0:0%d", minLater);
        } else if (hrLater == 24 && minLater >= 10) {
            System.out.printf("0:%d", minLater);
        } else {
            System.out.println("0:00");
        }
    }
}
