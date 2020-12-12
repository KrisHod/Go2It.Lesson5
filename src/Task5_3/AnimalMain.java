package Task5_3;

public class AnimalMain {
    public static void main(String[] args) {
        Animal cat = new Cat("Vasya", "home", true, "Siamese");
        Mammal dolphin = new Dolphin("Flipper", "river", true, true);
        Human human = new Human("Vladimir","nature", false, 30);
        Animal snail = new Snail("Kaa", "forest", false);
        Bird sparrow = new Sparrow("Serg", "air", 21, false);

        cat.sleep();
        dolphin.move();
        human.eat();
        snail.sleep();
        sparrow.fly();

    }
}
