package com.xworkz.yono.savings.bank;

public class SavingsAccount extends BankAccount {


    public SavingsAccount() {

    }
    public SavingsAccount(  double minBalance){

    }


    public double getbalance() {
        return 1200;
    }

    public void credit(int amount) {
        this.calculateInterestRate();
    }

    public void calculateInterestRate() {
double interestRate * getbalance();
    }
}
