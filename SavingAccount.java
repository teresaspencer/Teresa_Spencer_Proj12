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
    public void withdraw(double amount) { 
        double sBalance = getBalance();
        if(sBalance - amount < 500) {
            System.out.println("Account balance cannot go below $500");
        }
        else if(sBalance >= amount) {
            setBalance(getBalance() - amount);
        }
        else {
            System.out.println("Insufficient funds");
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
