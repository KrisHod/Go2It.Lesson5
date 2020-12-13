package Task5_4;

public class ClientAdvisor extends Employee implements CareerMaking{
    private int numOfClient;

    public ClientAdvisor (){

    }

    public ClientAdvisor(String doB, String name, String placeOfBirth, int numWorkingHours, String workPlace, int numOfClient) {
        super(doB, name, placeOfBirth, numWorkingHours, workPlace);
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
