package Task5_3;

public class Dolphin extends Mammal{
private boolean isRiverDolphin;

public Dolphin(){}

    public Dolphin(String name, String habitat, boolean hasTail, boolean isRiverDolphin) {
        super(name, habitat, hasTail);
        this.isRiverDolphin = isRiverDolphin;
    }

    public boolean isRiverDolphin() {
        return isRiverDolphin;
    }

    public void setRiverDolphin(boolean riverDolphin) {
        isRiverDolphin = riverDolphin;
    }

    @Override
    public void move() {
        System.out.println("Dolphins move in the water at a speed of 50 km/h.");
    }

    @Override
    void eat() {
        System.out.println("Dolphins eat fish");
    }

    @Override
    void sleep() {
        System.out.println("Dolphin brain hemispheres sleep in turn");
    }
}
