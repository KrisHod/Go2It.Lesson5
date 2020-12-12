package Task5_2;

public class FigureMain {
    public static void main(String[] args) {
        Polygon triangle = new Triangle(14, 6, 3, false);
        Circle circle = new Circle(5.8, 2, 5);
        Figure trapezium = new Trapezium(3.4, 2, 4, 2, true);
        System.out.println(triangle);
        System.out.println(circle);
        System.out.println(trapezium);
    }
}
