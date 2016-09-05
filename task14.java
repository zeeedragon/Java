//14.	ДСП, която чете две времена във военен формат (за часовете и минутите се използват по две цифри иминутите се
//      залепят директно за часовете). Да се отпечата колко часа и колко мин има между тези две въведени времена
//      Пример: Вход Въведете първо време 0900
//      Въведете второ време 1730
//      Изход Времето между тях е 8 ч и 30 мин

package javaMusala;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //reading start and end; splitting both strings into hrs and minutes and parsing them as int
        String start = in.nextLine();
        String minStart = start.substring(start.length() - 2);
        int minsStart = Integer.parseInt(minStart);
        String hrStart = start.substring(0, start.length() - 2);
        int hrsStart = Integer.parseInt(hrStart);
        String end = in.nextLine();
        String minEnd = end.substring(end.length() - 2);
        int minsEnd = Integer.parseInt(minEnd);
        String hrEnd = end.substring(0, end.length() - 2);
        int hrsEnd = Integer.parseInt(hrEnd);
        //checking the difference between minutes and printing the span
        int difHr = hrsEnd - hrsStart;
        if (minsEnd > minsStart) {
            System.out.println("Time span: " + difHr + "hr(s) and " + (minsEnd - minsStart) + " minutes");
        } else {
            System.out.println("Time span: " + (difHr - 1) + "hr(s) and " + (60 - minsStart + minsEnd) + " minutes");
        }
    }
}
