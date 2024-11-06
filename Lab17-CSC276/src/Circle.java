
public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Default constructor
    public Circle() {
        radius = 0;
    }

    // Methods
    @Override
    public void draw() {
        System.out.println("Drawing a Circle...");
    }

    @Override
    public void calcArea() {
        area = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.2f\n", area);
    }

    // Setters and getters
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
