package Task5_4;

public class PersonMain {
    public static void main(String[] args) {
        Employee cashier = new Cashier("20-03-1988", "John", "USA", 8, "shop");
        Person customer = new Customer ("12-02-1967", "Kolya", "Ukraine", 1500);
        Employee branch_manager = new BranchManager("13-09-1978", "Lidia", "Moldova", 8, "bank", 14);
        CareerMaking ceo = new CEO("25-06-1990", "Ann", "Canada", 12, "restaurant");

        System.out.println(branch_manager.spendFreeTime());
        branch_manager.makeCareer();
        System.out.println(cashier.eat());
        ceo.makeCareer();
        System.out.println(customer.sleep());
    }
}
