package Task5_4;

public class Cashier extends Employee{

    public Cashier (){

    }

    public Cashier(String doB, String name, String placeOfBirth, int numWorkingHours, String workPlace) {
        super(doB, name, placeOfBirth, numWorkingHours, workPlace);
    }

    @Override
    public String takeLunch() {
        return "Cashier takes a lunch at 13 p.m.";
    }

    @Override
    public String spendFreeTime() {
        return "Cashier likes to walk his dog";
    }
}
