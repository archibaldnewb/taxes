package com.qa;

public class TaxCalculator {
    double[] intervalList = new double[5];
    public TaxCalculator() {}
    public TaxCalculator(double income) {
        populateIntervals(income);
    }
    public double calculateTax() {
        double taxPaid = 0;
        intervalList[0] = 0;
        intervalList[1] *= 0.1;
        intervalList[2] *= 0.15;
        intervalList[3] *= 0.2;
        intervalList[4] *= 0.25;
        for (int i = 0; i < 5 ; i++) {
            taxPaid += intervalList[i];
        }
        return taxPaid;
    }
    private void populateIntervals(double income) {
        double currIncome = income;
        if (currIncome >= 45000) {
            intervalList[4] = currIncome - 45000;
            currIncome -= intervalList[4];
        }
        if (currIncome >= 30000) {
            intervalList[3] = currIncome - 30000;
            currIncome -= intervalList[3];
        }
        if (currIncome >= 20000) {
            intervalList[2] = currIncome - 20000;
            currIncome -= intervalList[3];
        }
        if (currIncome >= 15000) {
            intervalList[1] = currIncome - 15000;
            currIncome -= intervalList[3];
        }
        if (income < 15000) {
            intervalList[0] = currIncome;
        }
    }
}
