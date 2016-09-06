package softuni;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.printf("Hello, %s!" , name);
    }
}
