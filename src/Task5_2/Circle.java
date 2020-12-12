package Task5_2;

public class Circle extends Figure{
    private int diameter;
    private boolean isEllipse;

    public Circle(){}

    public Circle(double area, double perimeter, int diameter) {
        super(area, perimeter);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public boolean isEllipse() {
        return isEllipse;
    }

    public void setEllipse(boolean ellipse) {
        isEllipse = ellipse;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                ", isEllipse=" + isEllipse +
                '}';
    }
}
