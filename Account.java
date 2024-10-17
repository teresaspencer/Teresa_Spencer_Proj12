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
    public void withdraw(double amount) {}

    public String toString() {
        return "Account ID: " + id + "\tBalance: " + balance;
    }
}

