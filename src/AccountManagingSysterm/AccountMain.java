package AccountManagingSysterm;

public class AccountMain {
    public static void main(String[] args) {
        AccountManager.addAccount(2345, "John", 3000, 100);
        AccountManager.addAccount(2346, "Karolina", 8000, 100);
        SavingAccount account = (SavingAccount)AccountManager.getAccountList()[0];
        account.isPayingExtraCharge();

        System.out.println(AccountManager.printAccountDetails(2345));
        AccountManager.listAllAccounts();
    }
}
