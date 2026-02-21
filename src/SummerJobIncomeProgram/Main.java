package SummerJobIncomeProgram;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("==============================");
        System.out.println("Summer job income program by Charles Henry M. Tinoy Jr.");
        System.out.println("Program 16. on page 125 (Basic Elements of Java)");
        System.out.println("==============================");

        /**
         * Gi hardcode lang ko ni, kay walay gi mention ang book regarding sa inputs 😒✌️
         */

        int totalWeeks = 5;
        int totalHours = totalWeeks * (6 * 24);
        double perHour = 15.50;

        double totalTax = 0.14;
        double clothesSpend = 0.10;
        double schoolSupplySpend = 0.01;
        double savingsBondSpend = 0.25;
        double parentsSpend = 0.50;

        double incomeBeforeTax = totalHours * perHour;
        double incomeAfterTax = incomeBeforeTax * (1 - totalTax);

        double totalClothesSpend = incomeAfterTax * clothesSpend;
        double totalSchoolSupplySpend = incomeAfterTax * schoolSupplySpend;

        double totalRemaining = incomeAfterTax - totalClothesSpend - totalSchoolSupplySpend;

        double totalSavingsBondSpend = totalRemaining * savingsBondSpend;
        double totalParentsSpend = totalSavingsBondSpend * parentsSpend;


        System.out.println("Income before tax: " + usFormat.format(incomeBeforeTax));
        System.out.println("Income after tax: " + usFormat.format(incomeAfterTax));

        System.out.println("==============================");
        System.out.println("Total spend on clothes and accessories: " + usFormat.format(totalClothesSpend));
        System.out.println("Total spend on school supplies: " + usFormat.format(totalSchoolSupplySpend));
        System.out.println("Total spend on savings bonds: " + usFormat.format(totalSavingsBondSpend));
        System.out.println("Total parents spend: " + usFormat.format(totalParentsSpend));
        System.out.println("==============================");
    }
}
