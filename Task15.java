package javaMusala;

//ДСП, която въвежда дадена сума като реално число (25.36)
//и дадените от клиента лева и стотинки (26 лева и 50 ст) и
// определя рестото като реално число с два знака след дес. точка (1.14)

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cost =  Double.parseDouble(in.nextLine());
        String amt = in.nextLine();
        String str = amt.replaceAll("[^-?0-9]", " ");
        List list = Arrays.asList(str.trim().split(" "));
        String amount = list.get(0) + "." + list .get(1);
        Double paid = Double.parseDouble(amount);
        System.out.printf("%.2f", paid - cost);


    }
}
