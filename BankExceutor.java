package com.xworkz.yono.savings;

import com.xworkz.yono.savings.bank.BankAccount;
import com.xworkz.yono.savings.bank.SavingsAccount;

class BankExceutor {

    public static void main(String[] args) {
            BankAccount myAccount= new SavingsAccount( minBalance: 1000);
            SavingsAccount mysavingAccou
            myAccount.credit(1200);
            myAccount.credit(500);
            myAccount.credit(200);

            SavingsAccount mysavingAccout;
            mysavingAccout = (SavingsAccount)myAccount;
            mysavingAccout.calculateInterestRate();
            System.out.println("Balance after interest rate "+ mysavingAccout);

            System.out.println("Available balance on my account "+ myAccount.getbalance());

            SavingsAccount friendsAccount=new SavingsAccount();
            myAccount.transfer(500,friendsAccount);
            System.out.println("available balance on my friends account "+friendsAccount.getbalance());

            SavingsAccount dadsAccount=new SavingsAccount();
            myAccount.transfer(200,dadsAccount);
            System.out.println("available balance on my dadsAccount "+dadsAccount.getbalance());

            SavingsAccount momsAccount=new SavingsAccount();
            myAccount.transfer(100,momsAccount);
            System.out.println("available balance on my momsAccount "+momsAccount.getbalance());



}
    }


