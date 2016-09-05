//13.	ДСП, която чете цяло число и отпечатва неговите цифри на един ред, разделени с по един интервал
//Пример Вход 238092		Изход 2 2 8 0 9 2

package javaMusala;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String numbers = in.nextLine();
        String[] numsAsArray = numbers.split("");

        for (int i = 0; i < numsAsArray.length; i++) {
            System.out.print(numsAsArray[i] + " ");
        }
    }
}
