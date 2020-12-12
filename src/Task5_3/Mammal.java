package Task5_3;

public abstract class Mammal extends Animal{
    private boolean hasTail;

    public Mammal (){}

    public Mammal(String name, String habitat, boolean hasTail) {
        super(name, habitat);
        this.hasTail = hasTail;
    }

    public abstract void move ();
}
