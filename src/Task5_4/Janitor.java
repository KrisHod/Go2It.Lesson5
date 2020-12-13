package Task5_4;

import java.time.LocalDate;

public class Janitor extends Employee{

    public Janitor (){

    }

    public Janitor(int year, int month, int day, String name, String placeOfBirth, int numWorkingHours, String workPlace) {
        super(year, month, day, name, placeOfBirth, numWorkingHours, workPlace);
    }

    @Override
    public String takeLunch() {
        return "Janitor can take a lunch at any time";
    }

    @Override
    public String spendFreeTime() {
        return "Janitor spends his free time playing video games";
    }
}
