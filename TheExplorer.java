package softuni;

import java.util.Arrays;
import java.util.Scanner;

public class TheExplorer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int outerDashesInt = n / 2;
        char[] outerDashesArr = new char[outerDashesInt];
        Arrays.fill(outerDashesArr, '-');

        String firstLastLine = new String(outerDashesArr) + "*" + new String(outerDashesArr);
        System.out.println(firstLastLine);

        int innerDashesInt = 1;
        for (int i = 0; i < n / 2; i++) {
            outerDashesInt--;
            char[] outerDashesLoop = new char[outerDashesInt];
            char[] innerDashesArr = new char[innerDashesInt];
            Arrays.fill(outerDashesLoop, '-');
            Arrays.fill(innerDashesArr, '-');
            String innerDashesString = new String(innerDashesArr);
            String outerDashesString = new String(outerDashesLoop);
            System.out.println(outerDashesString + "*" + innerDashesString + "*" + outerDashesString);
            innerDashesInt += 2;
        }
        innerDashesInt -= 2;
        for (int i = 0; i < n / 2 - 1; i++) {
            outerDashesInt++;
            innerDashesInt -= 2;
            char[] outerDashesLoop = new char[outerDashesInt];
            char[] innerDashesArr = new char[innerDashesInt];
            Arrays.fill(outerDashesLoop, '-');
            Arrays.fill(innerDashesArr, '-');
            String innerDashesString = new String(innerDashesArr);
            String outerDashesString = new String(outerDashesLoop);
            System.out.println(outerDashesString + "*" + innerDashesString + "*" + outerDashesString);
        }

        System.out.println(firstLastLine);
    }
}
