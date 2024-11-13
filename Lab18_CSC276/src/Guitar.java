
public class Guitar extends Instrument {

    // Default Constructor
    public Guitar() {
        super("Guitar");
    }

    // Constructor
    public Guitar(String name) {
        super(name);
    }

    // Overridden Play method
    @Override
    public void play() {
        System.out.println("The guitar is strumming chords.");
    }

}
