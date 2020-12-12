package Task5_2;

public class Rectangle extends Quadrilateral {

    public Rectangle() {
    }

    public Rectangle(double area, double perimeter, int numberOfSides, int numberOfEqualSides) {
        super(area, perimeter, numberOfSides, numberOfEqualSides);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "\"area=\" + getArea() +\n" +
                "\", perimeter=\" + getPerimeter() +\n" +
                "\", numberOfSides=\" + getNumberOfSides() +\n" +
                "\", numberOfEqualSides=\" + getNumberOfEqualSides() +" +
                "}";
    }
}
