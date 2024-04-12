package com.ps;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Calculator 1
/*
        // User will be importing their information

        System.out.print("What is the principal value of the mortgage: ");
        double principalMortgage = scanner.nextDouble();
        System.out.print("What is your annual interest rate: ");
        float annualInterestRate = scanner.nextFloat();
        System.out.print("What is the terms of the loan: ");
        int loanLengthYears = scanner.nextInt();

        //Calculation of the given information

        double monthlyInterestRate = (annualInterestRate / 100 / 12);
        int numberOfPayments = (loanLengthYears * 12);
        double monthlyPayment = (principalMortgage * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        double totalPayment = (monthlyPayment*numberOfPayments);
        double totalInterest = (totalPayment - principalMortgage);

        //Display Results

        System.out.printf("Monthly payment: $%.2f ", monthlyPayment);
        System.out.print(String.format("Total interest paid: $%.2f", totalInterest));

        scanner.close();

*/

//Calculator 2
/*

        //User inputs initial CD values

        System.out.print("What was your initial Deposit Amount: ");
        int initialDeposit = scanner.nextInt();
        System.out.print("What is your interest rate: ");
        float futureInterestRate = scanner.nextFloat();
        System.out.print("When will your CD mature: ");
        int cdMaturation = scanner.nextInt();

        //Calculations of the Given information

        double futureValue = initialDeposit * Math.pow(1 + (futureInterestRate / 100), cdMaturation );
        double totalInterestEarned = futureValue - initialDeposit;

        //Display the results of the CD

        System.out.printf("Your future value is: $%.2f ", futureValue);
        System.out.print(String.format("The total amount of interest earned is: $%.2f", totalInterestEarned));


*/










    }
}