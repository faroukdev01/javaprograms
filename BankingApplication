package com.DevubTech;

import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Farouk", "018596775400");
        bankAccount.showMenu();
    }

}

class BankAccount {

    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withDraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        }
        else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }
        else {
            System.out.println("No transaction occurred");
        }
    }

    void showMenu() {

        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println("\n");
        System.out.println("A. check Balance");
        System.out.println("B. deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. PreviousTransaction");
        System.out.println("E. exit");

        do {
            System.out.println("====================================================================");
            System.out.println("Enter an option: ");
            System.out.println("====================================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {

                case 'A':
                    System.out.println("====================================");
                    System.out.println("Balance = " + balance);
                    System.out.println("====================================");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("====================================");
                    System.out.println("Enter an amount to deposit: ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println(amount + " deposited into your account");
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("====================================");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("=====================================");
                    int amount2 = scanner.nextInt();
                    withDraw(amount2);
                    System.out.println(amount2 + " has been withdrawn from your account");
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("=========================================");
                    getPreviousTransaction();
                    System.out.println("==================================================");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("**************************");
                    break;

                default:
                    System.out.println("Invalid Option!.. Please try again");
                    break;
            }

        }while (option != 'E');

        System.out.println("Thank you for using our services");

    }
}
