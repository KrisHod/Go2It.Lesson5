package Task5_2;

public class Triangle extends Polygon {
    private boolean isRightTriangle;

    public Triangle(){}

    public Triangle(double area, double perimeter, int numberOfSides, boolean isRightTriangle) {
        super(area, perimeter, numberOfSides);
        this.isRightTriangle = isRightTriangle;
    }

    public boolean isRightTriangle() {
        return isRightTriangle;
    }

    public void setRightTriangle(boolean rightTriangle) {
        isRightTriangle = rightTriangle;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                ", numberOfSides=" + getNumberOfSides() +
                ", isRightTriangle=" + isRightTriangle +
                '}';
    }
}
