package com.example.ex2_java;

public class BankAccount {
    String accountNumber, ownerName;
    double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if (amount>balance){
            balance-=amount;
        }
        else System.out.println("nooooop");
    }
    public double getBalance(){
        return balance;
    }
    public void displayAccountInfo(){
        System.out.println("account number "+accountNumber);
        System.out.println("ownerName "+ownerName);
        System.out.println("current balance "+balance);
    }

}
    class Main1{
    public static void main (String[] args){
        BankAccount account1=new BankAccount("B34241","soufyane",9800.948);
        BankAccount account2=new BankAccount("QB45414","felate",94600.38);

        account1.displayAccountInfo();
        account2.displayAccountInfo();

        account2.deposit(100);
        account1.withdraw(100);

        double balance1 = account1.getBalance();
        double balance2 = account2.getBalance();


        System.out.println("Balance of account1: " + balance1);
        System.out.println("Balance of account2: " + balance2);




    }
}


