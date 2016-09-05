//10. ДСП, която чете цяло число между 1,000 и 999,999, в което хилядите са отделени със запетая и отпечатва цялото число
// без запетая. Входът да се чете като символен низ (да се прихване дължината и да се определи мястото на запетаята)
//Пример: Вход 23,500	----->	Изход 23500

//11.	ДСП, която чете от клавиатурата цяло число между 1000 и 999999 и го отпеатва като поставя запетая за
// разделител на хилядите Пример: Вход 23500		Изход 23,500

package javaMusala;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        //task 10
        removeDecimalSeparator();
        //task 11
        addDecimalSeparator();
    }

    //task 10
    public static void removeDecimalSeparator() {
        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder(in.nextLine());
        System.out.printf("Entry: " + s + " ------> ");
        s.deleteCharAt(s.indexOf(","));
        System.out.printf("Output: " + s);
        System.out.println();
    }

    //task 11

    public static void addDecimalSeparator() {
        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder(in.nextLine());
        System.out.print("Entry: " + s + " ------> ");
        s.insert(s.length() - 3, ",");
        System.out.print("Output: " + s);

    }
}
