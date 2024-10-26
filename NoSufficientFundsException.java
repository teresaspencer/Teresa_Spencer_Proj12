// Author: Teresa Spencer
// Date: 10/17/2024
// CSCI 231
// Description: This project contains a bank account family of classes to reinforce derived classes and polymorphism.
// The program will test several bank account types, making deposits and withdrawals
// The program will utilize exception handling

public class NoSufficientFundsException extends AccountException {
    public NoSufficientFundsException(String message) {
        super(message);
    }
}
