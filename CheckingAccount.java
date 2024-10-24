// Author: Teresa Spencer
// Date: 10/17/2024
// CSCI 231
// Description: This project contains a bank account family of classes to reinforce derived classes and polymorphism.
// The program will test several bank account types, making deposits and withdrawals
// The program will utilize exception handling

public class CheckingAccount extends Account {
    public CheckingAccount() {
        super();
    }
    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }
    public void withdraw(double amount) throws IllegalAmountException, NoSufficientFundsException { 
        if(amount <= 0) {
            throw new IllegalAmountException("Withdrawal amount must be greater than 0");
        }
        else if(getBalance() >= amount) {
            setBalance(getBalance() - amount);
        }
        else {
            throw new NoSufficientFundsException("Insufficient account balance");
        }
    }
    public String toString() {
        return "Checking Account ID: " + getId() + "\tBalance: " + getBalance();
    }
}
