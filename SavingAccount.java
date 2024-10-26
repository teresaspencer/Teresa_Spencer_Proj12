// Author: Teresa Spencer
// Date: 10/17/2024
// CSCI 231
// Description: This project contains a bank account family of classes to reinforce derived classes and polymorphism.
// The program will test several bank account types, making deposits and withdrawals
// The program will utilize exception handling

public class SavingAccount extends Account {
    private double interestRate;
    public SavingAccount() {
        super();
        interestRate = 0.0;
    }
    public SavingAccount(int id, double balance, double interestRate) {
        super(id, balance);
        this.interestRate = interestRate;
    }
    public void setInterestRate(double rate) {
        this.interestRate = rate; }
    public double getInterestRate() {
        return interestRate;
    }
    public void withdraw(double amount) throws AccountException { 
        double sBalance = getBalance();
        if(amount <= 0) {
            throw new IllegalAmountException("Withdrawal amount must be greater than 0");
        }
        else if(sBalance - amount < 500) {
            throw new NoSufficientFundsException("Account balance cannot go below $500");
        }
        else if (sBalance >= amount) {
            setBalance(getBalance() - amount);
        }
    }
    public void addInterest() {
        setBalance(getBalance() * (1 + interestRate));
    }
    public String toString() {
        return "Saving Account ID: " + getId() + "\tBalance: " + getBalance() + 
        "\tInterest Rate: " + interestRate;
    }
}
