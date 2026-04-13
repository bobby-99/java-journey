package Shape;

public class Shape {
    protected double PI = Math.PI;
    private String name;

    public Shape() {
        this("Shape");
    }

    public Shape(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Shape: " + this.name);
    }

    public String getName() {
        return this.name;
    }

    public double area() {
        System.out.println("Area not defined");
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = PI * radius * radius;
        return area;
    }
}

class Rectangle extends Shape {
    private int l, b;

    public Rectangle(int l, int b) {
        super("Rectangle");
        this.l = l;
        this.b = b;
    }

    @Override
    public double area() {
        int area = l * b;
        return area;
    }
}

class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        double area = 0.5 * base * height;
        return area;
    }
}
