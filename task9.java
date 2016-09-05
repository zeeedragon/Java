//9.	ДСП, която подсказва на потребителя да въведе буква на устройство, пътя до файла,
// името на файла и неговото разширение и отпечатва пълното име на файла
// (например C: \ Windows \ System \ Readme.txt.)

package javaMusala;

import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        path();
    }

    public static void path() {
        Scanner in = new Scanner(System.in);
        String partition = in.nextLine();
        partition = partition.toUpperCase();
        String path = in.nextLine();
        path.trim();

        //removing trailing slash

        if (path.charAt(path.length() - 1) == '\\') {
            path = path.substring(0, path.length() - 1);
        }

        String fileName = in.nextLine();
        String ext = in.nextLine();

        System.out.println(partition + ":\\" + path + "\\" + fileName + "." + ext);

    }
}
