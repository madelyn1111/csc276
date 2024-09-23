public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setMake("Toyota");
        c1.setModel("Corolla");
        c1.setSpeed(180);
        Car c2 = new Car();
        c2.setMake("Toyota");
        c2.setModel("Civic");
        c2.setSpeed(200);

        c1.displayInfo();
        c2.displayInfo();

        System.out.printf("Speed of c1 in MPH: %2f ", Car.convertSpeedToMPH(c1.getSpeed()));
        System.out.printf("Speed of c2 in MPH: %2f", Car.convertSpeedToMPH(c2.getSpeed()));


    }
}