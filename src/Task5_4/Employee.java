package Task5_4;

public abstract class Employee extends Person implements CareerMaking {
    private int numWorkingHours;
    private String workPlace;

    public Employee (){

    }

    public Employee(String doB, String name, String placeOfBirth, int numWorkingHours, String workPlace) {
        super(doB, name, placeOfBirth);
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

    public String work() {
        return getClass() + " works at the " + workPlace + " " + numWorkingHours + " a day";
    }

    public abstract String takeLunch();

}
