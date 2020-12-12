package Task5_3;

public abstract class Bird extends Animal {
    private int wingspan;

    public Bird (){

    }

    public Bird(String name, String habitat, int wingspan) {
        super(name, habitat);
        this.wingspan = wingspan;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public abstract void fly();
}
