// Author: Teresa Spencer
// Date: 10/17/2024
// CSCI 231
// Description: This project contains a bank account family of classes to reinforce derived classes and polymorphism.
// The program will test several bank account types, making deposits and withdrawals
// The program will utilize exception handling

public class Account {
    private int id;

    private double balance;

    public Account() { 
        id = 0;
        balance = 0.0;
    }
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void deposit(double amount) { 
        balance += amount;
    }
    public void withdraw(double amount) throws IllegalAmountException, NoSufficientFundsException {}

    public String toString() {
        return "Account ID: " + id + "\tBalance: " + balance;
    }
}

