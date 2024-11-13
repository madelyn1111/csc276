
public class Drums extends Instrument {

    // Default Constructor
    public Drums() {
        super("Drums");
    }

    // Constructor
    public Drums(String name){
        super();
    }

    // Overridden Play method
    @Override
    public void play() {
        System.out.println("The drum is being hit in rhythm.");
    }
}
