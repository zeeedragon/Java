package softuni;

import java.util.Scanner;

public class PointOnSegment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = Integer.parseInt(in.nextLine());
        int second = Integer.parseInt(in.nextLine());
        int point = Integer.parseInt(in.nextLine());
        int start = first > second ? second : first;
        int end = first < second ? second : first;

        if (point >= start && point <= end) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }

        int minDiff = Math.abs(start - point) < Math.abs(end - point) ? Math.abs(start - point) : Math.abs(end - point);
        System.out.println(minDiff);
    }
}
