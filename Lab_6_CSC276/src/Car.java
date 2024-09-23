public class Car {
    private String make;
    private String model;
    private int speed;

    public String getMake() {
        return make;
    }
    public void setMake(String theMake) {
        make = theMake;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String theModel) {
        model = theModel;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int theSpeed) {
        speed = theSpeed;
    }
    public void displayInfo(){
        System.out.println("Make: " + make + "\nModel: " + model + "\nSpeed: " + speed);
    }
    public static double convertSpeedToMPH (int speedInKmh){
        return speedInKmh * 0.621371;
    }
}
