package Task5_4;

public class CEO extends Employee{

    public CEO(){

    }

    public CEO(String doB, String name, String placeOfBirth, int numWorkingHours, String workPlace) {
        super(doB, name, placeOfBirth, numWorkingHours, workPlace);
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
