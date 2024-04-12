/*Write a program that converts an amount in one currency to another based on the user's
choice. The program should prompt the user to enter the amount, the source currency,
and the target currency (e.g., USD to EUR). Use a switch-case statement to handle
different currency conversions.*/
package lp2;
import java.util.Scanner;

public class exp3c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Enter the source currency (USD, EUR, GBP): ");
        String sourceCurrency = scanner.next().toUpperCase();
        System.out.println("Enter the target currency (USD, EUR, GBP): ");
        String targetCurrency = scanner.next().toUpperCase();

        double conversionRate = getConversionRate(sourceCurrency, targetCurrency);
        double convertedAmount = amount * conversionRate;

        System.out.printf("Converted amount: %.2f %s\n", convertedAmount, targetCurrency);
    }

    private static double getConversionRate(String sourceCurrency, String targetCurrency) {
        switch (sourceCurrency + "_" + targetCurrency) {
            case "USD_EUR":
                return 0.92;
            case "USD_GBP":
                return 0.78;
            case "EUR_USD":
                return 1.09;
            case "EUR_GBP":
                return 0.86;
            case "GBP_USD":
                return 1.27;
            case "GBP_EUR":
                return 1.17;
            default:
                return 1.0;
        }
    }
}
