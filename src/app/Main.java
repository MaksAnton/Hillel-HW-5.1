package app;

import java.util.Scanner;

public class Main {

    static final String CURRENCY_USD = "USD";
    static final String PERCENT_SYMBOL = "%";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for profit input
        System.out.println("Enter the sum of profit: ");
        double totalProfit = scanner.nextDouble();

        // Initialize variables
        double taxSum ;
        double interestRate ;
        double limit = 0;

        // Calculate tax amount
        if (totalProfit < 0){
            System.out.println("You have no income, the tax doesn't apply!!!");
        } else if (totalProfit > limit && totalProfit <= (limit = 10000)) {
            interestRate = 2.5;
            taxSum = (totalProfit * interestRate) / 100;
            System.out.printf("%.1f%s tax is withheld from your income of %.2f %s, which is %.2f %s.%n",
                    interestRate, PERCENT_SYMBOL, totalProfit, CURRENCY_USD, taxSum, CURRENCY_USD);
        } else if (totalProfit > limit && totalProfit <= (limit = 25000)) {
            interestRate = 4.3;
            taxSum = (totalProfit * interestRate) / 100;
            System.out.printf("%.1f%s tax is withheld from your income of %.2f %s, which is %.2f %s.%n",
                    interestRate, PERCENT_SYMBOL, totalProfit, CURRENCY_USD, taxSum, CURRENCY_USD);
        } else if (totalProfit > limit) {
            interestRate = 6.7;
            taxSum = (totalProfit * interestRate) / 100;
            System.out.printf("%.1f%s tax is withheld from your income of %.2f %s, which is %.2f %s.%n",
                    interestRate, PERCENT_SYMBOL, totalProfit, CURRENCY_USD, taxSum, CURRENCY_USD);
        }

        // Display the result
//        if (totalProfit > 0) {
//            System.out.printf("%.1f%s tax is withheld from your income of %.2f %s, which is %.2f %s.%n",
//                    interestRate, PERCENT_SYMBOL, totalProfit, CURRENCY_USD, taxSum, CURRENCY_USD);
//        } else {
//            System.out.println("You have no income, the tax doesn't apply!!!");
//        }

        // Close the scanner
        scanner.close();
    }
}
