import java.util.Scanner;

class SalesTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double SALES_TAX_RATE = 0.07;
        final double SENTINEL = -1.0;

        double totalActualPrice = 0, totalSalesTax = 0, totalPrice = 0;
        double price;

        // Ask for first input
        System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
        price = sc.nextDouble();

        while (price != SENTINEL) {
            double actualPrice = price / (1 + SALES_TAX_RATE);
            double salesTaxPrice = price - actualPrice;

            // print actual price and tax
            System.out.printf("Actual Price is: $%.2f, Sales Tax is: $%.2f%n",
                              actualPrice, salesTaxPrice);

            // accumulate totals
            totalActualPrice += actualPrice;
            totalPrice += price;
            totalSalesTax += salesTaxPrice;

            // ask again
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            price = sc.nextDouble();
        }

        // print totals
        System.out.printf("Total Price is: $%.2f%n", totalPrice);
        System.out.printf("Total Actual Price is: $%.2f%n", totalActualPrice);
        System.out.printf("Total Sales Tax is: $%.2f%n", totalSalesTax);
    }
}
