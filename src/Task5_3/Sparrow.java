package Task5_3;

public class Sparrow extends Bird{
    private boolean isDomestic;

    public Sparrow(){

    }

    public Sparrow(String name, String habitat, int wingspan, boolean isDomestic) {
        super(name, habitat, wingspan);
        this.isDomestic = isDomestic;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    @Override
    public void fly() {
        System.out.println("There are birds that cannot fly");
    }

    @Override
    void eat() {
        System.out.println("Bird nutrition varies greatly by species");
    }

    @Override
    void sleep() {
        System.out.println("They say, many birds can sleep during flight");
    }
}
