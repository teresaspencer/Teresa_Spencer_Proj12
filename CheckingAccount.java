public class CheckingAccount extends Account {
    public CheckingAccount() {
        super();
    }
    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }
    public void withdraw(double amount) { 
        if(getBalance() >= amount) {
            setBalance(getBalance() - amount);
        }
        else {
            System.out.println("Insufficient funds");
        }
    }
    public String toString() {
        return "Checking Account ID: " + getId() + "\tBalance: " + getBalance();
    }
}
