// Author: Teresa Spencer
// Date: 10/17/2024
// CSCI 231
// Description: This project contains a bank account family of classes to reinforce derived classes and polymorphism.
// The program will test several bank account types, making deposits and withdrawals
// The program will utilize exception handling
public class Teresa_Spencer_Proj12 {
    public static void main(String[] args) {
        // Declare and array of Account named accounts of size 4
        Account[] accounts = {
            new CheckingAccount(),
            new CheckingAccount(1, 1000.0),
            new SavingAccount(),
            new SavingAccount(2, 2000, .05)
        };

        for(Account account : accounts) {
            System.out.println(account);
            account.deposit(1000);
            System.out.println("After depositing $1000: ");
            System.out.println(account);
            account.withdraw(500);
            System.out.println("After withdrawing $500: ");
            System.out.println(account);

            if(account instanceof SavingAccount) {
                SavingAccount sAccount = (SavingAccount) account;
                sAccount.addInterest();
                System.out.println("After adding interest: ");
                System.out.println(sAccount);
            }
            System.out.println();
        }
    }
}