package Task5_4;

import java.time.LocalDate;

public class ClientAdvisor extends Employee implements Promotionable {
    private int numOfClient;

    public ClientAdvisor (){

    }

    public ClientAdvisor(int year, int month, int day, String name, String placeOfBirth, int numWorkingHours, String workPlace, int numOfClient) {
        super(year, month, day, name, placeOfBirth, numWorkingHours, workPlace);
        this.numOfClient = numOfClient;
    }

    public int getNumOfClient() {
        return numOfClient;
    }

    public void setNumOfClient(int numOfClient) {
        this.numOfClient = numOfClient;
    }

    @Override
    public String takeLunch() {
        return "Client advisor takes a lunch at 12 p.m.";
    }

    @Override
    public String spendFreeTime() {
        return "Client advisor spend the leisure time with the family";
    }

    @Override
    public void makeCareer() {
        System.out.println("Client advisor dreams about Branch manager position");
    }


}
