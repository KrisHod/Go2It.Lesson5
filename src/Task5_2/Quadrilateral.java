package Task5_2;

public class Quadrilateral  extends Polygon{
    private int numberOfEqualSides;

    public Quadrilateral(){}

    public Quadrilateral(double area, double perimeter, int numberOfSides, int numberOfEqualSides) {
        super(area, perimeter, numberOfSides);
        this.numberOfEqualSides = numberOfEqualSides;
    }

    public int getNumberOfEqualSides() {
        return numberOfEqualSides;
    }

    public void setNumberOfEqualSides(int numberOfEqualSides) {
        this.numberOfEqualSides = numberOfEqualSides;
    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "numberOfEqualSides=" + numberOfEqualSides +
                '}';
    }
}
