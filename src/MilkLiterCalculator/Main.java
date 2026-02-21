package MilkLiterCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double milkCartonLiters = 3.78;
        final double milkLiterCost = 0.38;
        final double cartonMilkProfit = 0.27;

        System.out.println("==============================");
        System.out.println("Milk liter calculator by Charles Henry M. Tinoy Jr.");
        System.out.println("Program 14. on page 125 (Basic Elements of Java)");
        System.out.println("==============================");

        /**
         * Iyang input is: total amount of milk produced (in liters)
         * Then iyahang outputs is: milk cartons needed (round to nearest integer), cost for producing milk, and profit for producing milk
         */

        System.out.print("Total amount of milk produced: ");
        double totalLiters = scanner.nextDouble();

        double cartonsNeeded = Math.round(totalLiters / milkCartonLiters);
        double producingMilkCost = totalLiters * milkLiterCost;
        double milkProfit = cartonsNeeded * cartonMilkProfit;

        System.out.println("==============================");
        System.out.printf("Milk cartons needed: %.2f\n", cartonsNeeded);
        System.out.printf("Cost for producing milk: %.2f\n", producingMilkCost);
        System.out.printf("Profit for producing milk: %.2f\n", milkProfit);
        System.out.println("==============================");

        scanner.close();
    }
}
