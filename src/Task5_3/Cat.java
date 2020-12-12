package Task5_3;

public class Cat extends Mammal{
    private String breed;

    public Cat(){

    }

    public Cat(String name, String habitat, boolean hasTail, String breed) {
        super(name, habitat, hasTail);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void move() {
        System.out.println("The maximum speed of a domestic cat is 45 km/h");
    }

    @Override
    void eat() {
        System.out.println("Cats eat almost everything");
    }

    @Override
    void sleep() {
        System.out.println("Cats sleep 15 hours a day");
    }
}
