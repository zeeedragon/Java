package softuni;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Biggest3PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        ArrayList<Integer> nums = new ArrayList<>();
        TreeSet<Integer> primes = new TreeSet<>();

        Pattern pat = Pattern.compile("[\\d]+");
        Matcher matcher = pat.matcher(input);

        while (matcher.find()) {
            if (Integer.parseInt(matcher.group()) > 0) {
                nums.add(Integer.parseInt(matcher.group()));
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            if (isPrime(nums.get(i))) {
                primes.add(nums.get(i));
            }
        }
        //System.out.println(primes);


        int sum = 0;
        if (primes.size() < 3) {
            System.out.println("No");
        } else {
            for (int i = 0; i < 3; i++) {
                sum += primes.last();
                primes.remove(primes.last());
            }
            System.out.println(sum);
        }
}

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
