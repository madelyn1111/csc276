
public class Rectangle extends Shape implements Colorable{
    private int length;
    private int width;
    private String color;


    // Constructor with length and width
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Constructor for length, width and color
    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    // Default constructor
    public Rectangle(){
        length = 0;
        width = 0;
        color = "null";
    }

    // Overridden interface and parent class methods
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void calculateArea(){
        int area = length * width;
        System.out.println("Area = " + area);
    }

    @Override
    public void getDescription(){
        System.out.println("Rectangle" + "\nHeight- " + length + "\nWidth- " + width);
    }

}
