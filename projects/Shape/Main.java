package Shape;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(4, 10);

        for (Shape s : shapes) {
            System.out.println("Area of " + s.getName() + " : " + String.format("%.1f", s.area()));
        }
    }
}
