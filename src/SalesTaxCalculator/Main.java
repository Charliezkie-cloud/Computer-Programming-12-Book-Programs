package SalesTaxCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Sales tax calculator by Charles Henry M. Tinoy Jr.");
        System.out.println("Program 13. on page 125 (Basic Elements of Java)");
        System.out.println("==============================");

        /**
         * Iyang inputs kay: Original price, marked-up price percentage, sales tax rate
         * Tas iyahang outputs kay: Original price, marked-up percentage, selling price, sales tax rate, sales tax and final price of the item
         */

        System.out.print("Original price: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Marked-up price (percentage): ");
        double markedUpPercentage = scanner.nextDouble() / 100;

        System.out.print("Sales tax rate (percentage): ");
        double salesTaxRate = scanner.nextDouble() / 100;

        double sellingPrice = originalPrice + (originalPrice * markedUpPercentage);
        double salesTax = sellingPrice * salesTaxRate;
        double finalPrice = sellingPrice + salesTax;

        System.out.println("==============================");
        System.out.printf("Original price: %.2f\n", originalPrice);
        System.out.printf("Marked-up percentage: %.2f%%\n", markedUpPercentage * 100);
        System.out.printf("Selling price: %.2f\n", sellingPrice);
        System.out.printf("Sales tax rate: %.2f%%\n", salesTaxRate * 100);
        System.out.printf("Sales tax: %.2f\n", salesTax);
        System.out.printf("Final price: %.2f\n", finalPrice);
        System.out.println("==============================");
    }
}
