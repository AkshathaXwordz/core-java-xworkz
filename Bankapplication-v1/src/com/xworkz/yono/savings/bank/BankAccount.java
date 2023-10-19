package com.xworkz.yono.savings.bank;

public class BankAccount {

    private double balance;
    public double getbalance() {
        return balance;
    }
    public void debit(int amount) {

        if (balance > amount) {
            balance = balance - amount;
            System.out.println("The current balance is " + balance);
        }
    }
    public void credit(int amount){

        System.out.println("credit amount");
        this.balance=balance+amount;
    }
    public void transfer(int amount, SavingsAccount benificiaryAccount)
    {
        this.debit(amount);
        benificiaryAccount.credit(amount);
    }
}

