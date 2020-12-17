package AccountManagingSysterm;

public abstract class Account {
    protected int accNumber;
    protected double balance;
    protected String owner;

    public Account(int accNumber, double balance, String owner) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public abstract boolean canWithdraw (double amount);

    public boolean deposit(double amount){
        balance+=amount;
        System.out.println("Your current balance is " + balance);
        return true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNumber=" + accNumber +
                ", balance=" + balance +
                ", owner='" + owner + '\'' +
                '}';
    }
}
