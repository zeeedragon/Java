package softuni;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mark = Double.parseDouble(in.nextLine());
        if(mark >= 5.50) {
            System.out.println("Excellent!");
        }
        in.close();
    }
}
