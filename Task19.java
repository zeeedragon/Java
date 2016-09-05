package javaMusala;

//Вход 4155551212		Изход (415) 555-1212

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String phone = in.nextLine();
        String code = "(" + phone.substring(0, 3) + ") " + phone.substring(3, 6) + "-" + phone.substring(6);
        System.out.println(code);
    }
}
