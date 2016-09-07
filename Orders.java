package softuni;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Orders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        LinkedHashMap<String, TreeMap<String, Integer>> productsInfo = new LinkedHashMap<>();
        String[] input;

        for (int i = 0; i < n; i++) {
            input = in.nextLine().split(" ");
            String customer = input[0];
            int amount = Integer.parseInt(input[1]);
            String product = input[2];

            if (!productsInfo.containsKey(product)) {
                productsInfo.put(product, new TreeMap<String, Integer>());
            }

            int oldAmt = 0;
            TreeMap<String, Integer> info = productsInfo.get(product);

            if (info.containsKey(customer)) {
                oldAmt = info.get(customer);
            }
            info.put(customer, oldAmt + amount);
        }

        for (String prod : productsInfo.keySet()) {
            System.out.print(prod + ": ");
            System.out.println(productsInfo.get(prod).toString()
                    .replace("{", "")
                    .replace("}", "")
                    .replace("=", " "));
        }
    }
}
