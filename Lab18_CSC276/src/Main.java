
public class Main {
    public static void main(String[] args) {
        // Objects
        Guitar guitar = new Guitar();
        Drums drums = new Drums();

        // Outputs
        guitar.tune();
        guitar.play();
        System.out.println("*********************");
        drums.tune();
        drums.play();
    }
}