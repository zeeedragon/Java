package softuni;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mark = Double.parseDouble(in.nextLine());
        mark = Math.abs(mark);
        System.out.println(mark % 2 == 1 ? "odd" : "even");
        in.close();
    }
}
