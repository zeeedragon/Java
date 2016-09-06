package softuni;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = in.nextLine();
        String lastName = in.nextLine();
        String age = in.nextLine();
        String town = in.nextLine();
        System.out.printf("You are %s %s, a %s-years old person from %s.", firstName, lastName, age, town);

    }
}
