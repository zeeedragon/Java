package softuni;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double amt = Double.parseDouble(in.nextLine());
        String inputCurrency = in.nextLine();
        String outputCurrency = in.nextLine();

        double result = convertAmt(amt, inputCurrency, outputCurrency);
        System.out.printf("%.2f %s", result, outputCurrency);

        in.close();
    }

    public static double convertAmt(double amount, String inputCurrency, String outputCurrency) {

        if (inputCurrency.equals("BGN")) {
            switch (outputCurrency) {
                case "USD": {
                    return amount / 1.79549;
                }
                case "EUR": {
                    return amount / 1.95583;
                }
                case "GBP": {
                    return amount / 2.53405;
                }
            }
        } else if (inputCurrency.equals("USD")) {
            switch (outputCurrency) {
                case "BGN": {
                    return amount * 1.79549;
                }
                case "EUR": {
                    return (amount * 1.79549) / 1.95583;
                }
                case "GBP": {
                    return (amount * 1.79549) / 2.53405;
                }
            }
        } else if (inputCurrency.equals("GBP")) {
            switch (outputCurrency) {
                case "BGN": {
                    return amount * 2.53405;
                }
                case "USD": {
                    return (amount * 2.53405) / 1.79549;
                }
                case "EUR": {
                    return (amount * 2.53405) / 1.95583;
                }
            }
        } else if (inputCurrency.equals("EUR")) {
            switch (outputCurrency) {
                case "BGN": {
                    return amount * 1.95583;
                }
                case "USD": {
                    return (amount * 1.95583) / 1.79549;
                }
                case "GBP": {
                    return (amount * 1.95583) / 2.53405;
                }
            }
        }
        return 0;
    }
}
