package Task5_2;

public class Square extends Quadrilateral{

    public Square(){}

    public Square(double area, double perimeter, int numberOfSides, int numberOfEqualSides) {
        super(area, perimeter, numberOfSides, numberOfEqualSides);
    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                ", numberOfSides=" + getNumberOfSides() +
                ", numberOfEqualSides=" + getNumberOfEqualSides() +
                "}";
    }
}
