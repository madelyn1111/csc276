
public class Drums extends Instrument implements Playable {

    // Constructor
    public Drums(String name){
        super(name);
    }

    // Default constructor
    public Drums(){
        super();
    }

    // Play method from playable
    @Override
    public void play(){
        System.out.println("Beating the Drums");
    }
}
