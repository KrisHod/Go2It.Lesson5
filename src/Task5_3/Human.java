package Task5_3;

public class Human extends Mammal{
    private int age;

    public Human(){

    }


    public Human(String name, String habitat, boolean hasTail, int age) {
        super(name, habitat, hasTail);
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void eat() {
        System.out.println("No song, no supper:-)");
    }

    @Override
    void sleep() {
        System.out.println("People should sleep 8 hours a day");
    }

    @Override
    public void move() {
        System.out.println("Moving is living");
    }
}

