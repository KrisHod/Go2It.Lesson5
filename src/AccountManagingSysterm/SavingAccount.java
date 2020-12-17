package AccountManagingSysterm;

public class SavingAccount extends Account{
    private double minimumBalance;

    public SavingAccount(int accNumber, double balance, String owner, double minimumBalance) {
        super(accNumber, balance, owner);
        this.minimumBalance = minimumBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    @Override
    public boolean canWithdraw(double amount) {
        if (balance-amount < 0){
            System.out.println("You must have enough money to withdraw");
            return false;
        }
        else {
            balance-=amount;
            return true;
        }
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "accNumber=" + accNumber +
                ", balance=" + balance +
                ", owner='" + owner + '\'' +
                ", minimumBalance=" + minimumBalance +
                '}';
    }

    public boolean isPayingExtraCharge (){
        if (balance < minimumBalance){
            balance-=1.5;
            return true;
        }
        return false;
    }
}
