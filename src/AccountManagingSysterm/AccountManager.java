package AccountManagingSysterm;

import java.util.Arrays;

public class AccountManager {
    static private Account[] AccountList = new Account[100];
    static private int numAccounts = 0;
    static private int maxAccounts = 100;

    public AccountManager() {
    }

    public static Account[] getAccountList() {
        return AccountList;
    }

    public static void setAccountList(Account[] accountList) {
        AccountList = accountList;
    }

    public static int getNumAccounts() {
        return numAccounts;
    }

    public static void setNumAccounts(int numAccounts) {
        AccountManager.numAccounts = numAccounts;
    }

    public static int getMaxAccounts() {
        return maxAccounts;
    }

    public static void setMaxAccounts(int maxAccounts) {
        AccountManager.maxAccounts = maxAccounts;
    }

    @Override
    public String toString() {
        return "AccountManager{" +
                "AccountList=" + Arrays.toString(AccountList) +
                ", numAccounts=" + numAccounts +
                ", maxAccounts=" + maxAccounts +
                '}';
    }

    static public Account[] addAccount(int acNum, String owner, double bal, double minBalance) {
        AccountList[numAccounts] = new SavingAccount(acNum, bal, owner, minBalance);
        numAccounts++;
        return AccountList;
    }

    static public String printAccountDetails(int accNum) {
        for (Account arr : AccountList) {
            if (arr.getAccNumber() == accNum) {
                return arr.toString();
            }
        }

        return "There isn't account with this number";
    }

    static public void listAllAccounts() {
        for (int i = 0; i < numAccounts; i++) {
            System.out.println(AccountList[i]);
        }
    }
}
