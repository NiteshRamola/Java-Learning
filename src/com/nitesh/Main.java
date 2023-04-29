package com.nitesh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Principal Amount: ");
            final int principal = scanner.nextInt();

            System.out.print("Interest rate: ");
            final float interestRate = scanner.nextFloat();
            final float monthlyInterestRate = interestRate / 12 / 100;

            System.out.print("Years: ");
            final float noOfPayments = scanner.nextFloat() * 12;

            double result = principal * (monthlyInterestRate * Math.pow(monthlyInterestRate + 1, noOfPayments))
                    / (Math.pow(monthlyInterestRate + 1, noOfPayments) - 1);
            System.out.println("Monthly payment: " + NumberFormat.getCurrencyInstance().format(result));
        } catch (Exception e) {
            System.out.println("Exception found: "+ e);
            throw e;
        }
    }
}