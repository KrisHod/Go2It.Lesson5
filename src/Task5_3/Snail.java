package Task5_3;

public class Snail extends Animal{
    private boolean isPoisonous;

    public Snail(){

    }

    public Snail(String name, String habitat, boolean isPoisonous) {
        super(name, habitat);
        this.isPoisonous = isPoisonous;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

    @Override
    void eat() {
        System.out.println("Snakes are predators");
    }

    @Override
    void sleep() {
        System.out.println("Snakes hibernate");
    }
}
