package Task5_4;

import java.time.LocalDate;

public abstract class Employee extends Person implements Promotionable {
    private int numWorkingHours;
    private String workPlace;

    public Employee (){

    }

    public Employee(int year, int month, int day, String name, String placeOfBirth, int numWorkingHours, String workPlace) {
        super(year, month, day, name, placeOfBirth);
        this.numWorkingHours = numWorkingHours;
        this.workPlace = workPlace;
    }

    public int getNumWorkingHours() {
        return numWorkingHours;
    }

    public void setNumWorkingHours(int numWorkingHours) {
        this.numWorkingHours = numWorkingHours;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    static public String work() {
        return  "Employee works";
    }

    public abstract String takeLunch();

}
