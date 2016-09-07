package softuni;

import java.util.Scanner;

public class Largest3Rectangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stringInput = in.nextLine();
        stringInput = stringInput.replaceAll("[^\\d]+", " ");
        String[] stringNumbers = stringInput.split(" ");
        int[] intArray = new int[stringNumbers.length - 1];
        int[] areas = new int[intArray.length / 2];

        for (int i = 1; i < stringNumbers.length; i++) {
            intArray[i - 1] = Integer.parseInt(stringNumbers[i]);

        }

        for (int i = 0, g = 0; i < areas.length; i++, g += 2) {
            areas[i] = intArray[g] * intArray[g + 1];

        }

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < areas.length - 2; i++) {
            int sumAreas = areas[i] + areas[i + 1] + areas[i + 2];
            if (sumAreas > maxArea) {
                maxArea = sumAreas;
            }
        }
        System.out.println(maxArea);
    }
}
