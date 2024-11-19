
public class Main {
    public static void main(String[] args) {
        // Regular rectangle object made
        Rectangle r1 = new Rectangle(10, 6 );
        r1.getDescription();
        // Shape object
        Shape r2 = new Rectangle(10, 3, "Green");

        // Colorable object
        Colorable r3 = new Rectangle(40, 6);
        r3.setColor("blue"); // using set color function

        System.out.println("-----------------");
        printShapeDetails(r2); // using shape object in printShapeDetails
        System.out.println("-----------------");
        printShapeDetails((Shape) r3); // casting colorable object to be shape



    }

    public static void printShapeDetails(Shape shape) {
        shape.getDescription();
        shape.calculateArea();
        Colorable dummy = (Colorable) shape;
        System.out.println(dummy.getColor());
    }
}
