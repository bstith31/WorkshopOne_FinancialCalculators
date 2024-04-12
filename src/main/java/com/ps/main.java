package com.ps;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select from the flowing calculators:\n" +
                "1. Mortgage Calculator\n" +
                "2. Future Value Calculator\n" +
                "3. Present Value of Annuity\n");

        System.out.print("Which calculator will you be using? ");
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                mortgageCalculator(scanner);
                break;
            case 2:
                futureValueCalculator(scanner);
                break;
            case 3:
                annuityPresentValueCalculator(scanner);
                break;
            default:
                System.out.println("Invalid Calculator");
        }

        scanner.close();


//For later
//Calculator 1
/*
        // User will be importing their information

        public static void mortgageCalculator(Scanner scanner){
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
        }

*/

//Calculator 2
/*

        //User inputs initial CD values

        public static void futureValueCalculator(Scanner scanner){
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
        }

*/

//Calculator 3
/*
        //User inputs their Annuity responses
        public static void annuityPresentValueCalculator(Scanner scanner){
        System.out.print("Enter your monthly payout amount: ");
        double monthlyPayout = scanner.nextDouble();
        System.out.print("Enter your expected interest rate: ");
        float expectedInterestRate = scanner.nextFloat();
        System.out.print("Enter your number of years: ");
        int yearsPayout = scanner.nextInt();

        //Calculations of the inputted data

       double monthlyInterestAnnuity = (expectedInterestRate / 100 / 12);
       int paymentNumbers = (yearsPayout * 12);
       double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyInterestAnnuity, -yearsPayout )) / monthlyInterestAnnuity;

       //Display the results of the annuity

        System.out.printf("Present value of the annuity is: %.2f", presentValue);
        }
*/

    }

    public static void mortgageCalculator(Scanner scanner){
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
    }


//Calculator 2

        //User inputs initial CD values

        public static void futureValueCalculator(Scanner scanner){
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
        }


//Calculator 3

        //User inputs their Annuity responses
        public static void annuityPresentValueCalculator(Scanner scanner){
        System.out.print("Enter your monthly payout amount: ");
        double monthlyPayout = scanner.nextDouble();
        System.out.print("Enter your expected interest rate: ");
        float expectedInterestRate = scanner.nextFloat();
        System.out.print("Enter your number of years: ");
        int yearsPayout = scanner.nextInt();

        //Calculations of the inputted data

       double monthlyInterestAnnuity = (expectedInterestRate / 100 / 12);
       int paymentNumbers = (yearsPayout * 12);
       double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyInterestAnnuity, -yearsPayout )) / monthlyInterestAnnuity;

       //Display the results of the annuity

        System.out.printf("Present value of the annuity is: %.2f", presentValue);
        }
}