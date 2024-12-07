
public class Piano extends Instrument implements Playable{

    // Constructor
    public Piano(String name){
        super(name);
    }

    // Default Constructor
    public Piano() {
        super();
    }

    // Play method from playable
    @Override
    public void play() {
        System.out.println("Playing the Piano");
    }
}
