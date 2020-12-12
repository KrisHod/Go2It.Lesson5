package Task5_2;

public class Trapezium extends Quadrilateral {
    private boolean hasLineOfSymmetry;

    public Trapezium() {
    }

    public Trapezium(double area, double perimeter, int numberOfSides, int numberOfEqualSides, boolean hasLineOfSymmetry) {
        super(area, perimeter, numberOfSides, numberOfEqualSides);
        this.hasLineOfSymmetry = hasLineOfSymmetry;
    }

    public boolean isHasLineOfSymmetry() {
        return hasLineOfSymmetry;
    }

    public void setHasLineOfSymmetry(boolean hasLineOfSymmetry) {
        this.hasLineOfSymmetry = hasLineOfSymmetry;
    }

    @Override
    public String toString() {
        return "Trapezium{" +
                "area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                ", numberOfSides=" + getNumberOfSides() +
                ", numberOfEqualSides=" + getNumberOfEqualSides() +
                ", hasLineOfSymmetry=" + hasLineOfSymmetry +
                '}';
    }
}
