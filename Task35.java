package javaMusala;

//Charlie Able Baker
//output:
//Able
//Baker
//Charlie

import java.util.Arrays;
import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] str = line.split(" ");
        Arrays.sort(str);
        //System.out.println(Arrays.toString(str));
        for (String item : str) {
            System.out.println(item + " ");
        }
    }
}

