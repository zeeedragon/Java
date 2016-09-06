package softuni;

import java.util.Scanner;

public class ExcellentOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mark = Double.parseDouble(in.nextLine());
        System.out.println(mark >= 5.5 ? "Excellent!" : "Not excellent.");
        in.close();
    }
}
