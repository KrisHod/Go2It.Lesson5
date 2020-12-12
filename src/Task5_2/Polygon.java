package Task5_2;

public class Polygon extends Figure {
    private int numberOfSides;

    public Polygon() {

    }

    public Polygon(double area, double perimeter, int numberOfSides) {
        super(area, perimeter);
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                ", numberOfSides=" + numberOfSides +
                '}';
    }
}
