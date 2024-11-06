
public class Square extends Shape{
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Default constructor
    public Square() {
        side = 0.0;
    }

    // Methods
    @Override
    public void draw(){
        System.out.println("Drawing a Square...");
    }

    @Override
    public void calcArea(){
        area = side * side;
        System.out.printf("Area of Square: %.2f\n", area);
    }

    // Setters and getters
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
}
