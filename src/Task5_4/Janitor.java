package Task5_4;

public class Janitor extends Employee{

    public Janitor (){

    }

    public Janitor(String doB, String name, String placeOfBirth, int numWorkingHours, String workPlace) {
        super(doB, name, placeOfBirth, numWorkingHours, workPlace);
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
