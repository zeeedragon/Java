package softuni;

import java.util.Scanner;

public class Bricks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bricks = Integer.parseInt(in.nextLine());
        int workers = Integer.parseInt(in.nextLine());
        int barrelSize = Integer.parseInt(in.nextLine());

        int bricksPerCourse = workers * barrelSize;
        int courses = bricks / bricksPerCourse;

        if (courses == 0) {
            System.out.println(1);
        } else if(bricks % bricksPerCourse != 0 ){
            System.out.println(courses + 1);
        } else {
            System.out.println(courses);
        }

    }
}
