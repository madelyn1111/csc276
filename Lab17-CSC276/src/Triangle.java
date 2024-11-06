
public class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Default constructor
    public Triangle() {
        this.base = 0.0;
        this.height = 0.0;
    }

    // Methods
    @Override
    public void draw(){
        System.out.println("Drawing a Triangle...");
    }
    @Override
    public void calcArea(){
        area = (base*height)/2;
        System.out.printf("Area of Triangle: %.2f\n", area);
    }

    // Setters and getters
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
}
