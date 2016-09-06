package softuni;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rad = Double.parseDouble(in.nextLine());
        double deg = rad * 180 / Math.PI;
        System.out.println(Math.round(deg));
        in.close();
    }
}
