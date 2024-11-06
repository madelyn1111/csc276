import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(5);
        Triangle triangle = new Triangle(5,5);

        Shape[] shapes = {circle, square, triangle};

        for (Shape shape : shapes) {
            shape.draw();
            shape.calcArea();
            System.out.println("*******************");
        }
    }
}