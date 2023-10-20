package com.qa;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true) {
            try {
                run();
            } catch (Exception e) {
                System.out.println("--- ERROR: Not a valid number. ---\n");
            }
        }
    }

    public static void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your salary below: ");
        double income = scan.nextDouble();
        while (income < 0) {
            System.out.println("--- ERROR: Not a valid income. ---\n");
            System.out.println("Please input your salary below: ");
            income = scan.nextDouble();
        }
        TaxCalculator taxCalc = new TaxCalculator(income);
        System.out.printf("Your take home pay is: £%.2f \n\n", (income - taxCalc.calculateTax()));
    }
}