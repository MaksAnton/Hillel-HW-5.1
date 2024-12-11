package app;

import java.util.Scanner;

public class Main {

    static final String CURRENCY_USD = "USD";

    // Constants for profit limits
    static final double LIMIT_1 = 0;
    static final double LIMIT_2 = 10000;
    static final double LIMIT_3 = 25000;

    // Constants for tax rates
    static final double TAX_RATE_1 = 0.025; // 2.5%
    static final double TAX_RATE_2 = 0.043; // 4.3%
    static final double TAX_RATE_3 = 0.067; // 6.7%

    static double totalProfit;
    static double taxSum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for profit input
        System.out.println("Enter the sum of profit: ");
        totalProfit = scanner.nextDouble();

        // Calculate tax amount
        if (totalProfit > LIMIT_1 & totalProfit <= LIMIT_2) {
            taxSum = totalProfit * TAX_RATE_1;
        } else if (totalProfit > LIMIT_2 & totalProfit <= LIMIT_3) {
            taxSum = totalProfit * TAX_RATE_2;
        } else if (totalProfit > LIMIT_3) {
            taxSum = totalProfit * TAX_RATE_3;
        }

        // Display the result
        if (totalProfit > LIMIT_1) {
            System.out.printf("Tax of %.2f %S is withheld from your income of %.2f %S",
                    taxSum, CURRENCY_USD, totalProfit, CURRENCY_USD);
        } else {
            System.out.println("You have no income, the tax doesn't apply!!!");
        }
        //close the scanner
        scanner.close();
    }
}
