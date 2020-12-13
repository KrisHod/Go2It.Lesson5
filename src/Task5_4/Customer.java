package Task5_4;

import java.time.LocalDate;

public class Customer extends Person{
    private int sumForShopping;

    public Customer(){

    }

    public Customer(int year, int month, int day, String name, String placeOfBirth, int sumForShopping) {
        super(year, month, day, name, placeOfBirth);
        this.sumForShopping = sumForShopping;
    }

    public int getSumForShopping() {
        return sumForShopping;
    }

    public void setSumForShopping(int sumForShopping) {
        this.sumForShopping = sumForShopping;
    }

    public int getRemainingSum (int amountSpent){
        return sumForShopping-amountSpent;
    }

    @Override
    public String spendFreeTime() {
        return "In his spare time, the customer likes to spend money";
    }
}
