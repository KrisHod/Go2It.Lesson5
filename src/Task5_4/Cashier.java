package Task5_4;

import java.time.LocalDate;

public class Cashier extends Employee{

    public Cashier (){

    }

    public Cashier(int year, int month, int day, String name, String placeOfBirth, int numWorkingHours, String workPlace) {
        super(year, month, day, name, placeOfBirth, numWorkingHours, workPlace);
    }

    @Override
    public String takeLunch() {
        return "Cashier takes a lunch at 13 p.m.";
    }

    @Override
    public String spendFreeTime() {
        return "Cashier likes to walk his dog";
    }


    static public String work (){
        return "Cashier works";
    }

}
