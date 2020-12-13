package Task5_4;

import java.time.LocalDate;

public class CEO extends Employee {
    private double budgetToOperate;

    public CEO() {

    }

    public CEO(int year, int month, int day, String name, String placeOfBirth, int numWorkingHours, String workPlace, double budgetToOperate) {
        super(year, month, day, name, placeOfBirth, numWorkingHours, workPlace);
        this.budgetToOperate = budgetToOperate;
    }

    public double getBudgetToOperate() {
        return budgetToOperate;
    }

    public void setBudgetToOperate(double budgetToOperate) {
        this.budgetToOperate = budgetToOperate;
    }

    @Override
    public String takeLunch() {
        return "CEO takes lunch at the restaurant";
    }

    @Override
    public String spendFreeTime() {
        return "CEO likes to play tennis";
    }

    @Override
    public void makeCareer() {
        System.out.println("CEO has made a great career");
    }


}
