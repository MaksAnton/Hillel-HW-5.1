package app;

import java.util.Scanner;

public class Main {

    static final String CURRENCY_USD = "USD";
    static final String PERCENT_SYMBOL = "%";
    // Constants for profit limits
    static double limit1 = 0;
    static double limit2 = 10000;
    static double limit3 = 25000;

    // Constants for tax rates
    static double taxRate1 = 2.5;
    static double taxRate2 = 4.3;
    static double taxRate3 = 6.7;

    static double totalProfit;
    static double taxSum;
    static double interestRate;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for profit input
        System.out.println("Enter the sum of profit: ");
        totalProfit = scanner.nextDouble();

        // Calculate tax amount
        if (totalProfit > limit1 & totalProfit <= limit2) {
            taxSum = (totalProfit * taxRate1) / 100;
            interestRate = taxRate1;
        } else if (totalProfit > limit2 & totalProfit <= limit3) {
            taxSum = (totalProfit * taxRate2) / 100;
            interestRate = taxRate2;
        } else if (totalProfit > limit3) {
            taxSum = (totalProfit * taxRate3) / 100;
            interestRate = taxRate3;
        }

        // Display the result
        if (totalProfit > limit1) {
            System.out.printf("%.1f%s tax is withheld from your income of %.2f %s, which is %.2f%s.",
                    interestRate, PERCENT_SYMBOL, totalProfit, CURRENCY_USD, taxSum, CURRENCY_USD);
        } else {
            System.out.println("You have no income, the tax doesn't apply!!!");
        }
        //System.out.println(interestRate);
        //close the scanner
        scanner.close();
    }
}
