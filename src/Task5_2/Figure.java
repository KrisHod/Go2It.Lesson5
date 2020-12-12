package Task5_2;

public class Figure {
    private double area;
    private double perimeter;

    public Figure(){
    }

    public Figure(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
