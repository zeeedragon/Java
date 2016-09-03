package softuni;

import java.util.Scanner;

public class SunglassesV2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        //running time
        double start = System.currentTimeMillis();
        //used memory
        double memoryStart = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        String empty = new String(new char[n]);
        empty = empty.replace("\0", " ");
        String asterix = new String(new char[2 * n]).replace("\0", "*");
        String dash = new String(new char[2 * (n - 1)]).replace("\0", "/");
        String bridge = new String(new char[n]).replace("\0", "|");
        //top frame
        System.out.println(asterix + empty + asterix);

        //first line
        for (int i = 0; i < (n - 3) / 2; i++) {
            System.out.println("*" + dash + "*" + empty + "*" + dash + "*");
        }

        //print bridge

        System.out.println("*" + dash + "*" + bridge + "*" + dash + "*");

        //post bridge
        for (int i = 0; i < (n - 3) / 2; i++) {
            System.out.println("*" + dash + "*" + empty + "*" + dash + "*");
        }

        //bottom frame
        System.out.println(asterix + empty + asterix);
        System.out.println("working time: " + (System.currentTimeMillis() - start) / 1000 + "seconds");
        double memoryEnd = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Used memory: " + (memoryEnd - memoryStart) / 1024 / 1024 + "MB");
    }
}
