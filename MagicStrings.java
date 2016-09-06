package softuni;

import java.util.Scanner;

public class MagicStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int diff = Integer.parseInt(in.nextLine());
        String[] letter = {"k", "n", "p", "s"};
        int[] letterValues = {1, 4, 5, 3};
        boolean foundResult = false;

        for (int i1 = 0; i1 < letter.length; i1++) {
            for (int i2 = 0; i2 < letter.length; i2++) {
                for (int i3 = 0; i3 < letter.length; i3++) {
                    for (int i4 = 0; i4 < letter.length; i4++) {
                        for (int i5 = 0; i5 < letter.length; i5++) {
                            for (int i6 = 0; i6 < letter.length; i6++) {
                                for (int i7 = 0; i7 < letter.length; i7++) {
                                    for (int i8 = 0; i8 < letter.length; i8++) {

                                        String wholeSequence = letter[i1] + letter[i2] + letter[i3] +
                                                letter[i4] + letter[i5] + letter[i6] + letter[i7] + letter[i8];

                                        int firstFourLetters = letterValues[i8] + letterValues[i7] + letterValues[i6] + letterValues[i5];
                                        int secondFourLetters = letterValues[i4] + letterValues[i3] + letterValues[i2] + letterValues[i1];

                                        if (firstFourLetters - secondFourLetters == diff || secondFourLetters - firstFourLetters == diff) {
                                            foundResult = true;
                                            System.out.println(wholeSequence);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!foundResult) {
            System.out.println("No");
        }
    }
}
