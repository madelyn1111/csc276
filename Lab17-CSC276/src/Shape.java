
public class Shape {
    protected double area;
    protected double perimeter;

    // Constructor
    public Shape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    // Default Constructor
    public Shape() {
        area = 0;
        perimeter = 0;
    }

    // Methods
    public void draw(){
        System.out.println("Drawing a Shape");
    }

    public void calcArea(){
        System.out.println("Don't do this again");
    }

    // Setters and getters
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

}
