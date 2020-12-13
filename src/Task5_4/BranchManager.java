package Task5_4;

public class BranchManager extends Employee{
    private int numOfSubordinates;

    public BranchManager(){

    }

    public BranchManager(String doB, String name, String placeOfBirth, int numWorkingHours, String workPlace, int numOfSubordinates) {
        super(doB, name, placeOfBirth, numWorkingHours, workPlace);
        this.numOfSubordinates = numOfSubordinates;
    }

    public int getNumOfSubordinates() {
        return numOfSubordinates;
    }

    public void setNumOfSubordinates(int numOfSubordinates) {
        this.numOfSubordinates = numOfSubordinates;
    }

    @Override
    public String takeLunch() {
        return "Branch manager have no time for lunch";
    }

    @Override
    public String spendFreeTime() {
        return "Branch manager likes go to swimming pool";
    }

    @Override
    public void makeCareer() {
        System.out.println("Branch manager achieved success in his career. He has " + numOfSubordinates + " subordinates");
    }
}
