package Corrections;

import java.util.Scanner;

/**
 * Module 3 = Grocery Bill Calculator (CORRECTED)
 * CSC320 Programming
 * 
 * This program calculates the average weekly and monthly grocery bill for a family of four:
 * 
 *      - Prompt the user for the coupon amount as a decimal (example, .10).
 *      - Ensure the value is set to 10% if the value exceeds 100% or is less than or equal to zero.
 *      - Prompt the user for weeks 1-4 grocery bills.
 *      - Calculate the monthly and weekly average for groceries.
 *      - Display monthly total and weekly average without the coupon.
 *      - Display monthly total and weekly average with the coupon.
 */
public class criticalth3_corrected {

    public static void main(String[] args) {

        // Initialize variables
        double couponAmount;
        double validCoupon;
        double week1;
        double week2;
        double week3;
        double week4;
        double monthlyTotalBefore;
        double monthlyTotalAfter;
        double weeklyAvgBefore;
        double weeklyAvgAfter;

        Scanner input = new Scanner(System.in);

        // Corrections:
        // - Improved readability by including title
        // - Clarified coupon validation logic
        // - Validation check to ensure only numeric values are entered

        System.out.println("Grocery Bill Calculator");

        // Coupon input
        System.out.print("Enter the coupon amount as a decimal: ");
        if (!input.hasNextDouble()) {
            System.out.println("Error: Invalid input. Numeric value required.");
            input.close();
            return;
        }
        couponAmount = input.nextDouble();

        // Coupon validation: must be decimal between 0 and 1
        if (couponAmount < 0 || couponAmount > 1.0) {
            validCoupon = 0.10;
            System.out.println("Invalid coupon entered. Defaulting to 0.10 (10%).");
        } else {
            validCoupon = couponAmount;
        }

        // Weekly grocery amounts
        System.out.println("Weekly Grocery Amounts");

        System.out.print("(1) Enter the amount spent on groceries in Week 1: ");
        if (!input.hasNextDouble()) {
            System.out.println("Error: Invalid input. Numeric value required.");
            input.close();
            return;
        }
        week1 = input.nextDouble();

        System.out.print("(2) Enter the amount spent on groceries in Week 2: ");
        if (!input.hasNextDouble()) {
            System.out.println("Error: Invalid input. Numeric value required.");
            input.close();
            return;
        }
        week2 = input.nextDouble();

        System.out.print("(3) Enter the amount spent on groceries in Week 3: ");
        if (!input.hasNextDouble()) {
            System.out.println("Error: Invalid input. Numeric value required.");
            input.close();
            return;
        }
        week3 = input.nextDouble();

        System.out.print("(4) Enter the amount spent on groceries in Week 4: ");
        if (!input.hasNextDouble()) {
            System.out.println("Error: Invalid input. Numeric value required.");
            input.close();
            return;
        }
        week4 = input.nextDouble();

        // Calculations for averages and totals
        monthlyTotalBefore = week1 + week2 + week3 + week4;
        weeklyAvgBefore = monthlyTotalBefore / 4;
        monthlyTotalAfter = monthlyTotalBefore - (monthlyTotalBefore * validCoupon);
        weeklyAvgAfter = monthlyTotalAfter / 4;

        // Grocery bill report
        System.out.println("Grocery Bill Summary");
        System.out.println("You spend " + monthlyTotalBefore + " on groceries every month before coupons are applied.");
        System.out.println("You spend " + weeklyAvgBefore + " on groceries every week before coupons are applied.");
        System.out.println("You spend " + monthlyTotalAfter + " on groceries every month after coupons are applied.");
        System.out.println("You spend " + weeklyAvgAfter + " on groceries every week after coupons are applied.");

        input.close();
    }
}
