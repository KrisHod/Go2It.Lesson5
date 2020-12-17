package Task5_4;

public class PersonMain {
    public static void main(String[] args) {
        Employee cashier = new Cashier(1987, 3, 30, "John", "USA", 8, "shop");
        Person customer = new Customer(1978, 4, 23, "Kolya", "Ukraine", 1500);
        Employee branch_manager = new BranchManager(1986, 9, 15, "Lidia", "Moldova", 8, "bank", 14);
        Promotionable ceo = new CEO(1985, 5, 1, "Ann", "Canada", 12, "restaurant", 300000);
        Person janitor = new Janitor(1968, 7, 4, "Petya", "Belarussia", 8, "street");

        System.out.println(branch_manager.spendFreeTime());
        branch_manager.makeCareer();
        System.out.println(cashier.work());
        ceo.makeCareer();
        System.out.println(customer.sleep());
        System.out.println(janitor.getDoB());

    }
}
